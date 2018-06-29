package com.roceys.org.model;

import java.math.BigDecimal;
import java.util.List;

public class Items {
    private List attrs;
    private String image_hash;
    private String name;
    private BigDecimal price;
    private List new_specs;
    private List specs;

    public List getAttrs() {
        return attrs;
    }

    public void setAttrs(List attrs) {
        this.attrs = attrs;
    }

    public String getImage_hash() {
        return image_hash;
    }

    public void setImage_hash(String image_hash) {
        this.image_hash = image_hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getNew_specs() {
        return new_specs;
    }

    public void setNew_specs(List new_specs) {
        this.new_specs = new_specs;
    }

    public List getSpecs() {
        return specs;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSpecs(List specs) {
        this.specs = specs;
    }

}
