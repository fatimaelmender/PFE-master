package com.example.Report_UTRF.Controller;

import com.example.Report_UTRF.Service.ReportService;
import com.example.Report_UTRF.dao.ReportRepository;
import com.example.Report_UTRF.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200" )
@RestController

public class ReportController {
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private ReportService reportService;
    @GetMapping("/list")
    public List<Report> getAllReport() {

        return reportService.getAllReport();
    }




 @DeleteMapping(value = "/supp/{rentity_id}")
public boolean deleteReport(@PathVariable int rentity_id){
   reportRepository.deleteById(rentity_id);
    return true;
}


}
