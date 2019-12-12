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
 * Resource API
 * 云托管服务的资源API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdccs.model.DescribeCabinet;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询机柜列表
 */
public class DescribeCabinetsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cabinets
     */
    private List<DescribeCabinet> cabinets;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 总数量
     */
    private Integer totalCount;


    /**
     * get cabinets
     *
     * @return
     */
    public List<DescribeCabinet> getCabinets() {
        return cabinets;
    }

    /**
     * set cabinets
     *
     * @param cabinets
     */
    public void setCabinets(List<DescribeCabinet> cabinets) {
        this.cabinets = cabinets;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set cabinets
     *
     * @param cabinets
     */
    public DescribeCabinetsResult cabinets(List<DescribeCabinet> cabinets) {
        this.cabinets = cabinets;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeCabinetsResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeCabinetsResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeCabinetsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to cabinets
     *
     * @param cabinet
     */
    public void addCabinet(DescribeCabinet cabinet) {
        if (this.cabinets == null) {
            this.cabinets = new ArrayList<>();
        }
        this.cabinets.add(cabinet);
    }

}