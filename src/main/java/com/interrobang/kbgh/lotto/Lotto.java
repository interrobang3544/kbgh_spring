package com.interrobang.kbgh.lotto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="lotto")
public class Lotto {
    @Column(nullable = false)
    private String totSellamnt;
    @Column(nullable = false)
    private String returnValue;
    @Column(nullable = false)
    private String drwNoDate;
    @Column(nullable = false)
    private String firstWinamnt;
    @Column(nullable = false)
    private String drwtNo6;
    @Column(nullable = false)
    private String drwtNo4;
    @Column(nullable = false)
    private String firstPrzwnerCo;
    @Column(nullable = false)
    private String drwtNo5;
    @Column(nullable = false)
    private String bnusNo;
    @Column(nullable = false)
    private String firstAccumamnt;
    @Id
    @Column(nullable = false, unique = true)
    private String drwNo;
    @Column(nullable = false)
    private String drwtNo2;
    @Column(nullable = false)
    private String drwtNo3;
    @Column(nullable = false)
    private String drwtNo1;
}
