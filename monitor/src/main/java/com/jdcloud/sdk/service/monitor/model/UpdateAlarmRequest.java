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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.BaseContact;
import com.jdcloud.sdk.service.monitor.model.NoticeOption;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.ResourceOption;
import com.jdcloud.sdk.service.monitor.model.RuleOption;
import com.jdcloud.sdk.service.monitor.model.WebHookOption;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改已创建的报警规则
 */
public class UpdateAlarmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 告警通知联系人
     */
    private List<BaseContact> baseContact;

    /**
     * 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     */
    private String dimension;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     */
    private Long enabled;

    /**
     * 通知策略
     */
    private List<NoticeOption> noticeOption;

    /**
     * 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     * Required:true
     */
    @Required
    private String product;

    /**
     * resourceOption
     * Required:true
     */
    @Required
    private ResourceOption resourceOption;

    /**
     * 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     * Required:true
     */
    @Required
    private String ruleName;

    /**
     * ruleOption
     * Required:true
     */
    @Required
    private RuleOption ruleOption;

    /**
     * 规则类型, 默认为resourceMonitor
     */
    private String ruleType;

    /**
     * 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     */
    private Object tags;

    /**
     * webHookOption
     */
    private WebHookOption webHookOption;

    /**
     * 规则id
     * Required:true
     */
    @Required
    private String alarmId;


    /**
     * get 告警通知联系人
     *
     * @return
     */
    public List<BaseContact> getBaseContact() {
        return baseContact;
    }

    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public void setBaseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
    }

    /**
     * get 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 通知策略
     *
     * @return
     */
    public List<NoticeOption> getNoticeOption() {
        return noticeOption;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public void setNoticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
    }

    /**
     * get 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get resourceOption
     *
     * @return
     */
    public ResourceOption getResourceOption() {
        return resourceOption;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public void setResourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
    }

    /**
     * get 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get ruleOption
     *
     * @return
     */
    public RuleOption getRuleOption() {
        return ruleOption;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public void setRuleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
    }

    /**
     * get 规则类型, 默认为resourceMonitor
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    /**
     * get webHookOption
     *
     * @return
     */
    public WebHookOption getWebHookOption() {
        return webHookOption;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public void setWebHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
    }

    /**
     * get 规则id
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 规则id
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }


    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public UpdateAlarmRequest baseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
        return this;
    }

    /**
     * set 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @param dimension
     */
    public UpdateAlarmRequest dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public UpdateAlarmRequest enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public UpdateAlarmRequest noticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
        return this;
    }

    /**
     * set 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @param product
     */
    public UpdateAlarmRequest product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public UpdateAlarmRequest resourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
        return this;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public UpdateAlarmRequest ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public UpdateAlarmRequest ruleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
        return this;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public UpdateAlarmRequest ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public UpdateAlarmRequest tags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public UpdateAlarmRequest webHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
        return this;
    }

    /**
     * set 规则id
     *
     * @param alarmId
     */
    public UpdateAlarmRequest alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }


    /**
     * add item to 告警通知联系人
     *
     * @param baseContact
     */
    public void addBaseContact(BaseContact baseContact) {
        if (this.baseContact == null) {
            this.baseContact = new ArrayList<>();
        }
        this.baseContact.add(baseContact);
    }

    /**
     * add item to 通知策略
     *
     * @param noticeOption
     */
    public void addNoticeOption(NoticeOption noticeOption) {
        if (this.noticeOption == null) {
            this.noticeOption = new ArrayList<>();
        }
        this.noticeOption.add(noticeOption);
    }

}