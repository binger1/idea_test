package com.song.service.impl;

import com.song.mapper.PeopleMapper;
import com.song.pojo.People;
import com.song.service.PeopleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Auther: songlijun
 * @Date: 2020/6/6
 * @Description: com.song.service.impl
 * @version: 1.0
 */
@Service
@Transactional   //表示这个类下所有的方法都是受事务控制的
public class PeopleServiceImpl implements PeopleService {
    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public void addPeople(People p) {
        peopleMapper.insertPeople(p);
    }
}
