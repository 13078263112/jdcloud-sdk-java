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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.AttackDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询攻击记录详情
 */
public class WafQueryAttackDetailsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * total
     */
    private String total;

    /**
     * attackDetails
     */
    private List<AttackDetail> attackDetails;


    /**
     * get total
     *
     * @return
     */
    public String getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * get attackDetails
     *
     * @return
     */
    public List<AttackDetail> getAttackDetails() {
        return attackDetails;
    }

    /**
     * set attackDetails
     *
     * @param attackDetails
     */
    public void setAttackDetails(List<AttackDetail> attackDetails) {
        this.attackDetails = attackDetails;
    }


    /**
     * set total
     *
     * @param total
     */
    public WafQueryAttackDetailsResult total(String total) {
        this.total = total;
        return this;
    }

    /**
     * set attackDetails
     *
     * @param attackDetails
     */
    public WafQueryAttackDetailsResult attackDetails(List<AttackDetail> attackDetails) {
        this.attackDetails = attackDetails;
        return this;
    }


    /**
     * add item to attackDetails
     *
     * @param attackDetail
     */
    public void addAttackDetail(AttackDetail attackDetail) {
        if (this.attackDetails == null) {
            this.attackDetails = new ArrayList<>();
        }
        this.attackDetails.add(attackDetail);
    }

}