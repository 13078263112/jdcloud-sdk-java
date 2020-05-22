/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;


/**
 * preOrders
 */
public class PreOrders  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预购订单编号
     */
    private String preOrderId;

    /**
     * 预购订单数量
     */
    private String preOrderNum;

    /**
     * 产品Key
     */
    private String productKey;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 用户Pin
     */
    private String userPin;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 已录入数量
     */
    private Integer recordNum;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 订单状态，0-下单,1-处理完成
     */
    private String preOrderStatus;


    /**
     * get 预购订单编号
     *
     * @return
     */
    public String getPreOrderId() {
        return preOrderId;
    }

    /**
     * set 预购订单编号
     *
     * @param preOrderId
     */
    public void setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
    }

    /**
     * get 预购订单数量
     *
     * @return
     */
    public String getPreOrderNum() {
        return preOrderNum;
    }

    /**
     * set 预购订单数量
     *
     * @param preOrderNum
     */
    public void setPreOrderNum(String preOrderNum) {
        this.preOrderNum = preOrderNum;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 用户Pin
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 用户Pin
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    /**
     * get 用户名称
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 已录入数量
     *
     * @return
     */
    public Integer getRecordNum() {
        return recordNum;
    }

    /**
     * set 已录入数量
     *
     * @param recordNum
     */
    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 订单状态，0-下单,1-处理完成
     *
     * @return
     */
    public String getPreOrderStatus() {
        return preOrderStatus;
    }

    /**
     * set 订单状态，0-下单,1-处理完成
     *
     * @param preOrderStatus
     */
    public void setPreOrderStatus(String preOrderStatus) {
        this.preOrderStatus = preOrderStatus;
    }


    /**
     * set 预购订单编号
     *
     * @param preOrderId
     */
    public PreOrders preOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }

    /**
     * set 预购订单数量
     *
     * @param preOrderNum
     */
    public PreOrders preOrderNum(String preOrderNum) {
        this.preOrderNum = preOrderNum;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public PreOrders productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public PreOrders productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set 用户Pin
     *
     * @param userPin
     */
    public PreOrders userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public PreOrders userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 已录入数量
     *
     * @param recordNum
     */
    public PreOrders recordNum(Integer recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public PreOrders createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 订单状态，0-下单,1-处理完成
     *
     * @param preOrderStatus
     */
    public PreOrders preOrderStatus(String preOrderStatus) {
        this.preOrderStatus = preOrderStatus;
        return this;
    }


}