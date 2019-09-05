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
 * Domain
 * 域名配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vod.model.IPRuleConfigObject;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置CDN域名IP黑名单规则
 */
public class SetIPRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP黑名单规则配置对象
     * Required:true
     */
    @Required
    private IPRuleConfigObject config;

    /**
     * 是否启用该规则
     * Required:true
     */
    @Required
    private Boolean enabled;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private Long domainId;


    /**
     * get IP黑名单规则配置对象
     *
     * @return
     */
    public IPRuleConfigObject getConfig() {
        return config;
    }

    /**
     * set IP黑名单规则配置对象
     *
     * @param config
     */
    public void setConfig(IPRuleConfigObject config) {
        this.config = config;
    }

    /**
     * get 是否启用该规则
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 域名ID
     *
     * @return
     */
    public Long getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }


    /**
     * set IP黑名单规则配置对象
     *
     * @param config
     */
    public SetIPRuleRequest config(IPRuleConfigObject config) {
        this.config = config;
        return this;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public SetIPRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public SetIPRuleRequest domainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }


}