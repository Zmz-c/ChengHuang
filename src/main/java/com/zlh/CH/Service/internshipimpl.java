package com.zlh.CH.Service;

import com.zlh.CH.entity.internship;

import java.util.List;

public interface internshipimpl {
    List<internship> findAll();
    List<internship> findById(int id);
    int deleteById(int id);
}
