package com.song.controller;

import com.song.pojo.People;
import com.song.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Auther: songlijun
 * @Date: 2020/6/6
 * @Description: com.song.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/people")
public class PeopleController {
    @Resource
    private PeopleService peopleService;

    //    页面跳转,用的restful风格
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/addPeople")
    public String addPeople(People p){
        peopleService.addPeople(p);
        return "ok";
    }
}
