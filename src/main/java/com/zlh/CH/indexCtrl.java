package com.zlh.CH;
import com.zlh.CH.Service.*;
import com.zlh.CH.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class indexCtrl {
    obituaryTableEntity obituarytable = new obituaryTableEntity();
    @Autowired
    private obituaryimpl service;

    @Autowired
    private templesalaryimpl ts;

    @Autowired
    private jobimpl job;

    @Autowired
    private czimpl czs;

    @Autowired
    private internshipimpl sx;

    @RequestMapping("/")
    public String index(Model mod){
        return "index";
    }

    @RequestMapping("job")
    public String job(Model mod){
        List<jobClass> list = job.findAll();
        mod.addAttribute("list",list);
        return "job";
    }

    @RequestMapping("mfjg")
    @ResponseBody
    public List<templesalary> mfjg(){
        return ts.findAll();
    }

    @RequestMapping("/login1")
    public String login1(){
        return "login";
    }

    @RequestMapping("test")
    @ResponseBody
    public List<obituaryTableEntity> test(){
        return service.findAll();
    }

    @RequestMapping("ssbInfo") //庙宇进供
    public String ssbInfo(){
        return "obituary";
    }

    @RequestMapping("mjg") //庙宇进供
    public String mjg(){
        return "tmplesalary";
    }

    @RequestMapping("czlb")
    public String czlb(Model mod){
        List<czlist> list = czs.findAll();
        mod.addAttribute("list",list);
        return "czlist";
    }

    @RequestMapping("sx")
    public String sx(){
        return "sx";
    }

    @RequestMapping("lhlist")
    public String lhlist(){
        return "lhlist";
    }


    @RequestMapping("sxs")
    @ResponseBody
    public List<internship> sxs(){
        return sx.findAll();
    }

    @RequestMapping("sxdel")
    @ResponseBody
    public int sxdel(int id){
        return sx.deleteById(id);
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(int id){
        System.out.println(id);
        return  service.deleteById(id);
    }
    @RequestMapping("update")
    @ResponseBody
    public int update(int id, String adder){
        return  service.updateById(id,adder);
    }

    @RequestMapping("addzw")
    @ResponseBody
    public int addzw(String job1, String salary, String Telephone, String requirement){
        return job.add(job1,salary,Telephone,requirement);
    }
}
