package com.gjl.prototype;

import java.util.List;

/**
 * @author gjl
 * @create 2019-03-17 12:05
 **/
public class Phone {
    private String name;
    private Integer type;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
