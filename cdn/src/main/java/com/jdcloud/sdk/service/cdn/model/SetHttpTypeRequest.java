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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置http协议
 */
public class SetHttpTypeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * http类型,只能为http或者https,默认为http.当设为https时,需要调用“设置通讯协议”接口上传证书和私钥
     */
    private String httpType;

    /**
     * 用户证书,当Type为https时必须设置
     */
    private String certificate;

    /**
     * 证书私钥
     */
    private String rsaKey;

    /**
     * 有三种类型：default、http、https
     */
    private String jumpType;

    /**
     * 证书来源有两种类型：default,ssl
     */
    private String certFrom;

    /**
     * ssl证书id
     */
    private String sslCertId;

    /**
     * 是否同步到ssl,boolean值，取值true或者false
     */
    private Boolean syncToSsl;

    /**
     * syncToSsl是true时，certName是必填项
     */
    private String certName;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get http类型,只能为http或者https,默认为http.当设为https时,需要调用“设置通讯协议”接口上传证书和私钥
     *
     * @return
     */
    public String getHttpType() {
        return httpType;
    }

    /**
     * set http类型,只能为http或者https,默认为http.当设为https时,需要调用“设置通讯协议”接口上传证书和私钥
     *
     * @param httpType
     */
    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }

    /**
     * get 用户证书,当Type为https时必须设置
     *
     * @return
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * set 用户证书,当Type为https时必须设置
     *
     * @param certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * get 证书私钥
     *
     * @return
     */
    public String getRsaKey() {
        return rsaKey;
    }

    /**
     * set 证书私钥
     *
     * @param rsaKey
     */
    public void setRsaKey(String rsaKey) {
        this.rsaKey = rsaKey;
    }

    /**
     * get 有三种类型：default、http、https
     *
     * @return
     */
    public String getJumpType() {
        return jumpType;
    }

    /**
     * set 有三种类型：default、http、https
     *
     * @param jumpType
     */
    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    /**
     * get 证书来源有两种类型：default,ssl
     *
     * @return
     */
    public String getCertFrom() {
        return certFrom;
    }

    /**
     * set 证书来源有两种类型：default,ssl
     *
     * @param certFrom
     */
    public void setCertFrom(String certFrom) {
        this.certFrom = certFrom;
    }

    /**
     * get ssl证书id
     *
     * @return
     */
    public String getSslCertId() {
        return sslCertId;
    }

    /**
     * set ssl证书id
     *
     * @param sslCertId
     */
    public void setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
    }

    /**
     * get 是否同步到ssl,boolean值，取值true或者false
     *
     * @return
     */
    public Boolean getSyncToSsl() {
        return syncToSsl;
    }

    /**
     * set 是否同步到ssl,boolean值，取值true或者false
     *
     * @param syncToSsl
     */
    public void setSyncToSsl(Boolean syncToSsl) {
        this.syncToSsl = syncToSsl;
    }

    /**
     * get syncToSsl是true时，certName是必填项
     *
     * @return
     */
    public String getCertName() {
        return certName;
    }

    /**
     * set syncToSsl是true时，certName是必填项
     *
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set http类型,只能为http或者https,默认为http.当设为https时,需要调用“设置通讯协议”接口上传证书和私钥
     *
     * @param httpType
     */
    public SetHttpTypeRequest httpType(String httpType) {
        this.httpType = httpType;
        return this;
    }

    /**
     * set 用户证书,当Type为https时必须设置
     *
     * @param certificate
     */
    public SetHttpTypeRequest certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * set 证书私钥
     *
     * @param rsaKey
     */
    public SetHttpTypeRequest rsaKey(String rsaKey) {
        this.rsaKey = rsaKey;
        return this;
    }

    /**
     * set 有三种类型：default、http、https
     *
     * @param jumpType
     */
    public SetHttpTypeRequest jumpType(String jumpType) {
        this.jumpType = jumpType;
        return this;
    }

    /**
     * set 证书来源有两种类型：default,ssl
     *
     * @param certFrom
     */
    public SetHttpTypeRequest certFrom(String certFrom) {
        this.certFrom = certFrom;
        return this;
    }

    /**
     * set ssl证书id
     *
     * @param sslCertId
     */
    public SetHttpTypeRequest sslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }

    /**
     * set 是否同步到ssl,boolean值，取值true或者false
     *
     * @param syncToSsl
     */
    public SetHttpTypeRequest syncToSsl(Boolean syncToSsl) {
        this.syncToSsl = syncToSsl;
        return this;
    }

    /**
     * set syncToSsl是true时，certName是必填项
     *
     * @param certName
     */
    public SetHttpTypeRequest certName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetHttpTypeRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}