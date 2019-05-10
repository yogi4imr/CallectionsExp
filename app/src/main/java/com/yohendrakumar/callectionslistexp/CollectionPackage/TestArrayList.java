package com.yohendrakumar.callectionslistexp.CollectionPackage;

import com.yohendrakumar.callectionslistexp.Models.Person;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    private List<Person> personList = new ArrayList<>();

    Person p1=new Person("name1", "city1", "mobile1", "name1@domain.com", 8000);
    Person p2=new Person("name2", "city2", "mobile2", "name2@domain.com", 3000);
    Person p3=new Person("name3", "city3", "mobile3", "name3@domain.com", 17000);
    Person p4=new Person("name4", "city4", "mobile4", "name4@domain.com", 4000);
    Person p5=new Person("name5", "city5", "mobile5", "name5@domain.com", 12000);

    public List<Person> getPersonList() {
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        return personList;
    }
}
