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
 * JDCLOUD Renewal API v2
 * API related to Renewal
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.renewal.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.renewal.model.RenewInstanceParam;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 实例续费
 */
public class RenewInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * renewInstanceParam
     * Required:true
     */
    @Required
    private RenewInstanceParam renewInstanceParam;

    /**
     * 地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get renewInstanceParam
     *
     * @return
     */
    public RenewInstanceParam getRenewInstanceParam() {
        return renewInstanceParam;
    }

    /**
     * set renewInstanceParam
     *
     * @param renewInstanceParam
     */
    public void setRenewInstanceParam(RenewInstanceParam renewInstanceParam) {
        this.renewInstanceParam = renewInstanceParam;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set renewInstanceParam
     *
     * @param renewInstanceParam
     */
    public RenewInstanceRequest renewInstanceParam(RenewInstanceParam renewInstanceParam) {
        this.renewInstanceParam = renewInstanceParam;
        return this;
    }

    /**
     * set 地域
     *
     * @param regionId
     */
    public RenewInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}