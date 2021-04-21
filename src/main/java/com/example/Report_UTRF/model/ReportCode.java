package com.example.Report_UTRF.model;

public enum ReportCode {
    AIF ("AIF"),
    IRD ("IRD"),
    IRI ("IRI"),
    ISR_R ("ISR-R"),
    ISR_S ("ISR-S"),
    L1988 ("L1988"),
    L1989 ("L1989") ,
    ORI ("ORI"),
    SIR ("SIR"),
    STR ("STR"),
    STR_A ("STR_A"),
    TCO ("TCO"),
    TFR ("TFR"),
    TFR_A ("TFR_A");
    private final String name;
            ReportCode(String name){
                this.name=name;
            }

    public String getName() {
        return name;
    }
}
