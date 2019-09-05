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
 * Resource-Tag-APIs
 * 资源标签接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据标签查找资源。 &lt;br/&gt;
若要查找cdn产品线的资源则url中的regionId必须指定为cn-all。

 */
public class QueryResourceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * resourceIds
     */
    private List<String> resourceIds;


    /**
     * get resourceIds
     *
     * @return
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * set resourceIds
     *
     * @param resourceIds
     */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }


    /**
     * set resourceIds
     *
     * @param resourceIds
     */
    public QueryResourceResult resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }


    /**
     * add item to resourceIds
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceId);
    }

}