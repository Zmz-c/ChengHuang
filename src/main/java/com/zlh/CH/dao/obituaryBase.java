package com.zlh.CH.dao;

import java.util.List;
public interface obituaryBase<T> {
    List<T> findAll();
    List<T> findById(int id);
    int deleteById(int id);
    int updateById(int id,String adder);
}
