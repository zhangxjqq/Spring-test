package com.zx.controller;

import com.zx.pojo.People;
import com.zx.service.PeopleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Resource
    private PeopleService peopleService;

    //根据ID查询用户
    @GetMapping("/{id}")
    public People getPeopleById(@PathVariable("id") Integer id) {
        return peopleService.getPeopleById(id);
    }


    @GetMapping
    public List<People> getPeople() {
        return peopleService.getPeople();
    }


    @PutMapping
    public void updatePeople(@RequestBody People people) {
        peopleService.updatePeople(people);
    }

    @PostMapping
    public void insetPeople(@RequestBody People people){
        peopleService.insertPeople(people);
    }


    @DeleteMapping("/{id}")
    public void deletePeople(@PathVariable("id") Integer id){
        peopleService.deletePeople(id);
    }
}
