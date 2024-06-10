package com.yarlung.entity;

public class User
{
    private Integer id;
    private String account;
    private String pwd;
    private String name;
    private Integer role;
    private Integer permission;
    private Integer section;
    private String department;
    private String workshop;
    private String postName;
    private String workName;
    private String workNumber;

    public String getDepartment()
    {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getWorkshop() {
        return this.workshop;
    }
    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
    public String getPostName() {
        return this.postName;
    }
    public void setPostName(String postName) {
        this.postName = postName;
    }
    public String getWorkName() {
        return this.workName;
    }
    public void setWorkName(String workName) {
        this.workName = workName;
    }
    public String getWorkNumber() {
        return this.workNumber;
    }
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAccount() {
        return this.account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPwd() {
        return this.pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSection() {
        return this.section;
    }
    public void setSection(Integer section) {
        this.section = section;
    }
    public Integer getRole() {
        return this.role;
    }
    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getPermission() {
        return this.permission;
    }
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public String toString()
    {
        return "{id:" + this.id + ", account:'" + this.account + "', pwd:'" + this.pwd + "', name:'" + this.name + "', role:" + this.role + ", permission:" + this.permission + ", section:" + this.section + "}";
    }
}