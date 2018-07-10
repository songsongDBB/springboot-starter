package com.dss.springboot.pojo;

import javax.persistence.*;

@Table(name = "girl")
public class Girl {
    @Id
    private Integer id;

    private Integer age;

    @Column(name = "cupSize")
    private String cupsize;

    private Float amount;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return cupSize
     */
    public String getCupsize() {
        return cupsize;
    }

    /**
     * @param cupsize
     */
    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    /**
     * @return amount
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Float amount) {
        this.amount = amount;
    }
}