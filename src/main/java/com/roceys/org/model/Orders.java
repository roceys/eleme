package com.roceys.org.model;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 订单明细
 */
public class Orders {
    private Basket basket;
    private Chat_status chat_status;
    private String courier_phone;
    private BigDecimal created_timestamp; //时间戳
    private String delivery_code;
    private String desc_color;
    private String display_rider_track;
    /*
    extra_status: {
        highlight_fields: [ ],
        text: ""
    }
    */
    private Map<String, Object> extra_status;
    private String formatted_created_at; //格式化时间 yyyy-MM-dd HH:mm
    private String id;
    private String is_brand;
    private String is_deletable;
    private String is_from_openapi;
    private String is_new_pay;
    private String is_ninja;
    private String is_pindan;
    private String list_im_button;
    private String new_retail_shop_id;
    private String operation_call_rider;
    private String operation_confirm;
    private String operation_pay;
    private String operation_rate;
    private String operation_rebuy;
    private String operation_upload_photo;
    private String pay_remain_seconds;
    private String rated_point;
    private String rebuy_scheme;
    private String refund_detail_url;
    private String remind_reply_count;
    private String restaurant_id;
    private String restaurant_image_hash;
    private String restaurant_name;
    private String restaurant_type;
    private String restaurant_valid;
    private String scheme;
    private String show_similar_shop;
    /*
    * status_bar: {
    color: "black",
    image_type: "completion_order",
    is_highlight: 0,
    sub_title: "",
    title: "订单已送达"
    }
    * */
    private Map<String, Object> status_bar;
    private String status_code;
    /*
    timeline_node: {
    actions: [ ],
    description: "感谢你对饿了么的信任，期待再次光临",
    in_processing: 0,
    processing_type: 1,
    sub_description: "",
    title: "订单已送达"
    }
    */
    private Map<String, Object> timeline_node;
    private String top_show;
    private BigDecimal total_amount; //订单总金额
    private BigDecimal total_quantity;
    private String unique_id;


    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Chat_status getChat_status() {
        return chat_status;
    }

    public void setChat_status(Chat_status chat_status) {
        this.chat_status = chat_status;
    }

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

    public String getDelivery_code() {
        return delivery_code;
    }

    public void setDelivery_code(String delivery_code) {
        this.delivery_code = delivery_code;
    }

    public String getDesc_color() {
        return desc_color;
    }

    public void setDesc_color(String desc_color) {
        this.desc_color = desc_color;
    }

    public String getDisplay_rider_track() {
        return display_rider_track;
    }

    public void setDisplay_rider_track(String display_rider_track) {
        this.display_rider_track = display_rider_track;
    }

    public Map<String, Object> getExtra_status() {
        return extra_status;
    }

    public void setExtra_status(Map<String, Object> extra_status) {
        this.extra_status = extra_status;
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

    public String getIs_ninja() {
        return is_ninja;
    }

    public void setIs_ninja(String is_ninja) {
        this.is_ninja = is_ninja;
    }

    public String getIs_pindan() {
        return is_pindan;
    }

    public void setIs_pindan(String is_pindan) {
        this.is_pindan = is_pindan;
    }

    public String getList_im_button() {
        return list_im_button;
    }

    public void setList_im_button(String list_im_button) {
        this.list_im_button = list_im_button;
    }

    public String getNew_retail_shop_id() {
        return new_retail_shop_id;
    }

    public void setNew_retail_shop_id(String new_retail_shop_id) {
        this.new_retail_shop_id = new_retail_shop_id;
    }

    public String getOperation_call_rider() {
        return operation_call_rider;
    }

    public void setOperation_call_rider(String operation_call_rider) {
        this.operation_call_rider = operation_call_rider;
    }

    public String getOperation_confirm() {
        return operation_confirm;
    }

    public void setOperation_confirm(String operation_confirm) {
        this.operation_confirm = operation_confirm;
    }

    public String getOperation_pay() {
        return operation_pay;
    }

    public void setOperation_pay(String operation_pay) {
        this.operation_pay = operation_pay;
    }

    public String getOperation_rate() {
        return operation_rate;
    }

    public void setOperation_rate(String operation_rate) {
        this.operation_rate = operation_rate;
    }

    public String getOperation_rebuy() {
        return operation_rebuy;
    }

    public void setOperation_rebuy(String operation_rebuy) {
        this.operation_rebuy = operation_rebuy;
    }

    public String getOperation_upload_photo() {
        return operation_upload_photo;
    }

    public void setOperation_upload_photo(String operation_upload_photo) {
        this.operation_upload_photo = operation_upload_photo;
    }

    public String getPay_remain_seconds() {
        return pay_remain_seconds;
    }

    public void setPay_remain_seconds(String pay_remain_seconds) {
        this.pay_remain_seconds = pay_remain_seconds;
    }

    public String getRated_point() {
        return rated_point;
    }

    public void setRated_point(String rated_point) {
        this.rated_point = rated_point;
    }

    public String getRebuy_scheme() {
        return rebuy_scheme;
    }

    public void setRebuy_scheme(String rebuy_scheme) {
        this.rebuy_scheme = rebuy_scheme;
    }

    public String getRefund_detail_url() {
        return refund_detail_url;
    }

    public void setRefund_detail_url(String refund_detail_url) {
        this.refund_detail_url = refund_detail_url;
    }

    public String getRemind_reply_count() {
        return remind_reply_count;
    }

    public void setRemind_reply_count(String remind_reply_count) {
        this.remind_reply_count = remind_reply_count;
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

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getShow_similar_shop() {
        return show_similar_shop;
    }

    public void setShow_similar_shop(String show_similar_shop) {
        this.show_similar_shop = show_similar_shop;
    }

    public Map<String, Object> getStatus_bar() {
        return status_bar;
    }

    public void setStatus_bar(Map<String, Object> status_bar) {
        this.status_bar = status_bar;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public Map<String, Object> getTimeline_node() {
        return timeline_node;
    }

    public void setTimeline_node(Map<String, Object> timeline_node) {
        this.timeline_node = timeline_node;
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
}
