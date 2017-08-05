package com.livtrip.web.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.serial_no
     *
     * @mbg.generated
     */
    private String serialNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.product_id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.hotel_id
     *
     * @mbg.generated
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.check_in
     *
     * @mbg.generated
     */
    private Date checkIn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.check_out
     *
     * @mbg.generated
     */
    private Date checkOut;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.room_info
     *
     * @mbg.generated
     */
    private String roomInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.receipt_amount
     *
     * @mbg.generated
     */
    private BigDecimal receiptAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.pay_type
     *
     * @mbg.generated
     */
    private Integer payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.create_person
     *
     * @mbg.generated
     */
    private String createPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.update_person
     *
     * @mbg.generated
     */
    private String updatePerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column liv_order.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.id
     *
     * @return the value of liv_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.id
     *
     * @param id the value for liv_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.order_sn
     *
     * @return the value of liv_order.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.order_sn
     *
     * @param orderSn the value for liv_order.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.serial_no
     *
     * @return the value of liv_order.serial_no
     *
     * @mbg.generated
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.serial_no
     *
     * @param serialNo the value for liv_order.serial_no
     *
     * @mbg.generated
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.product_id
     *
     * @return the value of liv_order.product_id
     *
     * @mbg.generated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.product_id
     *
     * @param productId the value for liv_order.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.hotel_id
     *
     * @return the value of liv_order.hotel_id
     *
     * @mbg.generated
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.hotel_id
     *
     * @param hotelId the value for liv_order.hotel_id
     *
     * @mbg.generated
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.check_in
     *
     * @return the value of liv_order.check_in
     *
     * @mbg.generated
     */
    public Date getCheckIn() {
        return checkIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.check_in
     *
     * @param checkIn the value for liv_order.check_in
     *
     * @mbg.generated
     */
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.check_out
     *
     * @return the value of liv_order.check_out
     *
     * @mbg.generated
     */
    public Date getCheckOut() {
        return checkOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.check_out
     *
     * @param checkOut the value for liv_order.check_out
     *
     * @mbg.generated
     */
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.room_info
     *
     * @return the value of liv_order.room_info
     *
     * @mbg.generated
     */
    public String getRoomInfo() {
        return roomInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.room_info
     *
     * @param roomInfo the value for liv_order.room_info
     *
     * @mbg.generated
     */
    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.user_id
     *
     * @return the value of liv_order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.user_id
     *
     * @param userId the value for liv_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.email
     *
     * @return the value of liv_order.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.email
     *
     * @param email the value for liv_order.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.mobile
     *
     * @return the value of liv_order.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.mobile
     *
     * @param mobile the value for liv_order.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.status
     *
     * @return the value of liv_order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.status
     *
     * @param status the value for liv_order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.amount
     *
     * @return the value of liv_order.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.amount
     *
     * @param amount the value for liv_order.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.receipt_amount
     *
     * @return the value of liv_order.receipt_amount
     *
     * @mbg.generated
     */
    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.receipt_amount
     *
     * @param receiptAmount the value for liv_order.receipt_amount
     *
     * @mbg.generated
     */
    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.pay_type
     *
     * @return the value of liv_order.pay_type
     *
     * @mbg.generated
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.pay_type
     *
     * @param payType the value for liv_order.pay_type
     *
     * @mbg.generated
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.unit
     *
     * @return the value of liv_order.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.unit
     *
     * @param unit the value for liv_order.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.ip
     *
     * @return the value of liv_order.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.ip
     *
     * @param ip the value for liv_order.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.create_person
     *
     * @return the value of liv_order.create_person
     *
     * @mbg.generated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.create_person
     *
     * @param createPerson the value for liv_order.create_person
     *
     * @mbg.generated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.create_time
     *
     * @return the value of liv_order.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.create_time
     *
     * @param createTime the value for liv_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.update_person
     *
     * @return the value of liv_order.update_person
     *
     * @mbg.generated
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.update_person
     *
     * @param updatePerson the value for liv_order.update_person
     *
     * @mbg.generated
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column liv_order.update_time
     *
     * @return the value of liv_order.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column liv_order.update_time
     *
     * @param updateTime the value for liv_order.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liv_order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getCheckIn() == null ? other.getCheckIn() == null : this.getCheckIn().equals(other.getCheckIn()))
            && (this.getCheckOut() == null ? other.getCheckOut() == null : this.getCheckOut().equals(other.getCheckOut()))
            && (this.getRoomInfo() == null ? other.getRoomInfo() == null : this.getRoomInfo().equals(other.getRoomInfo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getReceiptAmount() == null ? other.getReceiptAmount() == null : this.getReceiptAmount().equals(other.getReceiptAmount()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getCreatePerson() == null ? other.getCreatePerson() == null : this.getCreatePerson().equals(other.getCreatePerson()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdatePerson() == null ? other.getUpdatePerson() == null : this.getUpdatePerson().equals(other.getUpdatePerson()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liv_order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getCheckIn() == null) ? 0 : getCheckIn().hashCode());
        result = prime * result + ((getCheckOut() == null) ? 0 : getCheckOut().hashCode());
        result = prime * result + ((getRoomInfo() == null) ? 0 : getRoomInfo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getReceiptAmount() == null) ? 0 : getReceiptAmount().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getCreatePerson() == null) ? 0 : getCreatePerson().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdatePerson() == null) ? 0 : getUpdatePerson().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liv_order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", productId=").append(productId);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", checkIn=").append(checkIn);
        sb.append(", checkOut=").append(checkOut);
        sb.append(", roomInfo=").append(roomInfo);
        sb.append(", userId=").append(userId);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", status=").append(status);
        sb.append(", amount=").append(amount);
        sb.append(", receiptAmount=").append(receiptAmount);
        sb.append(", payType=").append(payType);
        sb.append(", unit=").append(unit);
        sb.append(", ip=").append(ip);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}