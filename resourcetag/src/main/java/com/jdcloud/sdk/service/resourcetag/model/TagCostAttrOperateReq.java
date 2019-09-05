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

package com.jdcloud.sdk.service.resourcetag.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * tagCostAttrOperateReq
 */
public class TagCostAttrOperateReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签键操作费用属性信息
     * Required:true
     */
    @Required
    private List<TagCostAttrOperation> operations;


    /**
     * get 标签键操作费用属性信息
     *
     * @return
     */
    public List<TagCostAttrOperation> getOperations() {
        return operations;
    }

    /**
     * set 标签键操作费用属性信息
     *
     * @param operations
     */
    public void setOperations(List<TagCostAttrOperation> operations) {
        this.operations = operations;
    }


    /**
     * set 标签键操作费用属性信息
     *
     * @param operations
     */
    public TagCostAttrOperateReq operations(List<TagCostAttrOperation> operations) {
        this.operations = operations;
        return this;
    }


    /**
     * add item to 标签键操作费用属性信息
     *
     * @param operation
     */
    public void addOperation(TagCostAttrOperation operation) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operation);
    }

}