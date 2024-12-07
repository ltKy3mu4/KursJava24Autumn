package ru.mpei.l7.annoexamples;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HumanNpc {
    private String name;
    private double health;
    private int age;
    private double damage;
    private float[][] arr;
}
