package com.zlh.CH.dao;

import com.zlh.CH.entity.jobClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface jobDao extends jobBase<jobClass>{
    List<jobClass> findAll();
    List<jobClass> findById(int id);
    int add(String job,String salary, String Telephone, String requirement);
}
