package com.zlh.CH.Service;

import com.zlh.CH.dao.czlistDao;
import com.zlh.CH.entity.czlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class czServ implements czimpl {
    @Autowired
    private czlistDao dao;
    @Override
    public List<czlist> findAll() {
        return dao.findAll();
    }

    @Override
    public List<czlist> findById(int id) {
        return null;
    }

}
