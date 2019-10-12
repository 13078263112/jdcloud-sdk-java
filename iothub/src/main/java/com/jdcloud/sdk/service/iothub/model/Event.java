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

package com.jdcloud.sdk.service.iothub.model;


/**
 * event
 */
public class Event  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 事件名称
     */
    private String name;

    /**
     * 事件ID
     */
    private String eventId;

    /**
     * 事件类型
     */
    private String eventType;

    /**
     * 输出参数,object的key为参数名称，value为参数值
     */
    private Object output;

    /**
     * 产生时间
     */
    private Long createdTime;


    /**
     * get 事件名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 事件名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 事件ID
     *
     * @return
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * set 事件ID
     *
     * @param eventId
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * get 事件类型
     *
     * @return
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * set 事件类型
     *
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * get 输出参数,object的key为参数名称，value为参数值
     *
     * @return
     */
    public Object getOutput() {
        return output;
    }

    /**
     * set 输出参数,object的key为参数名称，value为参数值
     *
     * @param output
     */
    public void setOutput(Object output) {
        this.output = output;
    }

    /**
     * get 产生时间
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set 产生时间
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 事件名称
     *
     * @param name
     */
    public Event name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 事件ID
     *
     * @param eventId
     */
    public Event eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * set 事件类型
     *
     * @param eventType
     */
    public Event eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * set 输出参数,object的key为参数名称，value为参数值
     *
     * @param output
     */
    public Event output(Object output) {
        this.output = output;
        return this;
    }

    /**
     * set 产生时间
     *
     * @param createdTime
     */
    public Event createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }


}