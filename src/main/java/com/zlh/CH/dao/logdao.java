package com.zlh.CH.dao;

import com.zlh.CH.entity.logtab;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface logdao extends logBase<logtab>{
    List<logtab> login(String user, String password);
    logtab userInfo(String user);
}
