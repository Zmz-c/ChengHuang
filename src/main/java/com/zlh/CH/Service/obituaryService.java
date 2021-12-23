package com.zlh.CH.Service;

import com.zlh.CH.dao.obituaryDao;
import com.zlh.CH.entity.obituaryTableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public  class obituaryService implements obituaryimpl{
@Autowired
private obituaryDao obituaryDao;
    @Override
    public List<obituaryTableEntity> findAll() {
        return obituaryDao.findAll();
    }

    @Override
    public List<obituaryTableEntity> findById(int id) {
        return obituaryDao.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return obituaryDao.deleteById(id);
    }

    @Override
    public int updateById(int id, String adder) {
        return obituaryDao.updateById(id,adder);
    }

}