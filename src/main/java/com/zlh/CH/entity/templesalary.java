package com.zlh.CH.entity;

import lombok.Data;

@Data
public class templesalary {
    private String templeName;
    private int salary;
    private String address;
    private String remarks;  //备注
    private String templewish; //庙祝
    private String merits;//功德
    private String remittanceBank;//汇款银行
    private int id;//唯一id
    private String data;//冥府时间
    private String warehousing;//入库

}
