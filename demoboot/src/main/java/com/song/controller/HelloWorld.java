package com.song.controller;

import com.song.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: songlijun
 * @Date: 2020/6/5
 * @Description: com.song.controller
 * @version: 1.0
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,Object> showHelloWorld(){
        Map<String,Object> map = new HashMap<>() ;
        map.put("msg","HelloWorld");
        return map;
    }

    @RequestMapping("/show")
    public String  showMes(Model model){
        List<User> list = new ArrayList();
        list.add(new User("AAA",11,"m"));
        list.add(new User("BBB",22,"w"));
        list.add(new User("CCC",33,"m"));
        model.addAttribute("list",list);
        return "showMessage";
    }

    @RequestMapping("/showLeaf")
    public String showLeaf(Model model){
        model.addAttribute("msg","leaf 的信息");
        return "showLeaf";
    }
}
