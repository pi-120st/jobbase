package com.jobbase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
    private float expirience;
    private String schedule;

    public Resume(User user, String specialization, float expirience, String schedule) {
        this.user = user;
        this.specialization = specialization;
        this.expirience = expirience;
        this.schedule = schedule;
    }
}
