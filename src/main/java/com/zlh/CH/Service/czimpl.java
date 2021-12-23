package com.zlh.CH.Service;

import com.zlh.CH.entity.czlist;

import java.util.List;

public interface czimpl {
    List<czlist> findAll();
    List<czlist> findById(int id);
}
