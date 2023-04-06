package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Processors extends Product{
    private String socket;
    private String module;
    private Integer coreNumber;
    private Boolean internalGraphic;
    private Double frequency;
    private Category category = Category.PROCESSOR;
}
