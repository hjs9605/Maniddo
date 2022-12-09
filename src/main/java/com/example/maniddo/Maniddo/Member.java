package com.example.maniddo.Maniddo;

public class Member {
    Long Id;
    String Name;
    String Maniddo;
    Boolean visited = false;

    public Member(Long id, String name) {
        Id = id;
        Name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManiddo() {
        return Maniddo;
    }

    public void setManiddo(String maniddo) {
        Maniddo = maniddo;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }
}