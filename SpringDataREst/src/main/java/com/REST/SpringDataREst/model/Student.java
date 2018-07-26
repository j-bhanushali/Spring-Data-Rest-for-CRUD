/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.REST.SpringDataREst.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jay
 */
@Entity
public class Student 
{
    @Id
    private int sid;
    private String ename;
    private String tech;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", ename=" + ename + ", tech=" + tech + '}';
    }
    
}
