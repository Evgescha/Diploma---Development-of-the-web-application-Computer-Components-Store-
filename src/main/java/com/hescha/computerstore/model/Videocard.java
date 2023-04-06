package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Videocard extends Product{
    private String processor;
    private Integer ram;
    private String ramType;
    private Integer coolerNumber;
    private Category category = Category.VIDEOCARD;
}
