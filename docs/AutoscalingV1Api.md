# AutoscalingV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#createAutoscalingV1NamespacedHorizontalPodAutoscaler) | **POST** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**deleteAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#deleteAutoscalingV1NamespacedHorizontalPodAutoscaler) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**getAutoscalingV1APIResources**](AutoscalingV1Api.md#getAutoscalingV1APIResources) | **GET** /apis/autoscaling/v1/ | 
[**listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces**](AutoscalingV1Api.md#listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces) | **GET** /apis/autoscaling/v1/horizontalpodautoscalers | 
[**listAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#listAutoscalingV1NamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
[**patchAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#patchAutoscalingV1NamespacedHorizontalPodAutoscaler) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
[**readAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#readAutoscalingV1NamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
[**replaceAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#replaceAutoscalingV1NamespacedHorizontalPodAutoscaler) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**](AutoscalingV1Api.md#replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
[**watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces**](AutoscalingV1Api.md#watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces) | **GET** /apis/autoscaling/v1/watch/horizontalpodautoscalers | 
[**watchAutoscalingV1NamespacedHorizontalPodAutoscaler**](AutoscalingV1Api.md#watchAutoscalingV1NamespacedHorizontalPodAutoscaler) | **GET** /apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
[**watchAutoscalingV1NamespacedHorizontalPodAutoscalerList**](AutoscalingV1Api.md#watchAutoscalingV1NamespacedHorizontalPodAutoscalerList) | **GET** /apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers | 


<a name="createAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **createAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler createAutoscalingV1NamespacedHorizontalPodAutoscaler(namespace, body, pretty)



create a HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler body = new IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler(); // IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.createAutoscalingV1NamespacedHorizontalPodAutoscaler(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#createAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler"></a>
# **deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler**
> IoK8sApimachineryPkgApisMetaV1Status deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#deleteAutoscalingV1CollectionNamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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

<a name="deleteAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **deleteAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sApimachineryPkgApisMetaV1Status deleteAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#deleteAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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

<a name="getAutoscalingV1APIResources"></a>
# **getAutoscalingV1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAutoscalingV1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAutoscalingV1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#getAutoscalingV1APIResources");
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

<a name="listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces"></a>
# **listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList result = apiInstance.listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#listAutoscalingV1HorizontalPodAutoscalerForAllNamespaces");
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

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **listAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList listAutoscalingV1NamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList result = apiInstance.listAutoscalingV1NamespacedHorizontalPodAutoscaler(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#listAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **includeUninitialized** | **Boolean**| If true, partially initialized resources are included in the response. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **patchAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler patchAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty)



partially update the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.patchAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#patchAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus"></a>
# **patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty)



partially update status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#patchAutoscalingV1NamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **readAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler readAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export)



read the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.readAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#readAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus"></a>
# **readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty)



read status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#readAutoscalingV1NamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **replaceAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler replaceAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty)



replace the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler body = new IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler(); // IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.replaceAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#replaceAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus"></a>
# **replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus**
> IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty)



replace status of the specified HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler body = new IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler(); // IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler result = apiInstance.replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#replaceAutoscalingV1NamespacedHorizontalPodAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler**](IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces"></a>
# **watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#watchAutoscalingV1HorizontalPodAutoscalerListForAllNamespaces");
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

<a name="watchAutoscalingV1NamespacedHorizontalPodAutoscaler"></a>
# **watchAutoscalingV1NamespacedHorizontalPodAutoscaler**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String name = "name_example"; // String | name of the HorizontalPodAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchAutoscalingV1NamespacedHorizontalPodAutoscaler(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#watchAutoscalingV1NamespacedHorizontalPodAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the HorizontalPodAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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

<a name="watchAutoscalingV1NamespacedHorizontalPodAutoscalerList"></a>
# **watchAutoscalingV1NamespacedHorizontalPodAutoscalerList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchAutoscalingV1NamespacedHorizontalPodAutoscalerList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of HorizontalPodAutoscaler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoscalingV1Api;

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

AutoscalingV1Api apiInstance = new AutoscalingV1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchAutoscalingV1NamespacedHorizontalPodAutoscalerList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingV1Api#watchAutoscalingV1NamespacedHorizontalPodAutoscalerList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
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

