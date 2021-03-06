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

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 动态标签资源,对指定标签服务的tag下的资源设置报警规则
 */
public class TagsOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作项(多个tagFilter之间关关系)默认是or
     */
    private String operator;

    /**
     * 资源标签,对所有符合该标签的资源设置报警规则，对于新加入该标签的资源自动生效
     */
    private List<TagFilter> tags;


    /**
     * get 操作项(多个tagFilter之间关关系)默认是or
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作项(多个tagFilter之间关关系)默认是or
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 资源标签,对所有符合该标签的资源设置报警规则，对于新加入该标签的资源自动生效
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 资源标签,对所有符合该标签的资源设置报警规则，对于新加入该标签的资源自动生效
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }


    /**
     * set 操作项(多个tagFilter之间关关系)默认是or
     *
     * @param operator
     */
    public TagsOption operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 资源标签,对所有符合该标签的资源设置报警规则，对于新加入该标签的资源自动生效
     *
     * @param tags
     */
    public TagsOption tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 资源标签,对所有符合该标签的资源设置报警规则，对于新加入该标签的资源自动生效
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}