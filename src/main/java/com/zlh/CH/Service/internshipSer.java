package com.zlh.CH.Service;


import com.zlh.CH.dao.internshipDao;
import com.zlh.CH.entity.internship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class internshipSer implements internshipimpl{
    @Autowired
    private internshipDao dao;

    @Override
    public List<internship> findAll() {
        return dao.findAll();
    }

    @Override
    public List<internship> findById(int id) {
        return dao.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return dao.deleteById(id);
    }
}
