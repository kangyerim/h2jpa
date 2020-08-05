package com.htwojpa.web.titanic;

import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pass_id")
    private Long passId;

    @Column(name = "passenger_id") private String passengerId;
    @Column(name = "survived") private String survived;
    @Column(name = "pclass") private String pclass;
    @Column(name = "name") private String name;
    @Column(name = "sex") private String sex;
    @Column(name = "age") private String age;
    @Column(name = "sib_sp") private String sibSp;
    @Column(name = "parch") private String parch;
    @Column(name = "ticket") private String ticket;
    @Column(name = "fare") private String fare;
    @Column(name = "cabin") private String cabin;
    @Column(name = "embarked") private String embarked;

    @Builder
    private Passenger(String passengerId, String survived,String pclass,
                      String name, String sex, String age, String sibSp,
                      String parch, String ticket, String fare, String cabin,
                      String embarked) {
        this.passengerId = passengerId;
        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibSp = sibSp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
    }
}
