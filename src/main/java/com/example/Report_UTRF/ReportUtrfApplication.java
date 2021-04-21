package com.example.Report_UTRF;

import com.example.Report_UTRF.Controller.UsersController;
import com.example.Report_UTRF.Service.ReportService;
import com.example.Report_UTRF.dao.ReportRepository;
import com.example.Report_UTRF.model.Report;
import com.example.Report_UTRF.model.ReportCode;
import com.example.Report_UTRF.model.SubmissionCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ComponentScan
public class ReportUtrfApplication implements CommandLineRunner {

	//private ReportRepository reportRepository;

	//private ReportService reportService;
	public static void main(String[] args) {

		SpringApplication.run(ReportUtrfApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//reportRepository.save(new Report("gggg", ReportCode.AIF, SubmissionCode.E,"jjj",new Date(),"mad","oooo","oppp"));
	}
}
