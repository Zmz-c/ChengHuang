package com.zlh.CH.dao;

import com.zlh.CH.entity.templesalary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface templesalaryDao extends templesalaryBase<templesalary> {
    List<templesalary> findAll();
}
