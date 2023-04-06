package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Periferia extends Product{
    private Category category = Category.PERIFERIA;
}
