package com.zlh.CH.Service;

import com.zlh.CH.entity.logtab;

import java.util.List;

public interface logimpl {
    List<logtab> login(String user, String password);
    logtab userInfo(String user);

}
