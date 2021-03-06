/**
 *
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.microsoft.azure.keyvault.models;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;

public class ErrorResponseMessage {
    @JsonProperty("error")
    private Error error;

    /**
     * @return The Error value
     */
    public Error getError() {
        return error;
    }

    /**
     * @param errorValue
     *            The Error value
     */
    public void setError(Error errorValue) {
        error = errorValue;
    }

    /**
     * Extension data
     */
    private Map<String, Object> additionalInfo;

    /**
     * @return The AdditionalInfo value
     */
    public Map<String, Object> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * @param resultValue
     *            The Result value
     */
    @JsonAnySetter()
    public void putAdditionalInfo(String key, Object value) {
        additionalInfo.put(key, value);
    }

    /**
     * Default constructor
     */
    public ErrorResponseMessage() {
        additionalInfo = new HashMap<String, Object>();
    }
}
