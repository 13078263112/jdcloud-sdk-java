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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * updateWebHookSpec
 */
public class UpdateWebHookSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用, 1表示启用webHook，0表示禁用webHook，默认为1
     */
    private Long active;

    /**
     * webHook content
     */
    private String content;

    /**
     * webHook 协议,http或者https
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * webHook secret，用户请求签名，防伪造
     */
    private String secret;

    /**
     * webHook url
     * Required:true
     */
    @Required
    private String url;


    /**
     * get 是否启用, 1表示启用webHook，0表示禁用webHook，默认为1
     *
     * @return
     */
    public Long getActive() {
        return active;
    }

    /**
     * set 是否启用, 1表示启用webHook，0表示禁用webHook，默认为1
     *
     * @param active
     */
    public void setActive(Long active) {
        this.active = active;
    }

    /**
     * get webHook content
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set webHook content
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get webHook 协议,http或者https
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set webHook 协议,http或者https
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get webHook secret，用户请求签名，防伪造
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set webHook secret，用户请求签名，防伪造
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get webHook url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set webHook url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set 是否启用, 1表示启用webHook，0表示禁用webHook，默认为1
     *
     * @param active
     */
    public UpdateWebHookSpec active(Long active) {
        this.active = active;
        return this;
    }

    /**
     * set webHook content
     *
     * @param content
     */
    public UpdateWebHookSpec content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set webHook 协议,http或者https
     *
     * @param protocol
     */
    public UpdateWebHookSpec protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set webHook secret，用户请求签名，防伪造
     *
     * @param secret
     */
    public UpdateWebHookSpec secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set webHook url
     *
     * @param url
     */
    public UpdateWebHookSpec url(String url) {
        this.url = url;
        return this;
    }


}