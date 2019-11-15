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
 * Subscription
 * 订阅相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jcq.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改订阅
 */
public class ModifySubscriptionAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最大重试次数
     */
    private Integer maxRetryTimes;

    /**
     * 消息ack超时时间
     */
    private Integer messageInvisibleTimeInSeconds;

    /**
     * 是否开启死信队列[true, false]
     */
    private Boolean dlqEnable;

    /**
     * 所在区域的Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * topic 名称
     * Required:true
     */
    @Required
    private String topicName;

    /**
     * consumerGroupId
     * Required:true
     */
    @Required
    private String consumerGroupId;


    /**
     * get 最大重试次数
     *
     * @return
     */
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    /**
     * set 最大重试次数
     *
     * @param maxRetryTimes
     */
    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    /**
     * get 消息ack超时时间
     *
     * @return
     */
    public Integer getMessageInvisibleTimeInSeconds() {
        return messageInvisibleTimeInSeconds;
    }

    /**
     * set 消息ack超时时间
     *
     * @param messageInvisibleTimeInSeconds
     */
    public void setMessageInvisibleTimeInSeconds(Integer messageInvisibleTimeInSeconds) {
        this.messageInvisibleTimeInSeconds = messageInvisibleTimeInSeconds;
    }

    /**
     * get 是否开启死信队列[true, false]
     *
     * @return
     */
    public Boolean getDlqEnable() {
        return dlqEnable;
    }

    /**
     * set 是否开启死信队列[true, false]
     *
     * @param dlqEnable
     */
    public void setDlqEnable(Boolean dlqEnable) {
        this.dlqEnable = dlqEnable;
    }

    /**
     * get 所在区域的Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 所在区域的Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get topic 名称
     *
     * @return
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * set topic 名称
     *
     * @param topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * get consumerGroupId
     *
     * @return
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }


    /**
     * set 最大重试次数
     *
     * @param maxRetryTimes
     */
    public ModifySubscriptionAttributeRequest maxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * set 消息ack超时时间
     *
     * @param messageInvisibleTimeInSeconds
     */
    public ModifySubscriptionAttributeRequest messageInvisibleTimeInSeconds(Integer messageInvisibleTimeInSeconds) {
        this.messageInvisibleTimeInSeconds = messageInvisibleTimeInSeconds;
        return this;
    }

    /**
     * set 是否开启死信队列[true, false]
     *
     * @param dlqEnable
     */
    public ModifySubscriptionAttributeRequest dlqEnable(Boolean dlqEnable) {
        this.dlqEnable = dlqEnable;
        return this;
    }

    /**
     * set 所在区域的Region ID
     *
     * @param regionId
     */
    public ModifySubscriptionAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set topic 名称
     *
     * @param topicName
     */
    public ModifySubscriptionAttributeRequest topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public ModifySubscriptionAttributeRequest consumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }


}