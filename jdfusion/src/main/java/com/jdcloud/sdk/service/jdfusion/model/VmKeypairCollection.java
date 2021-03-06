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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vmKeypairCollection
 */
public class VmKeypairCollection  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * keypairs
     */
    private List<KeypairInfo> keypairs;


    /**
     * get keypairs
     *
     * @return
     */
    public List<KeypairInfo> getKeypairs() {
        return keypairs;
    }

    /**
     * set keypairs
     *
     * @param keypairs
     */
    public void setKeypairs(List<KeypairInfo> keypairs) {
        this.keypairs = keypairs;
    }


    /**
     * set keypairs
     *
     * @param keypairs
     */
    public VmKeypairCollection keypairs(List<KeypairInfo> keypairs) {
        this.keypairs = keypairs;
        return this;
    }


    /**
     * add item to keypairs
     *
     * @param keypair
     */
    public void addKeypair(KeypairInfo keypair) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        this.keypairs.add(keypair);
    }

}