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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器计算资源信息
  - 容器必需的 CPU 展示为 0m 时，实际按照 2m 处理

 */
public class ResourceRequests  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器必需的计算资源
     */
    private Request requests;

    /**
     * 容器使用计算资源上限
     */
    private Request limits;


    /**
     * get 容器必需的计算资源
     *
     * @return
     */
    public Request getRequests() {
        return requests;
    }

    /**
     * set 容器必需的计算资源
     *
     * @param requests
     */
    public void setRequests(Request requests) {
        this.requests = requests;
    }

    /**
     * get 容器使用计算资源上限
     *
     * @return
     */
    public Request getLimits() {
        return limits;
    }

    /**
     * set 容器使用计算资源上限
     *
     * @param limits
     */
    public void setLimits(Request limits) {
        this.limits = limits;
    }


    /**
     * set 容器必需的计算资源
     *
     * @param requests
     */
    public ResourceRequests requests(Request requests) {
        this.requests = requests;
        return this;
    }

    /**
     * set 容器使用计算资源上限
     *
     * @param limits
     */
    public ResourceRequests limits(Request limits) {
        this.limits = limits;
        return this;
    }


}