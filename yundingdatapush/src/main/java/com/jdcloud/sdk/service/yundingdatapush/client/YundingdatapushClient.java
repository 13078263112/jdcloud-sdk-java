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
 * 云鼎2.0数据推送 openApi
 * 云鼎2.0数据推送 openApi 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yundingdatapush.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.yundingdatapush.model.AddDatapushVenderRequest;
import com.jdcloud.sdk.service.yundingdatapush.model.AddDatapushVenderResponse;
import com.jdcloud.sdk.service.yundingdatapush.client.AddDatapushVenderExecutor;
import com.jdcloud.sdk.service.yundingdatapush.model.CreateOrderSyncRequest;
import com.jdcloud.sdk.service.yundingdatapush.model.CreateOrderSyncResponse;
import com.jdcloud.sdk.service.yundingdatapush.client.CreateOrderSyncExecutor;
import com.jdcloud.sdk.service.yundingdatapush.model.DescribeDatapushVendersRequest;
import com.jdcloud.sdk.service.yundingdatapush.model.DescribeDatapushVendersResponse;
import com.jdcloud.sdk.service.yundingdatapush.client.DescribeDatapushVendersExecutor;
import com.jdcloud.sdk.service.yundingdatapush.model.DescribeRdsInstancesRequest;
import com.jdcloud.sdk.service.yundingdatapush.model.DescribeRdsInstancesResponse;
import com.jdcloud.sdk.service.yundingdatapush.client.DescribeRdsInstancesExecutor;
import com.jdcloud.sdk.service.yundingdatapush.model.DeleteDatapushVenderRequest;
import com.jdcloud.sdk.service.yundingdatapush.model.DeleteDatapushVenderResponse;
import com.jdcloud.sdk.service.yundingdatapush.client.DeleteDatapushVenderExecutor;

/**
 * yundingdatapushClient
 */
public class YundingdatapushClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "yundingdatapush.jdcloud-api.com";
    public final static String ServiceName = "yundingdatapush";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private YundingdatapushClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 添加数据推送用户
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDatapushVenderResponse addDatapushVender(AddDatapushVenderRequest request) throws JdcloudSdkException {
        return new AddDatapushVenderExecutor().client(this).execute(request);
    }

    /**
     * 创建历史订单同步
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateOrderSyncResponse createOrderSync(CreateOrderSyncRequest request) throws JdcloudSdkException {
        return new CreateOrderSyncExecutor().client(this).execute(request);
    }

    /**
     * 查询已经开通的用户
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDatapushVendersResponse describeDatapushVenders(DescribeDatapushVendersRequest request) throws JdcloudSdkException {
        return new DescribeDatapushVendersExecutor().client(this).execute(request);
    }

    /**
     * 查询已绑定数据推送的数据库实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRdsInstancesResponse describeRdsInstances(DescribeRdsInstancesRequest request) throws JdcloudSdkException {
        return new DescribeRdsInstancesExecutor().client(this).execute(request);
    }

    /**
     * 删除数据推送用户
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDatapushVenderResponse deleteDatapushVender(DeleteDatapushVenderRequest request) throws JdcloudSdkException {
        return new DeleteDatapushVenderExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public YundingdatapushClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private YundingdatapushClient yundingdatapushClient;

        public DefaultBuilder() {
            yundingdatapushClient = new YundingdatapushClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            yundingdatapushClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            yundingdatapushClient.httpRequestConfig = config;
            return this;
        }

        public YundingdatapushClient build() throws JdcloudSdkException {

            if (yundingdatapushClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                yundingdatapushClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (yundingdatapushClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("YundingdatapushClient build error: jdcloud credentials provider not set");
                }
            }
            if (yundingdatapushClient.httpRequestConfig == null) {
                yundingdatapushClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (yundingdatapushClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("YundingdatapushClient build error: http request config not set");
                }
            }
            return yundingdatapushClient;
        }

        public Builder environment(Environment environment) {
            yundingdatapushClient.environment = environment;
            return this;
        }
    }
}
