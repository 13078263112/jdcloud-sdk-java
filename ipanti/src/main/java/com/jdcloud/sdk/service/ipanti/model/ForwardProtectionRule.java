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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;

/**
 * forwardProtectionRule
 */
public class ForwardProtectionRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 虚假源与空连接, 0: 关闭, 1: 开启
     */
    private Integer spoofIpEnable;

    /**
     * 源新建连接限速, 0: 关闭, 1: 开启
     */
    private Integer srcNewConnLimitEnable;

    /**
     * 源新建连接速率
     */
    private Long srcNewConnLimitValue;

    /**
     * 源并发连接限速, 0: 关闭, 1: 开启
     */
    private Integer srcConcurrentConnLimitEnable;

    /**
     * 源并发连接速率
     */
    private Long srcConcurrentConnLimitValue;

    /**
     * 目的新建连接限速, 0: 关闭, 1: 开启
     */
    private Integer dstNewConnLimitEnable;

    /**
     * 目的新建连接速率
     */
    private Long dstNewConnLimitValue;

    /**
     * 目的并发连接限速, 0: 关闭, 1: 开启
     */
    private Integer dstConcurrentConnLimitEnable;

    /**
     * 目的并发连接速率
     */
    private Long dstConcurrentConnLimitValue;

    /**
     * 报文最小长度
     */
    private Long datagramRangeMin;

    /**
     * 报文最大长度
     */
    private Long datagramRangeMax;

    /**
     * geo 拦截地域列表
     */
    private List<Geo> geoBlackList;


    /**
     * get 虚假源与空连接, 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getSpoofIpEnable() {
        return spoofIpEnable;
    }

    /**
     * set 虚假源与空连接, 0: 关闭, 1: 开启
     *
     * @param spoofIpEnable
     */
    public void setSpoofIpEnable(Integer spoofIpEnable) {
        this.spoofIpEnable = spoofIpEnable;
    }

    /**
     * get 源新建连接限速, 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getSrcNewConnLimitEnable() {
        return srcNewConnLimitEnable;
    }

    /**
     * set 源新建连接限速, 0: 关闭, 1: 开启
     *
     * @param srcNewConnLimitEnable
     */
    public void setSrcNewConnLimitEnable(Integer srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
    }

    /**
     * get 源新建连接速率
     *
     * @return
     */
    public Long getSrcNewConnLimitValue() {
        return srcNewConnLimitValue;
    }

    /**
     * set 源新建连接速率
     *
     * @param srcNewConnLimitValue
     */
    public void setSrcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
    }

    /**
     * get 源并发连接限速, 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getSrcConcurrentConnLimitEnable() {
        return srcConcurrentConnLimitEnable;
    }

    /**
     * set 源并发连接限速, 0: 关闭, 1: 开启
     *
     * @param srcConcurrentConnLimitEnable
     */
    public void setSrcConcurrentConnLimitEnable(Integer srcConcurrentConnLimitEnable) {
        this.srcConcurrentConnLimitEnable = srcConcurrentConnLimitEnable;
    }

    /**
     * get 源并发连接速率
     *
     * @return
     */
    public Long getSrcConcurrentConnLimitValue() {
        return srcConcurrentConnLimitValue;
    }

    /**
     * set 源并发连接速率
     *
     * @param srcConcurrentConnLimitValue
     */
    public void setSrcConcurrentConnLimitValue(Long srcConcurrentConnLimitValue) {
        this.srcConcurrentConnLimitValue = srcConcurrentConnLimitValue;
    }

    /**
     * get 目的新建连接限速, 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getDstNewConnLimitEnable() {
        return dstNewConnLimitEnable;
    }

    /**
     * set 目的新建连接限速, 0: 关闭, 1: 开启
     *
     * @param dstNewConnLimitEnable
     */
    public void setDstNewConnLimitEnable(Integer dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
    }

    /**
     * get 目的新建连接速率
     *
     * @return
     */
    public Long getDstNewConnLimitValue() {
        return dstNewConnLimitValue;
    }

    /**
     * set 目的新建连接速率
     *
     * @param dstNewConnLimitValue
     */
    public void setDstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
    }

    /**
     * get 目的并发连接限速, 0: 关闭, 1: 开启
     *
     * @return
     */
    public Integer getDstConcurrentConnLimitEnable() {
        return dstConcurrentConnLimitEnable;
    }

    /**
     * set 目的并发连接限速, 0: 关闭, 1: 开启
     *
     * @param dstConcurrentConnLimitEnable
     */
    public void setDstConcurrentConnLimitEnable(Integer dstConcurrentConnLimitEnable) {
        this.dstConcurrentConnLimitEnable = dstConcurrentConnLimitEnable;
    }

    /**
     * get 目的并发连接速率
     *
     * @return
     */
    public Long getDstConcurrentConnLimitValue() {
        return dstConcurrentConnLimitValue;
    }

    /**
     * set 目的并发连接速率
     *
     * @param dstConcurrentConnLimitValue
     */
    public void setDstConcurrentConnLimitValue(Long dstConcurrentConnLimitValue) {
        this.dstConcurrentConnLimitValue = dstConcurrentConnLimitValue;
    }

    /**
     * get 报文最小长度
     *
     * @return
     */
    public Long getDatagramRangeMin() {
        return datagramRangeMin;
    }

    /**
     * set 报文最小长度
     *
     * @param datagramRangeMin
     */
    public void setDatagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
    }

    /**
     * get 报文最大长度
     *
     * @return
     */
    public Long getDatagramRangeMax() {
        return datagramRangeMax;
    }

    /**
     * set 报文最大长度
     *
     * @param datagramRangeMax
     */
    public void setDatagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
    }

    /**
     * get geo 拦截地域列表
     *
     * @return
     */
    public List<Geo> getGeoBlackList() {
        return geoBlackList;
    }

    /**
     * set geo 拦截地域列表
     *
     * @param geoBlackList
     */
    public void setGeoBlackList(List<Geo> geoBlackList) {
        this.geoBlackList = geoBlackList;
    }


    /**
     * set 虚假源与空连接, 0: 关闭, 1: 开启
     *
     * @param spoofIpEnable
     */
    public ForwardProtectionRule spoofIpEnable(Integer spoofIpEnable) {
        this.spoofIpEnable = spoofIpEnable;
        return this;
    }

    /**
     * set 源新建连接限速, 0: 关闭, 1: 开启
     *
     * @param srcNewConnLimitEnable
     */
    public ForwardProtectionRule srcNewConnLimitEnable(Integer srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
        return this;
    }

    /**
     * set 源新建连接速率
     *
     * @param srcNewConnLimitValue
     */
    public ForwardProtectionRule srcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
        return this;
    }

    /**
     * set 源并发连接限速, 0: 关闭, 1: 开启
     *
     * @param srcConcurrentConnLimitEnable
     */
    public ForwardProtectionRule srcConcurrentConnLimitEnable(Integer srcConcurrentConnLimitEnable) {
        this.srcConcurrentConnLimitEnable = srcConcurrentConnLimitEnable;
        return this;
    }

    /**
     * set 源并发连接速率
     *
     * @param srcConcurrentConnLimitValue
     */
    public ForwardProtectionRule srcConcurrentConnLimitValue(Long srcConcurrentConnLimitValue) {
        this.srcConcurrentConnLimitValue = srcConcurrentConnLimitValue;
        return this;
    }

    /**
     * set 目的新建连接限速, 0: 关闭, 1: 开启
     *
     * @param dstNewConnLimitEnable
     */
    public ForwardProtectionRule dstNewConnLimitEnable(Integer dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
        return this;
    }

    /**
     * set 目的新建连接速率
     *
     * @param dstNewConnLimitValue
     */
    public ForwardProtectionRule dstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
        return this;
    }

    /**
     * set 目的并发连接限速, 0: 关闭, 1: 开启
     *
     * @param dstConcurrentConnLimitEnable
     */
    public ForwardProtectionRule dstConcurrentConnLimitEnable(Integer dstConcurrentConnLimitEnable) {
        this.dstConcurrentConnLimitEnable = dstConcurrentConnLimitEnable;
        return this;
    }

    /**
     * set 目的并发连接速率
     *
     * @param dstConcurrentConnLimitValue
     */
    public ForwardProtectionRule dstConcurrentConnLimitValue(Long dstConcurrentConnLimitValue) {
        this.dstConcurrentConnLimitValue = dstConcurrentConnLimitValue;
        return this;
    }

    /**
     * set 报文最小长度
     *
     * @param datagramRangeMin
     */
    public ForwardProtectionRule datagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
        return this;
    }

    /**
     * set 报文最大长度
     *
     * @param datagramRangeMax
     */
    public ForwardProtectionRule datagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
        return this;
    }

    /**
     * set geo 拦截地域列表
     *
     * @param geoBlackList
     */
    public ForwardProtectionRule geoBlackList(List<Geo> geoBlackList) {
        this.geoBlackList = geoBlackList;
        return this;
    }


    /**
     * add item to geo 拦截地域列表
     *
     * @param geoBlackList
     */
    public void addGeoBlackList(Geo geoBlackList) {
        if (this.geoBlackList == null) {
            this.geoBlackList = new ArrayList<>();
        }
        this.geoBlackList.add(geoBlackList);
    }

}