package com.example.Report_UTRF.Service;

import com.example.Report_UTRF.model.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ReportService {

   List<Report> getAllReport();
  boolean deleteReportById(int rentity_id);
 // Page<Report> findPagination(int page,int size);
}
