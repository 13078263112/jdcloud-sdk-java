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
 * TargetGroup
 * 目标target组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.lb.model.TargetUpdateSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改target信息
 */
public class UpdateTargetsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改target信息
     * Required:true
     */
    @Required
    private List<TargetUpdateSpec> targetUpdateSpecs;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * TargetGroup Id
     * Required:true
     */
    @Required
    private String targetGroupId;


    /**
     * get 修改target信息
     *
     * @return
     */
    public List<TargetUpdateSpec> getTargetUpdateSpecs() {
        return targetUpdateSpecs;
    }

    /**
     * set 修改target信息
     *
     * @param targetUpdateSpecs
     */
    public void setTargetUpdateSpecs(List<TargetUpdateSpec> targetUpdateSpecs) {
        this.targetUpdateSpecs = targetUpdateSpecs;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get TargetGroup Id
     *
     * @return
     */
    public String getTargetGroupId() {
        return targetGroupId;
    }

    /**
     * set TargetGroup Id
     *
     * @param targetGroupId
     */
    public void setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
    }


    /**
     * set 修改target信息
     *
     * @param targetUpdateSpecs
     */
    public UpdateTargetsRequest targetUpdateSpecs(List<TargetUpdateSpec> targetUpdateSpecs) {
        this.targetUpdateSpecs = targetUpdateSpecs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public UpdateTargetsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set TargetGroup Id
     *
     * @param targetGroupId
     */
    public UpdateTargetsRequest targetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }


    /**
     * add item to 修改target信息
     *
     * @param targetUpdateSpec
     */
    public void addTargetUpdateSpec(TargetUpdateSpec targetUpdateSpec) {
        if (this.targetUpdateSpecs == null) {
            this.targetUpdateSpecs = new ArrayList<>();
        }
        this.targetUpdateSpecs.add(targetUpdateSpec);
    }

}