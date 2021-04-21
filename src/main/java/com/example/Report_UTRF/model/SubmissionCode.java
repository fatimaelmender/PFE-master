package com.example.Report_UTRF.model;

public enum SubmissionCode {
    E ("E");
    private final String sname;
    SubmissionCode(String sname){
        this.sname=sname;
    }

    public String getSname() {
        return sname;
    }
}
