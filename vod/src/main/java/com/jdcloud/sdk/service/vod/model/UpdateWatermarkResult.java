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
 * Watermark
 * 水印管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改水印
 */
public class UpdateWatermarkResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 水印ID
     */
    private Long id;

    /**
     * 水印名称。只支持中英文、数字。长度不超过128个字符。UTF-8编码。

     */
    private String name;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 水印宽度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     */
    private String width;

    /**
     * 水印高度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     */
    private String height;

    /**
     * 尺寸单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     */
    private String sizeUnit;

    /**
     * 水印位置。取值范围：
  LT - 左上
  RT - 右上
  LB - 左下
  RB - 右下
     */
    private String position;

    /**
     * 水平偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     */
    private String offsetX;

    /**
     * 竖直偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     */
    private String offsetY;

    /**
     * 偏移单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     */
    private String offsetUnit;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 水印ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 水印ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 水印名称。只支持中英文、数字。长度不超过128个字符。UTF-8编码。

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 水印名称。只支持中英文、数字。长度不超过128个字符。UTF-8编码。

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 图片地址
     *
     * @return
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * set 图片地址
     *
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * get 水印宽度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @return
     */
    public String getWidth() {
        return width;
    }

    /**
     * set 水印宽度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * get 水印高度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @return
     */
    public String getHeight() {
        return height;
    }

    /**
     * set 水印高度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * get 尺寸单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @return
     */
    public String getSizeUnit() {
        return sizeUnit;
    }

    /**
     * set 尺寸单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @param sizeUnit
     */
    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    /**
     * get 水印位置。取值范围：
  LT - 左上
  RT - 右上
  LB - 左下
  RB - 右下
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     * set 水印位置。取值范围：
  LT - 左上
  RT - 右上
  LB - 左下
  RB - 右下
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * get 水平偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @return
     */
    public String getOffsetX() {
        return offsetX;
    }

    /**
     * set 水平偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param offsetX
     */
    public void setOffsetX(String offsetX) {
        this.offsetX = offsetX;
    }

    /**
     * get 竖直偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @return
     */
    public String getOffsetY() {
        return offsetY;
    }

    /**
     * set 竖直偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param offsetY
     */
    public void setOffsetY(String offsetY) {
        this.offsetY = offsetY;
    }

    /**
     * get 偏移单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @return
     */
    public String getOffsetUnit() {
        return offsetUnit;
    }

    /**
     * set 偏移单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @param offsetUnit
     */
    public void setOffsetUnit(String offsetUnit) {
        this.offsetUnit = offsetUnit;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 水印ID
     *
     * @param id
     */
    public UpdateWatermarkResult id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 水印名称。只支持中英文、数字。长度不超过128个字符。UTF-8编码。

     *
     * @param name
     */
    public UpdateWatermarkResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 图片地址
     *
     * @param imgUrl
     */
    public UpdateWatermarkResult imgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    /**
     * set 水印宽度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param width
     */
    public UpdateWatermarkResult width(String width) {
        this.width = width;
        return this;
    }

    /**
     * set 水印高度。
当 sizeUnit &#x3D; pixel 时，取值范围为 [8, 4096] 整数
当 sizeUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param height
     */
    public UpdateWatermarkResult height(String height) {
        this.height = height;
        return this;
    }

    /**
     * set 尺寸单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @param sizeUnit
     */
    public UpdateWatermarkResult sizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
        return this;
    }

    /**
     * set 水印位置。取值范围：
  LT - 左上
  RT - 右上
  LB - 左下
  RB - 右下
     *
     * @param position
     */
    public UpdateWatermarkResult position(String position) {
        this.position = position;
        return this;
    }

    /**
     * set 水平偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param offsetX
     */
    public UpdateWatermarkResult offsetX(String offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * set 竖直偏移。
当 offsetUnit &#x3D; pixel 时，取值范围为 [8, 4088] 整数
当 offsetUnit &#x3D; percent 时，取值范围为 [0, 100] 小数

     *
     * @param offsetY
     */
    public UpdateWatermarkResult offsetY(String offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    /**
     * set 偏移单位。取值范围：
  pixel - 像素
  percent - 百分比
默认值为 pixel

     *
     * @param offsetUnit
     */
    public UpdateWatermarkResult offsetUnit(String offsetUnit) {
        this.offsetUnit = offsetUnit;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public UpdateWatermarkResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public UpdateWatermarkResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}