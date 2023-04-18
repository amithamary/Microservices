package com.UST.interviewSchedule.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class interview {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String phoneno;
    private String skills;
    private String experience;
    private Date date;
    private String time;
    private String link;
    private String poc;


}
