# ApiregistrationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#createApiregistrationV1beta1APIService) | **POST** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**deleteApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#deleteApiregistrationV1beta1APIService) | **DELETE** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**deleteApiregistrationV1beta1CollectionAPIService**](ApiregistrationV1beta1Api.md#deleteApiregistrationV1beta1CollectionAPIService) | **DELETE** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**getApiregistrationV1beta1APIResources**](ApiregistrationV1beta1Api.md#getApiregistrationV1beta1APIResources) | **GET** /apis/apiregistration.k8s.io/v1beta1/ | 
[**listApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#listApiregistrationV1beta1APIService) | **GET** /apis/apiregistration.k8s.io/v1beta1/apiservices | 
[**patchApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#patchApiregistrationV1beta1APIService) | **PATCH** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**readApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#readApiregistrationV1beta1APIService) | **GET** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**replaceApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#replaceApiregistrationV1beta1APIService) | **PUT** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name} | 
[**replaceApiregistrationV1beta1APIServiceStatus**](ApiregistrationV1beta1Api.md#replaceApiregistrationV1beta1APIServiceStatus) | **PUT** /apis/apiregistration.k8s.io/v1beta1/apiservices/{name}/status | 
[**watchApiregistrationV1beta1APIService**](ApiregistrationV1beta1Api.md#watchApiregistrationV1beta1APIService) | **GET** /apis/apiregistration.k8s.io/v1beta1/watch/apiservices/{name} | 
[**watchApiregistrationV1beta1APIServiceList**](ApiregistrationV1beta1Api.md#watchApiregistrationV1beta1APIServiceList) | **GET** /apis/apiregistration.k8s.io/v1beta1/watch/apiservices | 


<a name="createApiregistrationV1beta1APIService"></a>
# **createApiregistrationV1beta1APIService**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService createApiregistrationV1beta1APIService(body, pretty)



create an APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService body = new IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService(); // IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService result = apiInstance.createApiregistrationV1beta1APIService(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#createApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteApiregistrationV1beta1APIService"></a>
# **deleteApiregistrationV1beta1APIService**
> IoK8sApimachineryPkgApisMetaV1Status deleteApiregistrationV1beta1APIService(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete an APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteApiregistrationV1beta1APIService(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#deleteApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**IoK8sApimachineryPkgApisMetaV1DeleteOptions**](IoK8sApimachineryPkgApisMetaV1DeleteOptions.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1Status**](IoK8sApimachineryPkgApisMetaV1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteApiregistrationV1beta1CollectionAPIService"></a>
# **deleteApiregistrationV1beta1CollectionAPIService**
> IoK8sApimachineryPkgApisMetaV1Status deleteApiregistrationV1beta1CollectionAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteApiregistrationV1beta1CollectionAPIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#deleteApiregistrationV1beta1CollectionAPIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1Status**](IoK8sApimachineryPkgApisMetaV1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getApiregistrationV1beta1APIResources"></a>
# **getApiregistrationV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getApiregistrationV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getApiregistrationV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#getApiregistrationV1beta1APIResources");
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

<a name="listApiregistrationV1beta1APIService"></a>
# **listApiregistrationV1beta1APIService**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceList listApiregistrationV1beta1APIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceList result = apiInstance.listApiregistrationV1beta1APIService(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#listApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceList**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchApiregistrationV1beta1APIService"></a>
# **patchApiregistrationV1beta1APIService**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService patchApiregistrationV1beta1APIService(name, body, pretty)



partially update the specified APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService result = apiInstance.patchApiregistrationV1beta1APIService(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#patchApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readApiregistrationV1beta1APIService"></a>
# **readApiregistrationV1beta1APIService**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService readApiregistrationV1beta1APIService(name, pretty, exact, export)



read the specified APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService result = apiInstance.readApiregistrationV1beta1APIService(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#readApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceApiregistrationV1beta1APIService"></a>
# **replaceApiregistrationV1beta1APIService**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService replaceApiregistrationV1beta1APIService(name, body, pretty)



replace the specified APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService body = new IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService(); // IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService result = apiInstance.replaceApiregistrationV1beta1APIService(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#replaceApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceApiregistrationV1beta1APIServiceStatus"></a>
# **replaceApiregistrationV1beta1APIServiceStatus**
> IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService replaceApiregistrationV1beta1APIServiceStatus(name, body, pretty)



replace status of the specified APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService body = new IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService(); // IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService result = apiInstance.replaceApiregistrationV1beta1APIServiceStatus(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#replaceApiregistrationV1beta1APIServiceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **body** | [**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService**](IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchApiregistrationV1beta1APIService"></a>
# **watchApiregistrationV1beta1APIService**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchApiregistrationV1beta1APIService(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String name = "name_example"; // String | name of the APIService
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchApiregistrationV1beta1APIService(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#watchApiregistrationV1beta1APIService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the APIService |
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1WatchEvent**](IoK8sApimachineryPkgApisMetaV1WatchEvent.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="watchApiregistrationV1beta1APIServiceList"></a>
# **watchApiregistrationV1beta1APIServiceList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchApiregistrationV1beta1APIServiceList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of APIService

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiregistrationV1beta1Api;

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

ApiregistrationV1beta1Api apiInstance = new ApiregistrationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchApiregistrationV1beta1APIServiceList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiregistrationV1beta1Api#watchApiregistrationV1beta1APIServiceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1WatchEvent**](IoK8sApimachineryPkgApisMetaV1WatchEvent.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

