package com.example.havagas;

import android.widget.TextView;

import java.util.Objects;

public class Formulario {
    private final String nameEt;
    private final String maleRb;
    private final String emailEt;
    private final boolean emailMarketingCb;
    private final String cellphoneEt;
    private final String commercialRb;
    private final String optionalCellphoneEt;
    private final String birthdayEt;
    private final String formationSp;
    private final String formationYearEt;
    private final String conclusionYearSpecialGraduationEt;
    private final String conclusionYearMasterEt;
    private final String intituteEspecialGraduationEt;
    private final String titleMonografiaEt;
    private final String orientadorEt;
    private final String interestVagasEt;

    public Formulario(String nameEt, String maleRb, String emailEt, boolean emailMarketingCb, String cellphoneEt, String commercialRb, String optionalCellphoneEt, String birthdayEt, String formationSp, String formationYearEt, String conclusionYearSpecialGraduationEt, String conclusionYearMasterEt, String intituteEspecialGraduationEt, String titleMonografiaEt, String orientadorEt, String interestVagasEt) {
        this.nameEt = nameEt;
        this.maleRb = maleRb;
        this.emailEt = emailEt;
        this.emailMarketingCb = emailMarketingCb;
        this.cellphoneEt = cellphoneEt;
        this.commercialRb = commercialRb;
        this.optionalCellphoneEt = optionalCellphoneEt;
        this.birthdayEt = birthdayEt;
        this.formationSp = formationSp;
        this.formationYearEt = formationYearEt;
        this.conclusionYearSpecialGraduationEt = conclusionYearSpecialGraduationEt;
        this.conclusionYearMasterEt = conclusionYearMasterEt;
        this.intituteEspecialGraduationEt = intituteEspecialGraduationEt;
        this.titleMonografiaEt = titleMonografiaEt;
        this.orientadorEt = orientadorEt;
        this.interestVagasEt = interestVagasEt;
    }

    public String getNameEt() {
        return nameEt;
    }

    public String getMaleRb() {
        return maleRb;
    }

    public String getEmailEt() {
        return emailEt;
    }

    public boolean isEmailMarketingCb() {
        return emailMarketingCb;
    }

    public String getCellphoneEt() {
        return cellphoneEt;
    }

    public String getCommercialRb() {
        return commercialRb;
    }

    public String getOptionalCellphoneEt() {
        return optionalCellphoneEt;
    }

    public String getBirthdayEt() {
        return birthdayEt;
    }

    public String getFormationSp() {
        return formationSp;
    }

    public String getFormationYearEt() {
        return formationYearEt;
    }

    public String getConclusionYearSpecialGraduationEt() {
        return conclusionYearSpecialGraduationEt;
    }

    public String getConclusionYearMasterEt() {
        return conclusionYearMasterEt;
    }

    public String getIntituteEspecialGraduationEt() {
        return intituteEspecialGraduationEt;
    }

    public String getTitleMonografiaEt() {
        return titleMonografiaEt;
    }

    public String getOrientadorEt() {
        return orientadorEt;
    }

    public String getInterestVagasEt() {
        return interestVagasEt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return emailMarketingCb == that.emailMarketingCb && Objects.equals(nameEt, that.nameEt) && Objects.equals(maleRb, that.maleRb) && Objects.equals(emailEt, that.emailEt) && Objects.equals(cellphoneEt, that.cellphoneEt) && Objects.equals(commercialRb, that.commercialRb) && Objects.equals(optionalCellphoneEt, that.optionalCellphoneEt) && Objects.equals(birthdayEt, that.birthdayEt) && Objects.equals(formationSp, that.formationSp) && Objects.equals(formationYearEt, that.formationYearEt) && Objects.equals(conclusionYearSpecialGraduationEt, that.conclusionYearSpecialGraduationEt) && Objects.equals(conclusionYearMasterEt, that.conclusionYearMasterEt) && Objects.equals(intituteEspecialGraduationEt, that.intituteEspecialGraduationEt) && Objects.equals(titleMonografiaEt, that.titleMonografiaEt) && Objects.equals(orientadorEt, that.orientadorEt) && Objects.equals(interestVagasEt, that.interestVagasEt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEt, maleRb, emailEt, emailMarketingCb, cellphoneEt, commercialRb, optionalCellphoneEt, birthdayEt, formationSp, formationYearEt, conclusionYearSpecialGraduationEt, conclusionYearMasterEt, intituteEspecialGraduationEt, titleMonografiaEt, orientadorEt, interestVagasEt);
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nameEt='" + nameEt + '\'' +
                ", maleRb='" + maleRb + '\'' +
                ", emailEt='" + emailEt + '\'' +
                ", emailMarketingCb=" + emailMarketingCb +
                ", cellphoneEt='" + cellphoneEt + '\'' +
                ", commercialRb='" + commercialRb + '\'' +
                ", optionalCellphoneEt='" + optionalCellphoneEt + '\'' +
                ", birthdayEt='" + birthdayEt + '\'' +
                ", formationSp='" + formationSp + '\'' +
                ", formationYearEt='" + formationYearEt + '\'' +
                ", conclusionYearSpecialGraduationEt='" + conclusionYearSpecialGraduationEt + '\'' +
                ", conclusionYearMasterEt='" + conclusionYearMasterEt + '\'' +
                ", intituteEspecialGraduationEt='" + intituteEspecialGraduationEt + '\'' +
                ", titleMonografiaEt='" + titleMonografiaEt + '\'' +
                ", orientadorEt='" + orientadorEt + '\'' +
                ", interestVagasEt='" + interestVagasEt + '\'' +
                '}';
    }
}
