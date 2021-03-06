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

package com.microsoft.azure.management.websites;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import java.io.Closeable;
import java.net.URI;

/**
* The Windows Azure Web Sites management API provides a RESTful set of web
* services that interact with Windows Azure Web Sites service to manage your
* web sites. The API has entities that capture the relationship between an end
* user and the Windows Azure Web Sites service.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/dn166981.aspx for more
* information)
*/
public interface WebSiteManagementClient extends Closeable, FilterableService<WebSiteManagementClient> {
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    String getApiVersion();
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    URI getBaseUri();
    
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    SubscriptionCloudCredentials getCredentials();
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    int getLongRunningOperationInitialTimeout();
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue);
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    int getLongRunningOperationRetryTimeout();
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue);
    /**
    * User source controls operations
    * @return The SourceControlsOperations value.
    */
    SourceControlOperations getSourceControlsOperations();
    
    /**
    * Operations for managing the Web Hosting Plans in a resource group. Web
    * hosting plans (WHPs) represent a set of features and capacity that you
    * can share across your web sites. Web hosting plans support the 4 Azure
    * Web Sites pricing tiers (Free, Shared, Basic, and Standard) where each
    * tier has its own capabilities and capacity. Sites in the same
    * subscription, resource group, and geographic location can share a web
    * hosting plan. All the sites sharing a web hosting plan can leverage all
    * the capabilities and features defined by the web hosting plan tier. All
    * web sites associated with a given web hosting plan run on the resources
    * defined by the web hosting plan.  (see
    * http://azure.microsoft.com/en-us/documentation/articles/azure-web-sites-web-hosting-plans-in-depth-overview/
    * for more information)
    * @return The WebHostingPlansOperations value.
    */
    WebHostingPlanOperations getWebHostingPlansOperations();
    
    /**
    * Operations for managing the web sites in a web space.
    * @return The WebSitesOperations value.
    */
    WebSiteOperations getWebSitesOperations();
}
