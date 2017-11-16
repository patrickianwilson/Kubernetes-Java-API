# AuthenticationV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationV1TokenReview**](AuthenticationV1Api.md#createAuthenticationV1TokenReview) | **POST** /apis/authentication.k8s.io/v1/tokenreviews | 
[**getAuthenticationV1APIResources**](AuthenticationV1Api.md#getAuthenticationV1APIResources) | **GET** /apis/authentication.k8s.io/v1/ | 


<a name="createAuthenticationV1TokenReview"></a>
# **createAuthenticationV1TokenReview**
> IoK8sKubernetesPkgApisAuthenticationV1TokenReview createAuthenticationV1TokenReview(body, pretty)



create a TokenReview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: HTTPBasic
HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
HTTPBasic.setUsername("YOUR USERNAME");
HTTPBasic.setPassword("YOUR PASSWORD");

AuthenticationV1Api apiInstance = new AuthenticationV1Api();
IoK8sKubernetesPkgApisAuthenticationV1TokenReview body = new IoK8sKubernetesPkgApisAuthenticationV1TokenReview(); // IoK8sKubernetesPkgApisAuthenticationV1TokenReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthenticationV1TokenReview result = apiInstance.createAuthenticationV1TokenReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1Api#createAuthenticationV1TokenReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisAuthenticationV1TokenReview**](IoK8sKubernetesPkgApisAuthenticationV1TokenReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthenticationV1TokenReview**](IoK8sKubernetesPkgApisAuthenticationV1TokenReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthenticationV1APIResources"></a>
# **getAuthenticationV1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthenticationV1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: HTTPBasic
HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
HTTPBasic.setUsername("YOUR USERNAME");
HTTPBasic.setPassword("YOUR PASSWORD");

AuthenticationV1Api apiInstance = new AuthenticationV1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthenticationV1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1Api#getAuthenticationV1APIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIResourceList**](IoK8sApimachineryPkgApisMetaV1APIResourceList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

