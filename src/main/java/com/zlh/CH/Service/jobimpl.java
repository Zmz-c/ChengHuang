package com.zlh.CH.Service;

import com.zlh.CH.entity.jobClass;

import java.util.List;

public interface jobimpl {
    List<jobClass> findAll();
    List<jobClass> findById(int id);
    int add(String job,String salary, String Telephone, String requirement);
}
