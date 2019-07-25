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
 * Anti DDos Pro Web Rule Configuration APIs
 * Anti DDos Pro Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.ipanti.model.DisableWebRuleCCResponse;

/**
 * 关闭网站类规则 CC 防护, 网站类规则的 CC 防护规则和 CC 防护配置失效。支持批量操作, 批量操作时 webRuleId 传多个, 以 &#39;,&#39; 分隔, 返回 result.code 为 1 表示操作成功, 为 0 时可能全部失败, 也可能部分失败
 */
class DisableWebRuleCCExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:disableCC";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DisableWebRuleCCResponse.class;
    }
}
