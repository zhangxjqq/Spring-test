package com.zx.mapper;

import com.zx.pojo.People;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PeopleMapper {
    @Select("select id, username, sex, age, address from people where id=#{id}")
    People getPeopleById(Integer id);

    @Select("select id, username, sex, age, address from people")
    List<People> getPeople();

    void updatePeople(People people);

    @Insert("insert into people(username, sex, age, address) " +
            "value (#{userName},#{sex},#{age},#{address})")
    void insertPeople(People people);

    @Delete("delete from people where id=#{id}")
    void deletePeople(Integer id);
}
