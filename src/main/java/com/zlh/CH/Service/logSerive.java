package com.zlh.CH.Service;

import com.zlh.CH.dao.logdao;
import com.zlh.CH.entity.logtab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class logSerive implements logimpl{
    @Autowired
    private logdao logdao;
    @Override
    public List<logtab> login(String user, String password) {
        return logdao.login(user,password);
    }

    @Override
    public logtab userInfo(String user) {
        return logdao.userInfo(user);
    }




}
