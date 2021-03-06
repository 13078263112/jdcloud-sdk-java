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

package com.jdcloud.sdk.service.kafka.model;

import java.util.List;
import java.util.ArrayList;

/**
 * constraintsConf
 */
public class ConstraintsConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘类型
     */
    private String storageType;

    /**
     * 是否在售
     */
    private Boolean onSale;

    /**
     * 规格代码
     */
    private List<String> classCode;

    /**
     * 节点数最小值
     */
    private Integer minCount;

    /**
     * 节点数最大值
     */
    private Integer maxCount;

    /**
     * 节点数默认值
     */
    private Integer defaultCount;

    /**
     * 节点数步长
     */
    private Integer stepCount;

    /**
     * 是否包含存储
     */
    private Boolean storageScale;

    /**
     * 存储最小值
     */
    private Integer minStorageGB;

    /**
     * 存储最大值
     */
    private Integer maxStorageGB;

    /**
     * 存储默认值
     */
    private Integer defaultStorageGB;

    /**
     * 存储步长
     */
    private Integer stepStorageGB;


    /**
     * get 磁盘类型
     *
     * @return
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * set 磁盘类型
     *
     * @param storageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * get 是否在售
     *
     * @return
     */
    public Boolean getOnSale() {
        return onSale;
    }

    /**
     * set 是否在售
     *
     * @param onSale
     */
    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    /**
     * get 规格代码
     *
     * @return
     */
    public List<String> getClassCode() {
        return classCode;
    }

    /**
     * set 规格代码
     *
     * @param classCode
     */
    public void setClassCode(List<String> classCode) {
        this.classCode = classCode;
    }

    /**
     * get 节点数最小值
     *
     * @return
     */
    public Integer getMinCount() {
        return minCount;
    }

    /**
     * set 节点数最小值
     *
     * @param minCount
     */
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    /**
     * get 节点数最大值
     *
     * @return
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * set 节点数最大值
     *
     * @param maxCount
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * get 节点数默认值
     *
     * @return
     */
    public Integer getDefaultCount() {
        return defaultCount;
    }

    /**
     * set 节点数默认值
     *
     * @param defaultCount
     */
    public void setDefaultCount(Integer defaultCount) {
        this.defaultCount = defaultCount;
    }

    /**
     * get 节点数步长
     *
     * @return
     */
    public Integer getStepCount() {
        return stepCount;
    }

    /**
     * set 节点数步长
     *
     * @param stepCount
     */
    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }

    /**
     * get 是否包含存储
     *
     * @return
     */
    public Boolean getStorageScale() {
        return storageScale;
    }

    /**
     * set 是否包含存储
     *
     * @param storageScale
     */
    public void setStorageScale(Boolean storageScale) {
        this.storageScale = storageScale;
    }

    /**
     * get 存储最小值
     *
     * @return
     */
    public Integer getMinStorageGB() {
        return minStorageGB;
    }

    /**
     * set 存储最小值
     *
     * @param minStorageGB
     */
    public void setMinStorageGB(Integer minStorageGB) {
        this.minStorageGB = minStorageGB;
    }

    /**
     * get 存储最大值
     *
     * @return
     */
    public Integer getMaxStorageGB() {
        return maxStorageGB;
    }

    /**
     * set 存储最大值
     *
     * @param maxStorageGB
     */
    public void setMaxStorageGB(Integer maxStorageGB) {
        this.maxStorageGB = maxStorageGB;
    }

    /**
     * get 存储默认值
     *
     * @return
     */
    public Integer getDefaultStorageGB() {
        return defaultStorageGB;
    }

    /**
     * set 存储默认值
     *
     * @param defaultStorageGB
     */
    public void setDefaultStorageGB(Integer defaultStorageGB) {
        this.defaultStorageGB = defaultStorageGB;
    }

    /**
     * get 存储步长
     *
     * @return
     */
    public Integer getStepStorageGB() {
        return stepStorageGB;
    }

    /**
     * set 存储步长
     *
     * @param stepStorageGB
     */
    public void setStepStorageGB(Integer stepStorageGB) {
        this.stepStorageGB = stepStorageGB;
    }


    /**
     * set 磁盘类型
     *
     * @param storageType
     */
    public ConstraintsConf storageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * set 是否在售
     *
     * @param onSale
     */
    public ConstraintsConf onSale(Boolean onSale) {
        this.onSale = onSale;
        return this;
    }

    /**
     * set 规格代码
     *
     * @param classCode
     */
    public ConstraintsConf classCode(List<String> classCode) {
        this.classCode = classCode;
        return this;
    }

    /**
     * set 节点数最小值
     *
     * @param minCount
     */
    public ConstraintsConf minCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * set 节点数最大值
     *
     * @param maxCount
     */
    public ConstraintsConf maxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * set 节点数默认值
     *
     * @param defaultCount
     */
    public ConstraintsConf defaultCount(Integer defaultCount) {
        this.defaultCount = defaultCount;
        return this;
    }

    /**
     * set 节点数步长
     *
     * @param stepCount
     */
    public ConstraintsConf stepCount(Integer stepCount) {
        this.stepCount = stepCount;
        return this;
    }

    /**
     * set 是否包含存储
     *
     * @param storageScale
     */
    public ConstraintsConf storageScale(Boolean storageScale) {
        this.storageScale = storageScale;
        return this;
    }

    /**
     * set 存储最小值
     *
     * @param minStorageGB
     */
    public ConstraintsConf minStorageGB(Integer minStorageGB) {
        this.minStorageGB = minStorageGB;
        return this;
    }

    /**
     * set 存储最大值
     *
     * @param maxStorageGB
     */
    public ConstraintsConf maxStorageGB(Integer maxStorageGB) {
        this.maxStorageGB = maxStorageGB;
        return this;
    }

    /**
     * set 存储默认值
     *
     * @param defaultStorageGB
     */
    public ConstraintsConf defaultStorageGB(Integer defaultStorageGB) {
        this.defaultStorageGB = defaultStorageGB;
        return this;
    }

    /**
     * set 存储步长
     *
     * @param stepStorageGB
     */
    public ConstraintsConf stepStorageGB(Integer stepStorageGB) {
        this.stepStorageGB = stepStorageGB;
        return this;
    }


    /**
     * add item to 规格代码
     *
     * @param classCode
     */
    public void addClassCode(String classCode) {
        if (this.classCode == null) {
            this.classCode = new ArrayList<>();
        }
        this.classCode.add(classCode);
    }

}