package com.example.Report_UTRF.dao;

import com.example.Report_UTRF.model.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ReportRepository extends JpaRepository<Report,Integer> {

}
