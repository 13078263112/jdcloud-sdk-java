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

package com.jdcloud.sdk.service.vod.model;


/**
 * storageSize
 */
public class StorageSize  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * size
     */
    private Long size;


    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get size
     *
     * @return
     */
    public Long getSize() {
        return size;
    }

    /**
     * set size
     *
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }


    /**
     * set startTime
     *
     * @param startTime
     */
    public StorageSize startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public StorageSize endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set size
     *
     * @param size
     */
    public StorageSize size(Long size) {
        this.size = size;
        return this;
    }


}