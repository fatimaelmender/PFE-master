package com.example.Report_UTRF.Controller;

import com.example.Report_UTRF.Service.ReportService;
import com.example.Report_UTRF.model.Report;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins =".*" )
@RestController


public class UsersController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/")
    public String login(){

        return "You are Authenticated";
    }

    /* @GetMapping("/user")
    public String user(){

        return "welcome user";
    }
    @GetMapping("/admin")
    public String admin(){

        return "welcome admin";
    }*/
}
