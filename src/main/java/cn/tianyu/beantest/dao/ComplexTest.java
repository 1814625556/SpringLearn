package cn.tianyu.beantest.dao;

import java.util.*;

public class ComplexTest {
    private String name;
    private Integer age;
    private Date birthDay;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void saveComplex()
    {
        System.out.println(name+","+age+","+birthDay.toString());
    }

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;


    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }


    public void setMyList(List<String> myList) {
        this.myList = myList;
    }


    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }


    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }


    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }


    public void saveCustomer() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}
