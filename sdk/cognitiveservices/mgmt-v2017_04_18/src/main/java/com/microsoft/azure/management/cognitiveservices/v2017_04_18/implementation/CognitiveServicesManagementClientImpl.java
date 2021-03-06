/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckDomainAvailabilityParameter;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CheckSkuAvailabilityParameter;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the CognitiveServicesManagementClientImpl class.
 */
public class CognitiveServicesManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private CognitiveServicesManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Azure Subscription ID. */
    private String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Azure Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public CognitiveServicesManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Version of the API to be used with the client request. Current version is 2017-04-18. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. Current version is 2017-04-18.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public CognitiveServicesManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public CognitiveServicesManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public CognitiveServicesManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AccountsInner object to access its operations.
     */
    private AccountsInner accounts;

    /**
     * Gets the AccountsInner object to access its operations.
     * @return the AccountsInner object.
     */
    public AccountsInner accounts() {
        return this.accounts;
    }

    /**
     * The ResourceSkusInner object to access its operations.
     */
    private ResourceSkusInner resourceSkus;

    /**
     * Gets the ResourceSkusInner object to access its operations.
     * @return the ResourceSkusInner object.
     */
    public ResourceSkusInner resourceSkus() {
        return this.resourceSkus;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of CognitiveServicesManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public CognitiveServicesManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of CognitiveServicesManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public CognitiveServicesManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of CognitiveServicesManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public CognitiveServicesManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-04-18";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.accounts = new AccountsInner(restClient().retrofit(), this);
        this.resourceSkus = new ResourceSkusInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "CognitiveServicesManagementClient", "2017-04-18");
    }

    private void initializeService() {
        service = restClient().retrofit().create(CognitiveServicesManagementClientService.class);
    }

    /**
     * The interface defining all the services for CognitiveServicesManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CognitiveServicesManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesManagementClient checkSkuAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.CognitiveServices/locations/{location}/checkSkuAvailability")
        Observable<Response<ResponseBody>> checkSkuAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckSkuAvailabilityParameter parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesManagementClient checkDomainAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.CognitiveServices/checkDomainAvailability")
        Observable<Response<ResponseBody>> checkDomainAvailability(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckDomainAvailabilityParameter parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckSkuAvailabilityResultListInner object if successful.
     */
    public CheckSkuAvailabilityResultListInner checkSkuAvailability(String location, List<String> skus, String kind, String type) {
        return checkSkuAvailabilityWithServiceResponseAsync(location, skus, kind, type).toBlocking().single().body();
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource.
     * @param type The Type of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckSkuAvailabilityResultListInner> checkSkuAvailabilityAsync(String location, List<String> skus, String kind, String type, final ServiceCallback<CheckSkuAvailabilityResultListInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkSkuAvailabilityWithServiceResponseAsync(location, skus, kind, type), serviceCallback);
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckSkuAvailabilityResultListInner object
     */
    public Observable<CheckSkuAvailabilityResultListInner> checkSkuAvailabilityAsync(String location, List<String> skus, String kind, String type) {
        return checkSkuAvailabilityWithServiceResponseAsync(location, skus, kind, type).map(new Func1<ServiceResponse<CheckSkuAvailabilityResultListInner>, CheckSkuAvailabilityResultListInner>() {
            @Override
            public CheckSkuAvailabilityResultListInner call(ServiceResponse<CheckSkuAvailabilityResultListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckSkuAvailabilityResultListInner object
     */
    public Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>> checkSkuAvailabilityWithServiceResponseAsync(String location, List<String> skus, String kind, String type) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (kind == null) {
            throw new IllegalArgumentException("Parameter kind is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        Validator.validate(skus);
        CheckSkuAvailabilityParameter parameters = new CheckSkuAvailabilityParameter();
        parameters.withSkus(skus);
        parameters.withKind(kind);
        parameters.withType(type);
        return service.checkSkuAvailability(this.subscriptionId(), location, this.apiVersion(), this.acceptLanguage(), parameters, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckSkuAvailabilityResultListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckSkuAvailabilityResultListInner> clientResponse = checkSkuAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckSkuAvailabilityResultListInner> checkSkuAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckSkuAvailabilityResultListInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckSkuAvailabilityResultListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Check whether a domain is available.
     *
     * @param subdomainName The subdomain name to use.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckDomainAvailabilityResultInner object if successful.
     */
    public CheckDomainAvailabilityResultInner checkDomainAvailability(String subdomainName, String type) {
        return checkDomainAvailabilityWithServiceResponseAsync(subdomainName, type).toBlocking().single().body();
    }

    /**
     * Check whether a domain is available.
     *
     * @param subdomainName The subdomain name to use.
     * @param type The Type of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckDomainAvailabilityResultInner> checkDomainAvailabilityAsync(String subdomainName, String type, final ServiceCallback<CheckDomainAvailabilityResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkDomainAvailabilityWithServiceResponseAsync(subdomainName, type), serviceCallback);
    }

    /**
     * Check whether a domain is available.
     *
     * @param subdomainName The subdomain name to use.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckDomainAvailabilityResultInner object
     */
    public Observable<CheckDomainAvailabilityResultInner> checkDomainAvailabilityAsync(String subdomainName, String type) {
        return checkDomainAvailabilityWithServiceResponseAsync(subdomainName, type).map(new Func1<ServiceResponse<CheckDomainAvailabilityResultInner>, CheckDomainAvailabilityResultInner>() {
            @Override
            public CheckDomainAvailabilityResultInner call(ServiceResponse<CheckDomainAvailabilityResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check whether a domain is available.
     *
     * @param subdomainName The subdomain name to use.
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckDomainAvailabilityResultInner object
     */
    public Observable<ServiceResponse<CheckDomainAvailabilityResultInner>> checkDomainAvailabilityWithServiceResponseAsync(String subdomainName, String type) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (subdomainName == null) {
            throw new IllegalArgumentException("Parameter subdomainName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        CheckDomainAvailabilityParameter parameters = new CheckDomainAvailabilityParameter();
        parameters.withSubdomainName(subdomainName);
        parameters.withType(type);
        return service.checkDomainAvailability(this.subscriptionId(), this.apiVersion(), this.acceptLanguage(), parameters, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckDomainAvailabilityResultInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckDomainAvailabilityResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckDomainAvailabilityResultInner> clientResponse = checkDomainAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckDomainAvailabilityResultInner> checkDomainAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckDomainAvailabilityResultInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckDomainAvailabilityResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
