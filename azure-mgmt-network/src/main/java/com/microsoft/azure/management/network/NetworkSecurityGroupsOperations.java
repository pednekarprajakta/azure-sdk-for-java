/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.NetworkSecurityGroup;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkSecurityGroupsOperations.
 */
public interface NetworkSecurityGroupsOperations {
    /**
     * The interface defining all the services for NetworkSecurityGroupsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkSecurityGroupsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("networkSecurityGroupName") String networkSecurityGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("networkSecurityGroupName") String networkSecurityGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("networkSecurityGroupName") String networkSecurityGroupName, @Path("subscriptionId") String subscriptionId, @Body NetworkSecurityGroup parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/networkSecurityGroups")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String networkSecurityGroupName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String networkSecurityGroupName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkSecurityGroup object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<NetworkSecurityGroup> get(String resourceGroupName, String networkSecurityGroupName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String networkSecurityGroupName, String expand, final ServiceCallback<NetworkSecurityGroup> serviceCallback);

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the NetworkSecurityGroup object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<NetworkSecurityGroup> createOrUpdate(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, final ServiceCallback<NetworkSecurityGroup> serviceCallback);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<NetworkSecurityGroup>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ListOperationCallback<NetworkSecurityGroup> serviceCallback);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<NetworkSecurityGroup>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final String resourceGroupName, final ListOperationCallback<NetworkSecurityGroup> serviceCallback);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkSecurityGroup>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(final String nextPageLink, final ListOperationCallback<NetworkSecurityGroup> serviceCallback);

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkSecurityGroup>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<NetworkSecurityGroup> serviceCallback);

}