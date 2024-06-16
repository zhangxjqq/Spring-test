package com.zx.service.impl;

import com.zx.mapper.PeopleMapper;
import com.zx.pojo.People;
import com.zx.service.PeopleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public People getPeopleById(Integer id) {
        return peopleMapper.getPeopleById(id);
    }

    @Override
    public List<People> getPeople() {
        return peopleMapper.getPeople();
    }

    @Override
    public void updatePeople(People people) {
        peopleMapper.updatePeople(people);
    }

    @Override
    public void insertPeople(People people) {
        peopleMapper.insertPeople(people);
    }

    @Override
    public void deletePeople(Integer id) {
        peopleMapper.deletePeople(id);
    }
}
