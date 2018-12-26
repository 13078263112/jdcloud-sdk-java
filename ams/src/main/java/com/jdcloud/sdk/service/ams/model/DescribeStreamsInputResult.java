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
 * 应用管理平台API (仅对授权用户使用)
 * 应用管理平台API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ams.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ams.model.StreamInputData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取收流基础数据查询
 */
public class DescribeStreamsInputResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * streamInputDatas
     */
    private List<StreamInputData> streamInputDatas;


    /**
     * get streamInputDatas
     *
     * @return
     */
    public List<StreamInputData> getStreamInputDatas() {
        return streamInputDatas;
    }

    /**
     * set streamInputDatas
     *
     * @param streamInputDatas
     */
    public void setStreamInputDatas(List<StreamInputData> streamInputDatas) {
        this.streamInputDatas = streamInputDatas;
    }


    /**
     * set streamInputDatas
     *
     * @param streamInputDatas
     */
    public DescribeStreamsInputResult streamInputDatas(List<StreamInputData> streamInputDatas) {
        this.streamInputDatas = streamInputDatas;
        return this;
    }


    /**
     * add item to streamInputDatas
     *
     * @param streamInputData
     */
    public void addStreamInputData(StreamInputData streamInputData) {
        if (this.streamInputDatas == null) {
            this.streamInputDatas = new ArrayList<>();
        }
        this.streamInputDatas.add(streamInputData);
    }

}