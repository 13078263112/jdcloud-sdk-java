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
 * Domain
 * 域名配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vod.model.DeleteDomainResponse;

/**
 * 删除域名。执行该操作，需确保域名已被停用。
 */
class DeleteDomainExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/domains/{domainId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteDomainResponse.class;
    }
}
