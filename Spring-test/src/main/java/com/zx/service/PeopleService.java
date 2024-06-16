package com.zx.service;

import com.zx.pojo.People;

import java.util.List;

public interface PeopleService {
    People getPeopleById(Integer id);

    List<People> getPeople();

    void updatePeople(People people);

    void insertPeople(People people);

    void deletePeople(Integer id);
}
