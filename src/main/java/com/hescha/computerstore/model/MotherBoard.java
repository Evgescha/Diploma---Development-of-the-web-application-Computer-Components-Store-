package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class MotherBoard extends Product{
    private String socket;
    private String provider;
    private Integer chipset;
    private String ramType;
    private Integer ramSlotNumber;
    private Category category = Category.MOTHER_BOARD;
}
