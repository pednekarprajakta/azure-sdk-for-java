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

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;

/**
* The parameters supplied to a SetApplicationGatewayConfiguation request.
*/
public class ApplicationGatewaySetConfiguration extends OperationResponse {
    private ArrayList<BackendAddressPool> backendAddressPools;
    
    /**
    * Optional. Backend Address Pool
    * @return The BackendAddressPools value.
    */
    public ArrayList<BackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }
    
    /**
    * Optional. Backend Address Pool
    * @param backendAddressPoolsValue The BackendAddressPools value.
    */
    public void setBackendAddressPools(final ArrayList<BackendAddressPool> backendAddressPoolsValue) {
        this.backendAddressPools = backendAddressPoolsValue;
    }
    
    private ArrayList<BackendHttpSettings> backendHttpSettingsList;
    
    /**
    * Optional. Backend Http Setting
    * @return The BackendHttpSettingsList value.
    */
    public ArrayList<BackendHttpSettings> getBackendHttpSettingsList() {
        return this.backendHttpSettingsList;
    }
    
    /**
    * Optional. Backend Http Setting
    * @param backendHttpSettingsListValue The BackendHttpSettingsList value.
    */
    public void setBackendHttpSettingsList(final ArrayList<BackendHttpSettings> backendHttpSettingsListValue) {
        this.backendHttpSettingsList = backendHttpSettingsListValue;
    }
    
    private ArrayList<FrontendIPConfiguration> frontendIPConfigurations;
    
    /**
    * Optional. Frontend IPs of application gateway.
    * @return The FrontendIPConfigurations value.
    */
    public ArrayList<FrontendIPConfiguration> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }
    
    /**
    * Optional. Frontend IPs of application gateway.
    * @param frontendIPConfigurationsValue The FrontendIPConfigurations value.
    */
    public void setFrontendIPConfigurations(final ArrayList<FrontendIPConfiguration> frontendIPConfigurationsValue) {
        this.frontendIPConfigurations = frontendIPConfigurationsValue;
    }
    
    private ArrayList<FrontendPort> frontendPorts;
    
    /**
    * Optional. Frontend ports on the application gateway.
    * @return The FrontendPorts value.
    */
    public ArrayList<FrontendPort> getFrontendPorts() {
        return this.frontendPorts;
    }
    
    /**
    * Optional. Frontend ports on the application gateway.
    * @param frontendPortsValue The FrontendPorts value.
    */
    public void setFrontendPorts(final ArrayList<FrontendPort> frontendPortsValue) {
        this.frontendPorts = frontendPortsValue;
    }
    
    private ArrayList<AGHttpListener> httpListeners;
    
    /**
    * Optional. Backend Http Setting
    * @return The HttpListeners value.
    */
    public ArrayList<AGHttpListener> getHttpListeners() {
        return this.httpListeners;
    }
    
    /**
    * Optional. Backend Http Setting
    * @param httpListenersValue The HttpListeners value.
    */
    public void setHttpListeners(final ArrayList<AGHttpListener> httpListenersValue) {
        this.httpListeners = httpListenersValue;
    }
    
    private ArrayList<HttpLoadBalancingRule> httpLoadBalancingRules;
    
    /**
    * Optional. Backend Http Setting
    * @return The HttpLoadBalancingRules value.
    */
    public ArrayList<HttpLoadBalancingRule> getHttpLoadBalancingRules() {
        return this.httpLoadBalancingRules;
    }
    
    /**
    * Optional. Backend Http Setting
    * @param httpLoadBalancingRulesValue The HttpLoadBalancingRules value.
    */
    public void setHttpLoadBalancingRules(final ArrayList<HttpLoadBalancingRule> httpLoadBalancingRulesValue) {
        this.httpLoadBalancingRules = httpLoadBalancingRulesValue;
    }
    
    /**
    * Initializes a new instance of the ApplicationGatewaySetConfiguration
    * class.
    *
    */
    public ApplicationGatewaySetConfiguration() {
        super();
        this.setBackendAddressPools(new LazyArrayList<BackendAddressPool>());
        this.setBackendHttpSettingsList(new LazyArrayList<BackendHttpSettings>());
        this.setFrontendIPConfigurations(new LazyArrayList<FrontendIPConfiguration>());
        this.setFrontendPorts(new LazyArrayList<FrontendPort>());
        this.setHttpListeners(new LazyArrayList<AGHttpListener>());
        this.setHttpLoadBalancingRules(new LazyArrayList<HttpLoadBalancingRule>());
    }
}
