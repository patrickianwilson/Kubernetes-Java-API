# StorageV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorageV1beta1StorageClass**](StorageV1beta1Api.md#createStorageV1beta1StorageClass) | **POST** /apis/storage.k8s.io/v1beta1/storageclasses | 
[**deleteStorageV1beta1CollectionStorageClass**](StorageV1beta1Api.md#deleteStorageV1beta1CollectionStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses | 
[**deleteStorageV1beta1StorageClass**](StorageV1beta1Api.md#deleteStorageV1beta1StorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
[**getStorageV1beta1APIResources**](StorageV1beta1Api.md#getStorageV1beta1APIResources) | **GET** /apis/storage.k8s.io/v1beta1/ | 
[**listStorageV1beta1StorageClass**](StorageV1beta1Api.md#listStorageV1beta1StorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses | 
[**patchStorageV1beta1StorageClass**](StorageV1beta1Api.md#patchStorageV1beta1StorageClass) | **PATCH** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
[**readStorageV1beta1StorageClass**](StorageV1beta1Api.md#readStorageV1beta1StorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
[**replaceStorageV1beta1StorageClass**](StorageV1beta1Api.md#replaceStorageV1beta1StorageClass) | **PUT** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
[**watchStorageV1beta1StorageClass**](StorageV1beta1Api.md#watchStorageV1beta1StorageClass) | **GET** /apis/storage.k8s.io/v1beta1/watch/storageclasses/{name} | 
[**watchStorageV1beta1StorageClassList**](StorageV1beta1Api.md#watchStorageV1beta1StorageClassList) | **GET** /apis/storage.k8s.io/v1beta1/watch/storageclasses | 


<a name="createStorageV1beta1StorageClass"></a>
# **createStorageV1beta1StorageClass**
> IoK8sKubernetesPkgApisStorageV1beta1StorageClass createStorageV1beta1StorageClass(body, pretty)



create a StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
IoK8sKubernetesPkgApisStorageV1beta1StorageClass body = new IoK8sKubernetesPkgApisStorageV1beta1StorageClass(); // IoK8sKubernetesPkgApisStorageV1beta1StorageClass | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisStorageV1beta1StorageClass result = apiInstance.createStorageV1beta1StorageClass(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#createStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteStorageV1beta1CollectionStorageClass"></a>
# **deleteStorageV1beta1CollectionStorageClass**
> IoK8sApimachineryPkgApisMetaV1Status deleteStorageV1beta1CollectionStorageClass(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteStorageV1beta1CollectionStorageClass(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#deleteStorageV1beta1CollectionStorageClass");
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

<a name="deleteStorageV1beta1StorageClass"></a>
# **deleteStorageV1beta1StorageClass**
> IoK8sApimachineryPkgApisMetaV1Status deleteStorageV1beta1StorageClass(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String name = "name_example"; // String | name of the StorageClass
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteStorageV1beta1StorageClass(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#deleteStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StorageClass |
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

<a name="getStorageV1beta1APIResources"></a>
# **getStorageV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getStorageV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getStorageV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#getStorageV1beta1APIResources");
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

<a name="listStorageV1beta1StorageClass"></a>
# **listStorageV1beta1StorageClass**
> IoK8sKubernetesPkgApisStorageV1beta1StorageClassList listStorageV1beta1StorageClass(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisStorageV1beta1StorageClassList result = apiInstance.listStorageV1beta1StorageClass(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#listStorageV1beta1StorageClass");
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

[**IoK8sKubernetesPkgApisStorageV1beta1StorageClassList**](IoK8sKubernetesPkgApisStorageV1beta1StorageClassList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchStorageV1beta1StorageClass"></a>
# **patchStorageV1beta1StorageClass**
> IoK8sKubernetesPkgApisStorageV1beta1StorageClass patchStorageV1beta1StorageClass(name, body, pretty)



partially update the specified StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String name = "name_example"; // String | name of the StorageClass
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisStorageV1beta1StorageClass result = apiInstance.patchStorageV1beta1StorageClass(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#patchStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StorageClass |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readStorageV1beta1StorageClass"></a>
# **readStorageV1beta1StorageClass**
> IoK8sKubernetesPkgApisStorageV1beta1StorageClass readStorageV1beta1StorageClass(name, pretty, exact, export)



read the specified StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String name = "name_example"; // String | name of the StorageClass
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    IoK8sKubernetesPkgApisStorageV1beta1StorageClass result = apiInstance.readStorageV1beta1StorageClass(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#readStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StorageClass |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceStorageV1beta1StorageClass"></a>
# **replaceStorageV1beta1StorageClass**
> IoK8sKubernetesPkgApisStorageV1beta1StorageClass replaceStorageV1beta1StorageClass(name, body, pretty)



replace the specified StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String name = "name_example"; // String | name of the StorageClass
IoK8sKubernetesPkgApisStorageV1beta1StorageClass body = new IoK8sKubernetesPkgApisStorageV1beta1StorageClass(); // IoK8sKubernetesPkgApisStorageV1beta1StorageClass | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisStorageV1beta1StorageClass result = apiInstance.replaceStorageV1beta1StorageClass(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#replaceStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StorageClass |
 **body** | [**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisStorageV1beta1StorageClass**](IoK8sKubernetesPkgApisStorageV1beta1StorageClass.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchStorageV1beta1StorageClass"></a>
# **watchStorageV1beta1StorageClass**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchStorageV1beta1StorageClass(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String name = "name_example"; // String | name of the StorageClass
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchStorageV1beta1StorageClass(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#watchStorageV1beta1StorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the StorageClass |
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

<a name="watchStorageV1beta1StorageClassList"></a>
# **watchStorageV1beta1StorageClassList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchStorageV1beta1StorageClassList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of StorageClass

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageV1beta1Api;

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

StorageV1beta1Api apiInstance = new StorageV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchStorageV1beta1StorageClassList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageV1beta1Api#watchStorageV1beta1StorageClassList");
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

