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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * startShippersSpec
 */
public class StartShippersSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转储任务uuid列表
     * Required:true
     */
    @Required
    private List<String> shipperList;


    /**
     * get 转储任务uuid列表
     *
     * @return
     */
    public List<String> getShipperList() {
        return shipperList;
    }

    /**
     * set 转储任务uuid列表
     *
     * @param shipperList
     */
    public void setShipperList(List<String> shipperList) {
        this.shipperList = shipperList;
    }


    /**
     * set 转储任务uuid列表
     *
     * @param shipperList
     */
    public StartShippersSpec shipperList(List<String> shipperList) {
        this.shipperList = shipperList;
        return this;
    }


    /**
     * add item to 转储任务uuid列表
     *
     * @param shipperList
     */
    public void addShipperList(String shipperList) {
        if (this.shipperList == null) {
            this.shipperList = new ArrayList<>();
        }
        this.shipperList.add(shipperList);
    }

}