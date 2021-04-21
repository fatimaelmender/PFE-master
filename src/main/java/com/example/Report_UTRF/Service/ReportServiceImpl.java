package com.example.Report_UTRF.Service;

import com.example.Report_UTRF.dao.ReportRepository;
import com.example.Report_UTRF.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportServiceImpl implements ReportService{
@Autowired
private ReportRepository reportRepository;
@Autowired
private ReportService reportService;
    @Override
    public List<Report> getAllReport() {
             return reportRepository.findAll();
    }


@Override
   public boolean deleteReportById(int rentity_id) {
       this.reportRepository.deleteById(rentity_id);
       return true;
   }


}
