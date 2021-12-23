package com.zlh.CH.Service;

import com.zlh.CH.entity.templesalary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface templesalaryimpl {
    List<templesalary> findAll();
}
