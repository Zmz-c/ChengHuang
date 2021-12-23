package com.zlh.CH.Service;

import com.zlh.CH.entity.obituaryTableEntity;

import java.util.List;

public interface obituaryimpl {
    List<obituaryTableEntity> findAll();
    List<obituaryTableEntity> findById(int id);
    int deleteById(int id);
    int updateById(int id,String adder);
    }
