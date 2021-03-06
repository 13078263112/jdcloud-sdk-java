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
 * 敏感操作配置
 * 操作敏感操作配置接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sop.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取操作保护设置信息
 */
public class GetSensitiveOpSettingResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作保护启用状态：0-未启用, 1-已启用
     */
    private Integer status;

    /**
     * 操作保护验证方式：0-无, 1-短信, 2-邮箱, 3-MFA
     */
    private Integer type;

    /**
     * 扩展信息，type&#x3D;1时为掩码后的手机号码 type&#x3D;2时为掩码后的邮箱地址
     */
    private String extInfo;


    /**
     * get 操作保护启用状态：0-未启用, 1-已启用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 操作保护启用状态：0-未启用, 1-已启用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 操作保护验证方式：0-无, 1-短信, 2-邮箱, 3-MFA
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 操作保护验证方式：0-无, 1-短信, 2-邮箱, 3-MFA
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 扩展信息，type&#x3D;1时为掩码后的手机号码 type&#x3D;2时为掩码后的邮箱地址
     *
     * @return
     */
    public String getExtInfo() {
        return extInfo;
    }

    /**
     * set 扩展信息，type&#x3D;1时为掩码后的手机号码 type&#x3D;2时为掩码后的邮箱地址
     *
     * @param extInfo
     */
    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }


    /**
     * set 操作保护启用状态：0-未启用, 1-已启用
     *
     * @param status
     */
    public GetSensitiveOpSettingResult status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 操作保护验证方式：0-无, 1-短信, 2-邮箱, 3-MFA
     *
     * @param type
     */
    public GetSensitiveOpSettingResult type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 扩展信息，type&#x3D;1时为掩码后的手机号码 type&#x3D;2时为掩码后的邮箱地址
     *
     * @param extInfo
     */
    public GetSensitiveOpSettingResult extInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }


}