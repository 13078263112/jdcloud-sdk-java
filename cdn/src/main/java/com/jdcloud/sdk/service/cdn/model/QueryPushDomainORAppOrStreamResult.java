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
 * 直播域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户推流域名app名/流名
 */
public class QueryPushDomainORAppOrStreamResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * streams
     */
    private List<String> streams;


    /**
     * get streams
     *
     * @return
     */
    public List<String> getStreams() {
        return streams;
    }

    /**
     * set streams
     *
     * @param streams
     */
    public void setStreams(List<String> streams) {
        this.streams = streams;
    }


    /**
     * set streams
     *
     * @param streams
     */
    public QueryPushDomainORAppOrStreamResult streams(List<String> streams) {
        this.streams = streams;
        return this;
    }


    /**
     * add item to streams
     *
     * @param stream
     */
    public void addStream(String stream) {
        if (this.streams == null) {
            this.streams = new ArrayList<>();
        }
        this.streams.add(stream);
    }

}