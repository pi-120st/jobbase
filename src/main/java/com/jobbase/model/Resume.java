package com.jobbase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "Resume")
@Getter
@Setter
public class Resume {

    @Id
    @GeneratedValue
    private long resumeId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    private String specialization;
    private float experience;
    private String schedule;
    private Date creationDate;
    private Currency salary;
    private String resumeText;


    public Resume(User user, String specialization, float experience, String schedule, Date creationDate, Currency salary, String resumeText) {
        this.user = user;
        this.specialization = specialization;
        this.experience = experience;
        this.schedule = schedule;
        this.creationDate = creationDate;
        this.salary = salary;
        this.resumeText = resumeText;
    }
}
