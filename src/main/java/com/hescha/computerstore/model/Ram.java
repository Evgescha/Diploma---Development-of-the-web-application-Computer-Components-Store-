package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Ram extends Product{
    private String type;
    private Integer volume;
    private String frequency;
    private Category category = Category.RAM;
}
