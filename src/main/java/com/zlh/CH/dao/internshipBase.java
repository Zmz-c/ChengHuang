package com.zlh.CH.dao;

import java.util.List;

public interface internshipBase <T>{
    List<T> findAll();
    List<T> findById(int id);
    int deleteById(int id);
}
