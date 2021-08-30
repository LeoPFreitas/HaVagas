package com.example.havagas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEt;
    private EditText emailEt;
    private CheckBox emailMarketingCb;
    private EditText cellphoneEt;
    private RadioButton commercialRb;
    private RadioButton residentialRb;
    private TextView addCellphoneTv;
    private LinearLayout optionalCellphoneLl;
    private EditText optionalCellphoneEt;
    private RadioButton maleRb;
    private RadioButton femaleRb;
    private EditText birthdayEt;
    private Spinner formationSp;
    private LinearLayout fundamentalLl;
    private EditText formationYearEt;
    private LinearLayout especialGraduationLl;
    private EditText conclusionYearSpecialGraduationEt;
    private EditText intituteEspecialGraduationEt;
    private LinearLayout masterLl;
    private EditText conclusionYearMasterEt;
    private EditText institutionMasterEt;
    private EditText orientadorEt;
    private EditText titleMonografiaEt;
    private EditText interestVagasEt;
    private Button limparBt;
    private Button salvarBt;

    private ArrayList<String> formacaoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();


        formacaoList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.formation)));
        ArrayAdapter<String> formacaoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, formacaoList);
        formationSp.setAdapter(formacaoAdapter);

        formationSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicao, long id) {
                if (formacaoList.get(posicao).equals("Fundamental") || formacaoList.get(posicao).equals("Médio")) {
                    fundamentalLl.setVisibility(View.VISIBLE);
                    especialGraduationLl.setVisibility(View.GONE);
                    masterLl.setVisibility(View.GONE);
                } else if (formacaoList.get(posicao).equals("Graduação") || formacaoList.get(posicao).equals("Especialização")) {
                    fundamentalLl.setVisibility(View.GONE);
                    especialGraduationLl.setVisibility(View.VISIBLE);
                    masterLl.setVisibility(View.GONE);
                } else {
                    fundamentalLl.setVisibility(View.GONE);
                    especialGraduationLl.setVisibility(View.GONE);
                    masterLl.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                fundamentalLl.setVisibility(View.GONE);
                especialGraduationLl.setVisibility(View.GONE);
                masterLl.setVisibility(View.GONE);
            }
        });

        addCellphoneTv.setOnClickListener(view -> {
            if (optionalCellphoneLl.getVisibility() == View.GONE) {
                optionalCellphoneLl.setVisibility(View.VISIBLE);
            } else {
                optionalCellphoneLl.setVisibility(View.GONE);
            }
        });
    }

    private void bindView() {
        nameEt = findViewById(R.id.nameEt);
        emailEt = findViewById(R.id.emailEt);
        emailMarketingCb = findViewById(R.id.emailMarketingCb);
        cellphoneEt = findViewById(R.id.cellphoneEt);
        commercialRb = findViewById(R.id.commercialRb);
        residentialRb = findViewById(R.id.residentialRb);
        addCellphoneTv = findViewById(R.id.addCellphoneTv);
        optionalCellphoneLl = findViewById(R.id.optionalCellphoneLl);
        optionalCellphoneEt = findViewById(R.id.optionalCellphoneEt);
        maleRb = findViewById(R.id.maleRb);
        femaleRb = findViewById(R.id.femaleRb);
        birthdayEt = findViewById(R.id.birthdayEt);
        formationSp = findViewById(R.id.formationSp);
        fundamentalLl = findViewById(R.id.fundamentalLl);
        formationYearEt = findViewById(R.id.formationYearEt);
        especialGraduationLl = findViewById(R.id.especialGraduationLl);
        conclusionYearSpecialGraduationEt = findViewById(R.id.conclusionYearSpecialGraduationEt);
        intituteEspecialGraduationEt = findViewById(R.id.intituteEspecialGraduationEt);
        masterLl = findViewById(R.id.masterLl);
        conclusionYearMasterEt = findViewById(R.id.conclusionYearMasterEt);
        institutionMasterEt = findViewById(R.id.institutionMasterEt);
        orientadorEt = findViewById(R.id.orientadorEt);
        titleMonografiaEt = findViewById(R.id.titleMonografiaEt);
        interestVagasEt = findViewById(R.id.interestVagasEt);
        limparBt = findViewById(R.id.limparBt);
        salvarBt = findViewById(R.id.salvarBt);

        limparBt.setOnClickListener(this);
        salvarBt.setOnClickListener(this);
    }

    private void clearFields() {
        nameEt.setText("");
        emailEt.setText("");
        emailMarketingCb.setChecked(false);
        cellphoneEt.setText("");
        commercialRb.setChecked(true);
        optionalCellphoneLl.setVisibility(View.GONE);
        maleRb.setChecked(true);
        birthdayEt.setText("");
        especialGraduationLl.setVisibility(View.GONE);
        masterLl.setVisibility(View.GONE);
        fundamentalLl.setVisibility(View.GONE);
        interestVagasEt.setText("");
    }


    @Override
    public void onClick(View view) {
        Formulario form = build();
        String message = form.toString();
        if (view.getId() == R.id.salvarBt) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.limparBt) {
            clearFields();
        }
    }

    public Formulario build() {
        String name = nameEt.getText().toString();
        String sex = maleRb.isChecked() ? "Masculino" : "Feminino";
        String mail = emailEt.getText().toString();
        boolean emailMarketing = emailMarketingCb.isChecked();
        String cellphone = cellphoneEt.getText().toString();
        String cellphoneType = commercialRb.isChecked() ? "Comercial" : "Residencial";
        String optionalCellphone = optionalCellphoneEt.getText().toString();
        String birthday = birthdayEt.getText().toString();
        String formation = ((TextView) formationSp.getSelectedView()).getText().toString();
        String formationYear = formationYearEt.getText().toString();
        String conclusionYearSpecialGraduation = conclusionYearSpecialGraduationEt.getText().toString();
        String conclusionYearMaster = conclusionYearMasterEt.getText().toString();
        String intituteEspecialGraduation = intituteEspecialGraduationEt.getText().toString();
        String titleMonografia = titleMonografiaEt.getText().toString();
        String orientador = orientadorEt.getText().toString();
        String interestVagas = interestVagasEt.getText().toString();

        return new Formulario(name, sex, mail, emailMarketing, cellphone, cellphoneType, optionalCellphone, birthday, formation, formationYear, conclusionYearSpecialGraduation, conclusionYearMaster, intituteEspecialGraduation, titleMonografia, orientador, interestVagas);
    }
}