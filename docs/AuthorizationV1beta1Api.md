# AuthorizationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorizationV1beta1NamespacedLocalSubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1NamespacedLocalSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews | 
[**createAuthorizationV1beta1SelfSubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1SelfSubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews | 
[**createAuthorizationV1beta1SubjectAccessReview**](AuthorizationV1beta1Api.md#createAuthorizationV1beta1SubjectAccessReview) | **POST** /apis/authorization.k8s.io/v1beta1/subjectaccessreviews | 
[**getAuthorizationV1beta1APIResources**](AuthorizationV1beta1Api.md#getAuthorizationV1beta1APIResources) | **GET** /apis/authorization.k8s.io/v1beta1/ | 


<a name="createAuthorizationV1beta1NamespacedLocalSubjectAccessReview"></a>
# **createAuthorizationV1beta1NamespacedLocalSubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace, body, pretty)



create a LocalSubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1beta1Api;

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

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview result = apiInstance.createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1NamespacedLocalSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1LocalSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1beta1SelfSubjectAccessReview"></a>
# **createAuthorizationV1beta1SelfSubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview createAuthorizationV1beta1SelfSubjectAccessReview(body, pretty)



create a SelfSubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1beta1Api;

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

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview result = apiInstance.createAuthorizationV1beta1SelfSubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1SelfSubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1SelfSubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createAuthorizationV1beta1SubjectAccessReview"></a>
# **createAuthorizationV1beta1SubjectAccessReview**
> IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview createAuthorizationV1beta1SubjectAccessReview(body, pretty)



create a SubjectAccessReview

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1beta1Api;

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

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview body = new IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview(); // IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview result = apiInstance.createAuthorizationV1beta1SubjectAccessReview(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#createAuthorizationV1beta1SubjectAccessReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview**](IoK8sKubernetesPkgApisAuthorizationV1beta1SubjectAccessReview.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthorizationV1beta1APIResources"></a>
# **getAuthorizationV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthorizationV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.AuthorizationV1beta1Api;

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

AuthorizationV1beta1Api apiInstance = new AuthorizationV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthorizationV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationV1beta1Api#getAuthorizationV1beta1APIResources");
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

