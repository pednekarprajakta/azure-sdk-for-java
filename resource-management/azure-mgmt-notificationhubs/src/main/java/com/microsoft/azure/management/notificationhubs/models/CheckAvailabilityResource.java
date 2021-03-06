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

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs.models;

import com.microsoft.windowsazure.core.LazyHashMap;

import java.util.HashMap;

/**
* Description of a CheckAvailibility resource.
*/
public class CheckAvailabilityResource {
    private String id;
    
    /**
    * Optional. Gets or sets the id
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Optional. Gets or sets the id
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private boolean isAvailable;
    
    /**
    * Optional. Gets or sets true if the name is available and can be used to
    * create new Namespace/NotificationHub. Otherwise false.
    * @return The IsAvailable value.
    */
    public boolean isAvailable() {
        return this.isAvailable;
    }
    
    /**
    * Optional. Gets or sets true if the name is available and can be used to
    * create new Namespace/NotificationHub. Otherwise false.
    * @param isAvailableValue The IsAvailable value.
    */
    public void setIsAvailable(final boolean isAvailableValue) {
        this.isAvailable = isAvailableValue;
    }
    
    private String location;
    
    /**
    * Optional. Gets or sets datacenter location
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. Gets or sets datacenter location
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets name
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets name
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private HashMap<String, String> tags;
    
    /**
    * Optional. Gets or sets tags
    * @return The Tags value.
    */
    public HashMap<String, String> getTags() {
        return this.tags;
    }
    
    /**
    * Optional. Gets or sets tags
    * @param tagsValue The Tags value.
    */
    public void setTags(final HashMap<String, String> tagsValue) {
        this.tags = tagsValue;
    }
    
    private String type;
    
    /**
    * Optional. Gets or sets resource type
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. Gets or sets resource type
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the CheckAvailabilityResource class.
    *
    */
    public CheckAvailabilityResource() {
        this.setTags(new LazyHashMap<String, String>());
    }
}
