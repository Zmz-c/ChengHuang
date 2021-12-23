package com.zlh.CH.dao;

import java.util.List;

public interface jobBase <T>{
    List<T> findAll();
    List<T> findById(int id);
    int add(String job,String salary, String Telephone, String requirement);
}
