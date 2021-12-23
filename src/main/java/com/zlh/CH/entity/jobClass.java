package com.zlh.CH.entity;

import lombok.Data;

@Data
public class jobClass {
    private int id;
    private String job;//职位
    private String address;
    private String salary;//薪资
    private int Ghostnumber;//鬼数
    private String requirement;//要求
    private String ascription;//归属
    private String Telephone;//联系方式
    private int Numberofapplicants; //当前申请人数
}
