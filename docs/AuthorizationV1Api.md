# AuthorizationV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorizationV1NamespacedLocalSubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1NamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createAuthorizationV1SelfSubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1SelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/selfsubjectaccessreviews | 
[**createAuthorizationV1SubjectAccessReview**](AuthorizationV1Api.md#createAuthorizationV1SubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1/subjectaccessreviews | 
[**getAuthorizationV1APIResources**](AuthorizationV1Api.md#getAuthorizationV1APIResources) | **GET** /apis/authorization.k8s.io/v1/ | 


<a name="createAuthorizationV1NamespacedLocalSubjectAccessReview"></a>
# **createAuthorizationV1NamespacedLocalSubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview createAuthorizationV1NamespacedLocalSubjectAccessReview(namespace, body, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1Api;

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

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview result = apiInstance.createAuthorizationV1NamespacedLocalSubjectAccessReview(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1NamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1SelfSubjectAccessReview"></a>
# **createAuthorizationV1SelfSubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview createAuthorizationV1SelfSubjectAccessReview(body, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1Api;

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

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview result = apiInstance.createAuthorizationV1SelfSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1SelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1SubjectAccessReview"></a>
# **createAuthorizationV1SubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview createAuthorizationV1SubjectAccessReview(body, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1Api;

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

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview result = apiInstance.createAuthorizationV1SubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#createAuthorizationV1SubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1SubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthorizationV1APIResources"></a>
# **getAuthorizationV1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthorizationV1APIResources()



get available resources

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1Api;

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

AuthorizationV1Api apiInstance = new AuthorizationV1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthorizationV1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1Api#getAuthorizationV1APIResources");
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

