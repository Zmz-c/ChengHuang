package com.zlh.CH.dao;

import com.zlh.CH.entity.obituaryTableEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface obituaryDao extends obituaryBase<obituaryTableEntity>{
    List<obituaryTableEntity> findAll();
    List<obituaryTableEntity> findById(int id);
    int deleteById(int id);
    int updateById(int id,String adder);
}
