package com.zlh.CH.Service;

import com.zlh.CH.dao.templesalaryDao;
import com.zlh.CH.entity.templesalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class templesalaryService implements templesalaryimpl{
  @Autowired
  private templesalaryDao dao;

    @Override
    public List<templesalary> findAll() {
        return dao.findAll();
    }
}
