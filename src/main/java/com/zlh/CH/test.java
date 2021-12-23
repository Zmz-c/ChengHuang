package com.zlh.CH;

import com.zlh.CH.Service.logimpl;
import com.zlh.CH.entity.logtab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class test {
    @Autowired
    private logimpl log;
    logtab user = new logtab();

    private void log(){


    }
}
