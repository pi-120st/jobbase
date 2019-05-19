package com.jobbase.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "User")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String name;
    private String surname;
    private String email;
    private String password;
    private Date birthday;
    private String city;
    private int mobile;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Resume> resume = new ArrayList<Resume>();

    public User(int id, String name, String surname, String email, String password, Date birthday, String city, int mobile, UserRole role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.city = city;
        this.mobile = mobile;
        this.role = role;
    }
}
