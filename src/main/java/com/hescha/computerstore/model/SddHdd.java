package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class SddHdd extends Product{
    private Integer volume;
    private String formFactor;
    private String readSpeed;
    private String writeSpeed;
    private Category category = Category.SDD_HDD;
}
