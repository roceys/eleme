package com.roceys.org.model;

import java.util.List;

public class Basket {
    private List abandoned_extra;
    private Deliver_fee deliver_fee;
    private List<Extra> extra;
    private List<List<Items>> group;
    private Hongbao hongbao;
    private Packing_fee packing_fee;
    private List pindan_map;
    private List tying_group;

    public List getAbandoned_extra() {
        return abandoned_extra;
    }

    public void setAbandoned_extra(List abandoned_extra) {
        this.abandoned_extra = abandoned_extra;
    }

    public Deliver_fee getDeliver_fee() {
        return deliver_fee;
    }

    public void setDeliver_fee(Deliver_fee deliver_fee) {
        this.deliver_fee = deliver_fee;
    }

    public List<Extra> getExtra() {
        return extra;
    }

    public void setExtra(List<Extra> extra) {
        this.extra = extra;
    }

    public List<List<Items>> getGroup() {
        return group;
    }

    public void setGroup(List<List<Items>> group) {
        this.group = group;
    }

    public Hongbao getHongbao() {
        return hongbao;
    }

    public void setHongbao(Hongbao hongbao) {
        this.hongbao = hongbao;
    }

    public Packing_fee getPacking_fee() {
        return packing_fee;
    }

    public void setPacking_fee(Packing_fee packing_fee) {
        this.packing_fee = packing_fee;
    }

    public List getPindan_map() {
        return pindan_map;
    }

    public void setPindan_map(List pindan_map) {
        this.pindan_map = pindan_map;
    }

    public List getTying_group() {
        return tying_group;
    }

    public void setTying_group(List tying_group) {
        this.tying_group = tying_group;
    }
}
