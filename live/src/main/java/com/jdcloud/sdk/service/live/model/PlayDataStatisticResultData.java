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

package com.jdcloud.sdk.service.live.model;


/**
 * playDataStatisticResultData
 */
public class PlayDataStatisticResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 带宽，单位：bps

     */
    private Long avgbandwidth;

    /**
     * 带宽峰值时间点，单位：秒

     */
    private Long maxavgbandwidthtime;

    /**
     * PV

     */
    private Long pv;

    /**
     * 流量，单位:Byte

     */
    private Long flow;

    /**
     * 在线人数

     */
    private Long playercount;


    /**
     * get 带宽，单位：bps

     *
     * @return
     */
    public Long getAvgbandwidth() {
        return avgbandwidth;
    }

    /**
     * set 带宽，单位：bps

     *
     * @param avgbandwidth
     */
    public void setAvgbandwidth(Long avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
    }

    /**
     * get 带宽峰值时间点，单位：秒

     *
     * @return
     */
    public Long getMaxavgbandwidthtime() {
        return maxavgbandwidthtime;
    }

    /**
     * set 带宽峰值时间点，单位：秒

     *
     * @param maxavgbandwidthtime
     */
    public void setMaxavgbandwidthtime(Long maxavgbandwidthtime) {
        this.maxavgbandwidthtime = maxavgbandwidthtime;
    }

    /**
     * get PV

     *
     * @return
     */
    public Long getPv() {
        return pv;
    }

    /**
     * set PV

     *
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
    }

    /**
     * get 流量，单位:Byte

     *
     * @return
     */
    public Long getFlow() {
        return flow;
    }

    /**
     * set 流量，单位:Byte

     *
     * @param flow
     */
    public void setFlow(Long flow) {
        this.flow = flow;
    }

    /**
     * get 在线人数

     *
     * @return
     */
    public Long getPlayercount() {
        return playercount;
    }

    /**
     * set 在线人数

     *
     * @param playercount
     */
    public void setPlayercount(Long playercount) {
        this.playercount = playercount;
    }


    /**
     * set 带宽，单位：bps

     *
     * @param avgbandwidth
     */
    public PlayDataStatisticResultData avgbandwidth(Long avgbandwidth) {
        this.avgbandwidth = avgbandwidth;
        return this;
    }

    /**
     * set 带宽峰值时间点，单位：秒

     *
     * @param maxavgbandwidthtime
     */
    public PlayDataStatisticResultData maxavgbandwidthtime(Long maxavgbandwidthtime) {
        this.maxavgbandwidthtime = maxavgbandwidthtime;
        return this;
    }

    /**
     * set PV

     *
     * @param pv
     */
    public PlayDataStatisticResultData pv(Long pv) {
        this.pv = pv;
        return this;
    }

    /**
     * set 流量，单位:Byte

     *
     * @param flow
     */
    public PlayDataStatisticResultData flow(Long flow) {
        this.flow = flow;
        return this;
    }

    /**
     * set 在线人数

     *
     * @param playercount
     */
    public PlayDataStatisticResultData playercount(Long playercount) {
        this.playercount = playercount;
        return this;
    }


}