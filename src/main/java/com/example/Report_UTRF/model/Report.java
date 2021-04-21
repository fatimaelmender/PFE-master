package com.example.Report_UTRF.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Report {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int rentity_id;
private String rentity_branch;
@Enumerated(EnumType.STRING)
private ReportCode reportCode;
@Enumerated(EnumType.STRING)
private SubmissionCode submissionCode;
@NotNull
private String entity_reference;
@NotNull
private Date submission_date;
@NotNull
private String currency_code_local;
@NotNull
private String reason;
@NotNull
private String action;

    public Report(String rentity_branch, ReportCode reportCode, SubmissionCode submissionCode, @NotNull String entity_reference, @NotNull Date submission_date, @NotNull String currency_code_local, @NotNull String reason, @NotNull String action) {
        this.rentity_branch = rentity_branch;
        this.reportCode = reportCode;
        this.submissionCode = submissionCode;
        this.entity_reference = entity_reference;
        this.submission_date = submission_date;
        this.currency_code_local = currency_code_local;
        this.reason = reason;
        this.action = action;
    }
}
