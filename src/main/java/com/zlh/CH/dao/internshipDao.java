package com.zlh.CH.dao;

import com.zlh.CH.entity.internship;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface internshipDao extends internshipBase<internship>{
    List<internship> findAll();
    List<internship> findById(int id);
    int deleteById(int id);
}
