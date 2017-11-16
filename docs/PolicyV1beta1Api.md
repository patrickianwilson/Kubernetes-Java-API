# PolicyV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#createPolicyV1beta1NamespacedPodDisruptionBudget) | **POST** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
[**deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
[**deletePolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#deletePolicyV1beta1NamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
[**getPolicyV1beta1APIResources**](PolicyV1beta1Api.md#getPolicyV1beta1APIResources) | **GET** /apis/policy/v1beta1/ | 
[**listPolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#listPolicyV1beta1NamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets | 
[**listPolicyV1beta1PodDisruptionBudgetForAllNamespaces**](PolicyV1beta1Api.md#listPolicyV1beta1PodDisruptionBudgetForAllNamespaces) | **GET** /apis/policy/v1beta1/poddisruptionbudgets | 
[**patchPolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#patchPolicyV1beta1NamespacedPodDisruptionBudget) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
[**patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus**](PolicyV1beta1Api.md#patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus) | **PATCH** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
[**readPolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#readPolicyV1beta1NamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
[**readPolicyV1beta1NamespacedPodDisruptionBudgetStatus**](PolicyV1beta1Api.md#readPolicyV1beta1NamespacedPodDisruptionBudgetStatus) | **GET** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
[**replacePolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#replacePolicyV1beta1NamespacedPodDisruptionBudget) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
[**replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus**](PolicyV1beta1Api.md#replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus) | **PUT** /apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
[**watchPolicyV1beta1NamespacedPodDisruptionBudget**](PolicyV1beta1Api.md#watchPolicyV1beta1NamespacedPodDisruptionBudget) | **GET** /apis/policy/v1beta1/watch/namespaces/{namespace}/poddisruptionbudgets/{name} | 
[**watchPolicyV1beta1NamespacedPodDisruptionBudgetList**](PolicyV1beta1Api.md#watchPolicyV1beta1NamespacedPodDisruptionBudgetList) | **GET** /apis/policy/v1beta1/watch/namespaces/{namespace}/poddisruptionbudgets | 
[**watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces**](PolicyV1beta1Api.md#watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces) | **GET** /apis/policy/v1beta1/watch/poddisruptionbudgets | 


<a name="createPolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **createPolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget createPolicyV1beta1NamespacedPodDisruptionBudget(namespace, body, pretty)



create a PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = new IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget(); // IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.createPolicyV1beta1NamespacedPodDisruptionBudget(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#createPolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget"></a>
# **deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget**
> IoK8sApimachineryPkgApisMetaV1Status deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget");
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

<a name="deletePolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **deletePolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sApimachineryPkgApisMetaV1Status deletePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deletePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#deletePolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
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

<a name="getPolicyV1beta1APIResources"></a>
# **getPolicyV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getPolicyV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getPolicyV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#getPolicyV1beta1APIResources");
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

<a name="listPolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **listPolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList listPolicyV1beta1NamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList result = apiInstance.listPolicyV1beta1NamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#listPolicyV1beta1NamespacedPodDisruptionBudget");
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

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listPolicyV1beta1PodDisruptionBudgetForAllNamespaces"></a>
# **listPolicyV1beta1PodDisruptionBudgetForAllNamespaces**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList listPolicyV1beta1PodDisruptionBudgetForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList result = apiInstance.listPolicyV1beta1PodDisruptionBudgetForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#listPolicyV1beta1PodDisruptionBudgetForAllNamespaces");
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

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchPolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **patchPolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget patchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty)



partially update the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.patchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#patchPolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus"></a>
# **patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty)



partially update status of the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readPolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **readPolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget readPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, pretty, exact, export)



read the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.readPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#readPolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readPolicyV1beta1NamespacedPodDisruptionBudgetStatus"></a>
# **readPolicyV1beta1NamespacedPodDisruptionBudgetStatus**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget readPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, pretty)



read status of the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.readPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#readPolicyV1beta1NamespacedPodDisruptionBudgetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replacePolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **replacePolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget replacePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty)



replace the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = new IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget(); // IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.replacePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#replacePolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus"></a>
# **replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus**
> IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty)



replace status of the specified PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = new IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget(); // IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget result = apiInstance.replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget**](IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchPolicyV1beta1NamespacedPodDisruptionBudget"></a>
# **watchPolicyV1beta1NamespacedPodDisruptionBudget**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String name = "name_example"; // String | name of the PodDisruptionBudget
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#watchPolicyV1beta1NamespacedPodDisruptionBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the PodDisruptionBudget |
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

<a name="watchPolicyV1beta1NamespacedPodDisruptionBudgetList"></a>
# **watchPolicyV1beta1NamespacedPodDisruptionBudgetList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchPolicyV1beta1NamespacedPodDisruptionBudgetList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchPolicyV1beta1NamespacedPodDisruptionBudgetList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#watchPolicyV1beta1NamespacedPodDisruptionBudgetList");
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

<a name="watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces"></a>
# **watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of PodDisruptionBudget

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PolicyV1beta1Api;

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

PolicyV1beta1Api apiInstance = new PolicyV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PolicyV1beta1Api#watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces");
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

