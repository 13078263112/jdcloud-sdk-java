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

package com.jdcloud.sdk.service.monitor.model;


/**
 * ruleResourceInfo
 */
public class RuleResourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 维度
     */
    private String dimension;

    /**
     * 产品类型
     */
    private String product;

    /**
     * region
     */
    private String region;

    /**
     * resourceId
     */
    private String resourceId;


    /**
     * get 维度
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 维度
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 产品类型
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 产品类型
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get region
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set region
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get resourceId
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * set 维度
     *
     * @param dimension
     */
    public RuleResourceInfo dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 产品类型
     *
     * @param product
     */
    public RuleResourceInfo product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set region
     *
     * @param region
     */
    public RuleResourceInfo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public RuleResourceInfo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


}