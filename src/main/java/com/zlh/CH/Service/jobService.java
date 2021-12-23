package com.zlh.CH.Service;

import com.zlh.CH.dao.jobDao;
import com.zlh.CH.entity.jobClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class jobService implements jobimpl{
    @Autowired
    private jobDao jobDao;

    @Override
    public List<jobClass> findAll() {
        return jobDao.findAll();
    }

    @Override
    public List<jobClass> findById(int id) {
        return jobDao.findById(id);
    }

    @Override
    public int add(String job, String salary, String Telephone, String requirement) {
        return jobDao.add(job,salary,Telephone,requirement);
    }
}
