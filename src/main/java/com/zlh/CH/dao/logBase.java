package com.zlh.CH.dao;

import com.zlh.CH.entity.logtab;

import java.util.List;

public interface logBase <T>{
    List<T> login (String user, String password);
    T username (String user);

}
