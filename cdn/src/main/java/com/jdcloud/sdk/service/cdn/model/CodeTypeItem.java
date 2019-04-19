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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * codeTypeItem
 */
public class CodeTypeItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    private String code;

    /**
     * count
     */
    private Long count;

    /**
     * rank
     */
    private Integer rank;

    /**
     * percent
     */
    private String percent;

    /**
     * details
     */
    private List<CodeTypeDetailItem> details;


    /**
     * get code
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get count
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set count
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * get rank
     *
     * @return
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set rank
     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * get percent
     *
     * @return
     */
    public String getPercent() {
        return percent;
    }

    /**
     * set percent
     *
     * @param percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }

    /**
     * get details
     *
     * @return
     */
    public List<CodeTypeDetailItem> getDetails() {
        return details;
    }

    /**
     * set details
     *
     * @param details
     */
    public void setDetails(List<CodeTypeDetailItem> details) {
        this.details = details;
    }


    /**
     * set code
     *
     * @param code
     */
    public CodeTypeItem code(String code) {
        this.code = code;
        return this;
    }

    /**
     * set count
     *
     * @param count
     */
    public CodeTypeItem count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * set rank
     *
     * @param rank
     */
    public CodeTypeItem rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * set percent
     *
     * @param percent
     */
    public CodeTypeItem percent(String percent) {
        this.percent = percent;
        return this;
    }

    /**
     * set details
     *
     * @param details
     */
    public CodeTypeItem details(List<CodeTypeDetailItem> details) {
        this.details = details;
        return this;
    }


    /**
     * add item to details
     *
     * @param detail
     */
    public void addDetail(CodeTypeDetailItem detail) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detail);
    }

}