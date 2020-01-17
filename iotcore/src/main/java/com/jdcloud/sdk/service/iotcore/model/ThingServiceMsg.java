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
 * thingServiceMsg
 */
public class ThingServiceMsg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务名称
     */
    private String name;

    /**
     * 消息唯一标识
     */
    private String msgId;


    /**
     * get 服务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 服务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 消息唯一标识
     *
     * @return
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * set 消息唯一标识
     *
     * @param msgId
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }


    /**
     * set 服务名称
     *
     * @param name
     */
    public ThingServiceMsg name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 消息唯一标识
     *
     * @param msgId
     */
    public ThingServiceMsg msgId(String msgId) {
        this.msgId = msgId;
        return this;
    }


}