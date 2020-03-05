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
 * Anti DDoS Pro Attack Log APIs
 * Anti DDoS Pro Attack Log APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询攻击次数及流量峰值
 */
public class DescribeAttackStatisticsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询的结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String endTime;

    /**
     * 高防实例 ID
     */
    private List<String> instanceId;

    /**
     * 攻击类型, 0 为 DDoS, 1 为 CC
     * Required:true
     */
    @Required
    private Integer type;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询的结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询的结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 高防实例 ID
     *
     * @return
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 攻击类型, 0 为 DDoS, 1 为 CC
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 攻击类型, 0 为 DDoS, 1 为 CC
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public DescribeAttackStatisticsRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询的结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public DescribeAttackStatisticsRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 高防实例 ID
     *
     * @param instanceId
     */
    public DescribeAttackStatisticsRequest instanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 攻击类型, 0 为 DDoS, 1 为 CC
     *
     * @param type
     */
    public DescribeAttackStatisticsRequest type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DescribeAttackStatisticsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 高防实例 ID
     *
     * @param instanceId
     */
    public void addInstanceId(String instanceId) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceId);
    }

}