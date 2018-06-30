package com.roceys.org.model;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 订单明细
 */
public class EOrdersDTO {
    private String courier_phone;
    private BigDecimal created_timestamp; //时间戳
    private String display_rider_track;
    private String formatted_created_at; //格式化时间 yyyy-MM-dd HH:mm
    private String id;
    private String is_brand;
    private String is_deletable;
    private String is_from_openapi;
    private String is_new_pay;
    private String operation_rate;
    private String rated_point;
    private String restaurant_id;
    private String restaurant_image_hash;
    private String restaurant_name;
    private String restaurant_type;
    private String restaurant_valid;
    private String status_code;
    private String top_show;
    private BigDecimal total_amount; //订单总金额
    private BigDecimal total_quantity;
    private String unique_id;
    private String marks;   //备注
    private Integer packing_quantity;   //餐盒/包装数量
    private BigDecimal packing_total_price; //餐盒总费用
    private BigDecimal deliver_price; //配送费

    public String getCourier_phone() {
        return courier_phone;
    }

    public void setCourier_phone(String courier_phone) {
        this.courier_phone = courier_phone;
    }

    public BigDecimal getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(BigDecimal created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public String getDisplay_rider_track() {
        return display_rider_track;
    }

    public void setDisplay_rider_track(String display_rider_track) {
        this.display_rider_track = display_rider_track;
    }

    public String getFormatted_created_at() {
        return formatted_created_at;
    }

    public void setFormatted_created_at(String formatted_created_at) {
        this.formatted_created_at = formatted_created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIs_brand() {
        return is_brand;
    }

    public void setIs_brand(String is_brand) {
        this.is_brand = is_brand;
    }

    public String getIs_deletable() {
        return is_deletable;
    }

    public void setIs_deletable(String is_deletable) {
        this.is_deletable = is_deletable;
    }

    public String getIs_from_openapi() {
        return is_from_openapi;
    }

    public void setIs_from_openapi(String is_from_openapi) {
        this.is_from_openapi = is_from_openapi;
    }

    public String getIs_new_pay() {
        return is_new_pay;
    }

    public void setIs_new_pay(String is_new_pay) {
        this.is_new_pay = is_new_pay;
    }

    public String getOperation_rate() {
        return operation_rate;
    }

    public void setOperation_rate(String operation_rate) {
        this.operation_rate = operation_rate;
    }

    public String getRated_point() {
        return rated_point;
    }

    public void setRated_point(String rated_point) {
        this.rated_point = rated_point;
    }

    public String getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_image_hash() {
        return restaurant_image_hash;
    }

    public void setRestaurant_image_hash(String restaurant_image_hash) {
        this.restaurant_image_hash = restaurant_image_hash;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_type() {
        return restaurant_type;
    }

    public void setRestaurant_type(String restaurant_type) {
        this.restaurant_type = restaurant_type;
    }

    public String getRestaurant_valid() {
        return restaurant_valid;
    }

    public void setRestaurant_valid(String restaurant_valid) {
        this.restaurant_valid = restaurant_valid;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getTop_show() {
        return top_show;
    }

    public void setTop_show(String top_show) {
        this.top_show = top_show;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public BigDecimal getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(BigDecimal total_quantity) {
        this.total_quantity = total_quantity;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public Integer getPacking_quantity() {
        return packing_quantity;
    }

    public void setPacking_quantity(Integer packing_quantity) {
        this.packing_quantity = packing_quantity;
    }

    public BigDecimal getPacking_total_price() {
        return packing_total_price;
    }

    public void setPacking_total_price(BigDecimal packing_total_price) {
        this.packing_total_price = packing_total_price;
    }

    public BigDecimal getDeliver_price() {
        return deliver_price;
    }

    public void setDeliver_price(BigDecimal deliver_price) {
        this.deliver_price = deliver_price;
    }
}
