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
 * Price APIs
 * 价格计算API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.billing.model.OrderPriceProtocol;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询计费价格信息
 */
public class CalculateTotalPriceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作类型 1:创建 2:续费 3:升配 4:删除
     * Required:true
     */
    @Required
    private Integer cmd;

    /**
     * 计算价格的订单
     */
    private List<OrderPriceProtocol> orderList;

    /**
     * 操作时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     */
    private String operateTime;

    /**
     * 1:折扣（不需要传） 2:免费活动3:付费活动 4:推荐码 5:会员价 [{&quot;promotionType&quot;:1,&quot;activityCode&quot;:123},{&quot;promotionType&quot;:2,&quot;activityCode&quot;:}]
     */
    private String promotionInfo;

    /**
     * 客户端：1.PC端；2.移动端；
     */
    private Integer clientType;

    /**
     * 批量购买时数量
     * Required:true
     */
    @Required
    private Integer packageCount;

    /**
     * 临时升配时必传，3-临时升配
     */
    private Integer processType;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 操作类型 1:创建 2:续费 3:升配 4:删除
     *
     * @return
     */
    public Integer getCmd() {
        return cmd;
    }

    /**
     * set 操作类型 1:创建 2:续费 3:升配 4:删除
     *
     * @param cmd
     */
    public void setCmd(Integer cmd) {
        this.cmd = cmd;
    }

    /**
     * get 计算价格的订单
     *
     * @return
     */
    public List<OrderPriceProtocol> getOrderList() {
        return orderList;
    }

    /**
     * set 计算价格的订单
     *
     * @param orderList
     */
    public void setOrderList(List<OrderPriceProtocol> orderList) {
        this.orderList = orderList;
    }

    /**
     * get 操作时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * set 操作时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param operateTime
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * get 1:折扣（不需要传） 2:免费活动3:付费活动 4:推荐码 5:会员价 [{&quot;promotionType&quot;:1,&quot;activityCode&quot;:123},{&quot;promotionType&quot;:2,&quot;activityCode&quot;:}]
     *
     * @return
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * set 1:折扣（不需要传） 2:免费活动3:付费活动 4:推荐码 5:会员价 [{&quot;promotionType&quot;:1,&quot;activityCode&quot;:123},{&quot;promotionType&quot;:2,&quot;activityCode&quot;:}]
     *
     * @param promotionInfo
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    /**
     * get 客户端：1.PC端；2.移动端；
     *
     * @return
     */
    public Integer getClientType() {
        return clientType;
    }

    /**
     * set 客户端：1.PC端；2.移动端；
     *
     * @param clientType
     */
    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    /**
     * get 批量购买时数量
     *
     * @return
     */
    public Integer getPackageCount() {
        return packageCount;
    }

    /**
     * set 批量购买时数量
     *
     * @param packageCount
     */
    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    /**
     * get 临时升配时必传，3-临时升配
     *
     * @return
     */
    public Integer getProcessType() {
        return processType;
    }

    /**
     * set 临时升配时必传，3-临时升配
     *
     * @param processType
     */
    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 操作类型 1:创建 2:续费 3:升配 4:删除
     *
     * @param cmd
     */
    public CalculateTotalPriceRequest cmd(Integer cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * set 计算价格的订单
     *
     * @param orderList
     */
    public CalculateTotalPriceRequest orderList(List<OrderPriceProtocol> orderList) {
        this.orderList = orderList;
        return this;
    }

    /**
     * set 操作时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param operateTime
     */
    public CalculateTotalPriceRequest operateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * set 1:折扣（不需要传） 2:免费活动3:付费活动 4:推荐码 5:会员价 [{&quot;promotionType&quot;:1,&quot;activityCode&quot;:123},{&quot;promotionType&quot;:2,&quot;activityCode&quot;:}]
     *
     * @param promotionInfo
     */
    public CalculateTotalPriceRequest promotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * set 客户端：1.PC端；2.移动端；
     *
     * @param clientType
     */
    public CalculateTotalPriceRequest clientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * set 批量购买时数量
     *
     * @param packageCount
     */
    public CalculateTotalPriceRequest packageCount(Integer packageCount) {
        this.packageCount = packageCount;
        return this;
    }

    /**
     * set 临时升配时必传，3-临时升配
     *
     * @param processType
     */
    public CalculateTotalPriceRequest processType(Integer processType) {
        this.processType = processType;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public CalculateTotalPriceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 计算价格的订单
     *
     * @param orderList
     */
    public void addOrderList(OrderPriceProtocol orderList) {
        if (this.orderList == null) {
            this.orderList = new ArrayList<>();
        }
        this.orderList.add(orderList);
    }

}