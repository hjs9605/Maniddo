package com.example.maniddo.Maniddo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    Long Id;
    String Name;
    String Maniddo;
    String Email;
    private Long id;

    @Builder
    public Member(Long id, String name, String email) {
        Id = id;
        Name = name;
        Email = email;
    }
}