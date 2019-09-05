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
 * 修改转码模板请求信息
 */
public class UpdateTranscodeTemplateRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板名称。长度不超过128个字符。UTF-8编码。

     */
    private String name;

    /**
     * 视频参数配置
     */
    private Video video;

    /**
     * 音频参数配置
     */
    private Audio audio;

    /**
     * 封装配置
     */
    private Encapsulation encapsulation;

    /**
     * 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     */
    private String definition;

    /**
     * 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     */
    private String templateType;


    /**
     * get 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 视频参数配置
     *
     * @return
     */
    public Video getVideo() {
        return video;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * get 音频参数配置
     *
     * @return
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    /**
     * get 封装配置
     *
     * @return
     */
    public Encapsulation getEncapsulation() {
        return encapsulation;
    }

    /**
     * set 封装配置
     *
     * @param encapsulation
     */
    public void setEncapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
    }

    /**
     * get 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @return
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * get 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @return
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param templateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }


    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param name
     */
    public UpdateTranscodeTemplateRequestObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public UpdateTranscodeTemplateRequestObject video(Video video) {
        this.video = video;
        return this;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public UpdateTranscodeTemplateRequestObject audio(Audio audio) {
        this.audio = audio;
        return this;
    }

    /**
     * set 封装配置
     *
     * @param encapsulation
     */
    public UpdateTranscodeTemplateRequestObject encapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public UpdateTranscodeTemplateRequestObject definition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * set 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param templateType
     */
    public UpdateTranscodeTemplateRequestObject templateType(String templateType) {
        this.templateType = templateType;
        return this;
    }


}