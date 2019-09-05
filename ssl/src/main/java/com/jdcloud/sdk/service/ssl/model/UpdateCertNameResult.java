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
 * SSL Certificate
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ssl.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改证书名称
 */
public class UpdateCertNameResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;


    /**
     * get 状态码
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 状态码
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 状态码
     *
     * @param code
     */
    public UpdateCertNameResult code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 消息
     *
     * @param message
     */
    public UpdateCertNameResult message(String message) {
        this.message = message;
        return this;
    }


}