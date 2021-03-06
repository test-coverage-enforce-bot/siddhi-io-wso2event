/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.extension.siddhi.io.wso2event.source;

import org.wso2.siddhi.core.stream.input.source.Source;

import java.util.ArrayList;
import java.util.List;

/**
 * Dataholder for WSO2Event Source
 */
public class WSO2EventSourceDataHolder {

    private static List<Source> sources = new ArrayList<>();
    private static boolean isDatabridgeActivated;
    private WSO2EventSourceDataHolder() {
    }

    public static List<Source> getSources() {
        return WSO2EventSourceDataHolder.sources;
    }

    public static void setSources(List<Source> sources) {
        WSO2EventSourceDataHolder.sources = sources;
    }

    public static boolean isDatabridgeActivated() {
        return WSO2EventSourceDataHolder.isDatabridgeActivated;
    }

    public static void setDatabridgeActivated(boolean activated) {
        WSO2EventSourceDataHolder.isDatabridgeActivated = activated;
    }
}
