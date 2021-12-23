package com.zlh.CH.dao;

import com.zlh.CH.entity.czlist;
import com.zlh.CH.entity.jobClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface czlistDao extends czlistBase<czlist>{
    List<czlist> findAll();
    List<czlist> findById(int id);
}
