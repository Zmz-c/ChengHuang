package com.zlh.CH.dao;

import java.util.List;

public interface czlistBase <T> {
        List<T> findAll();
        List<T> findById(int id);
}
