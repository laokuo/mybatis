package com.damu.entity;

public class Users {
    private int id;
    private String name;

    public Users() {
    }

    public Users(int id, String username) {
        this.id = id;
        this.name = username;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }
}
