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
 * Secret Management Service
 * 基于硬件保护机密的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.kms.model.SecretInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取机密列表
 */
public class DescribeSecretListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * secretList
     */
    private List<SecretInfo> secretList;

    /**
     * Secret的数量
     */
    private Integer totalCount;


    /**
     * get secretList
     *
     * @return
     */
    public List<SecretInfo> getSecretList() {
        return secretList;
    }

    /**
     * set secretList
     *
     * @param secretList
     */
    public void setSecretList(List<SecretInfo> secretList) {
        this.secretList = secretList;
    }

    /**
     * get Secret的数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set Secret的数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set secretList
     *
     * @param secretList
     */
    public DescribeSecretListResult secretList(List<SecretInfo> secretList) {
        this.secretList = secretList;
        return this;
    }

    /**
     * set Secret的数量
     *
     * @param totalCount
     */
    public DescribeSecretListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to secretList
     *
     * @param secretList
     */
    public void addSecretList(SecretInfo secretList) {
        if (this.secretList == null) {
            this.secretList = new ArrayList<>();
        }
        this.secretList.add(secretList);
    }

}