package com.jobbase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "SignUp")
@Getter
@Setter

public class SignUp {
    @Id
    @GeneratedValue
    private long signUpId;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String email;
    private String firstName;
    private String lastName;

    public SignUp(UserRole role, String email, String firstName, String lastName) {
        this.role = role;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
