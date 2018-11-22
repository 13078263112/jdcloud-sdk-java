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
 * 云监控规则相关接口
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.DescribedNoticeContacts;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询规则的报警联系人
 */
public class DescribeAlarmContactsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * contactsList
     */
    private List<DescribedNoticeContacts> contactsList;

    /**
     * 报警联系人总数
     */
    private Long total;


    /**
     * get contactsList
     *
     * @return
     */
    public List<DescribedNoticeContacts> getContactsList() {
        return contactsList;
    }

    /**
     * set contactsList
     *
     * @param contactsList
     */
    public void setContactsList(List<DescribedNoticeContacts> contactsList) {
        this.contactsList = contactsList;
    }

    /**
     * get 报警联系人总数
     *
     * @return
     */
    public Long getTotal() {
        return total;
    }

    /**
     * set 报警联系人总数
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }


    /**
     * set contactsList
     *
     * @param contactsList
     */
    public DescribeAlarmContactsResult contactsList(List<DescribedNoticeContacts> contactsList) {
        this.contactsList = contactsList;
        return this;
    }

    /**
     * set 报警联系人总数
     *
     * @param total
     */
    public DescribeAlarmContactsResult total(Long total) {
        this.total = total;
        return this;
    }


    /**
     * add item to contactsList
     *
     * @param contactsList
     */
    public void addContactsList(DescribedNoticeContacts contactsList) {
        if (this.contactsList == null) {
            this.contactsList = new ArrayList<>();
        }
        this.contactsList.add(contactsList);
    }

}