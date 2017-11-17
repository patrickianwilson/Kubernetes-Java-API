# RbacAuthorizationV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#createRbacAuthorizationV1beta1ClusterRole) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
[**createRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#createRbacAuthorizationV1beta1ClusterRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
[**createRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#createRbacAuthorizationV1beta1NamespacedRole) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
[**createRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#createRbacAuthorizationV1beta1NamespacedRoleBinding) | **POST** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
[**deleteRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1ClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
[**deleteRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1ClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
[**deleteRbacAuthorizationV1beta1CollectionClusterRole**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1CollectionClusterRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
[**deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
[**deleteRbacAuthorizationV1beta1CollectionNamespacedRole**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1CollectionNamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
[**deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
[**deleteRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1NamespacedRole) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
[**deleteRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#deleteRbacAuthorizationV1beta1NamespacedRoleBinding) | **DELETE** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
[**getRbacAuthorizationV1beta1APIResources**](RbacAuthorizationV1beta1Api.md#getRbacAuthorizationV1beta1APIResources) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/ | 
[**listRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1ClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles | 
[**listRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1ClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings | 
[**listRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1NamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles | 
[**listRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1NamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings | 
[**listRbacAuthorizationV1beta1RoleBindingForAllNamespaces**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1RoleBindingForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/rolebindings | 
[**listRbacAuthorizationV1beta1RoleForAllNamespaces**](RbacAuthorizationV1beta1Api.md#listRbacAuthorizationV1beta1RoleForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/roles | 
[**patchRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#patchRbacAuthorizationV1beta1ClusterRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
[**patchRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#patchRbacAuthorizationV1beta1ClusterRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
[**patchRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#patchRbacAuthorizationV1beta1NamespacedRole) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
[**patchRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#patchRbacAuthorizationV1beta1NamespacedRoleBinding) | **PATCH** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
[**readRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#readRbacAuthorizationV1beta1ClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
[**readRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#readRbacAuthorizationV1beta1ClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
[**readRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#readRbacAuthorizationV1beta1NamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
[**readRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#readRbacAuthorizationV1beta1NamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
[**replaceRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#replaceRbacAuthorizationV1beta1ClusterRole) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name} | 
[**replaceRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#replaceRbacAuthorizationV1beta1ClusterRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name} | 
[**replaceRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#replaceRbacAuthorizationV1beta1NamespacedRole) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name} | 
[**replaceRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#replaceRbacAuthorizationV1beta1NamespacedRoleBinding) | **PUT** /apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name} | 
[**watchRbacAuthorizationV1beta1ClusterRole**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1ClusterRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/clusterroles/{name} | 
[**watchRbacAuthorizationV1beta1ClusterRoleBinding**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1ClusterRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/clusterrolebindings/{name} | 
[**watchRbacAuthorizationV1beta1ClusterRoleBindingList**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1ClusterRoleBindingList) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/clusterrolebindings | 
[**watchRbacAuthorizationV1beta1ClusterRoleList**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1ClusterRoleList) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/clusterroles | 
[**watchRbacAuthorizationV1beta1NamespacedRole**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1NamespacedRole) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/roles/{name} | 
[**watchRbacAuthorizationV1beta1NamespacedRoleBinding**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1NamespacedRoleBinding) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/rolebindings/{name} | 
[**watchRbacAuthorizationV1beta1NamespacedRoleBindingList**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1NamespacedRoleBindingList) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/rolebindings | 
[**watchRbacAuthorizationV1beta1NamespacedRoleList**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1NamespacedRoleList) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/roles | 
[**watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/rolebindings | 
[**watchRbacAuthorizationV1beta1RoleListForAllNamespaces**](RbacAuthorizationV1beta1Api.md#watchRbacAuthorizationV1beta1RoleListForAllNamespaces) | **GET** /apis/rbac.authorization.k8s.io/v1beta1/watch/roles | 


<a name="createRbacAuthorizationV1beta1ClusterRole"></a>
# **createRbacAuthorizationV1beta1ClusterRole**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRole createRbacAuthorizationV1beta1ClusterRole(body, pretty)



create a ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
IoK8sKubernetesPkgApisRbacV1beta1ClusterRole body = new IoK8sKubernetesPkgApisRbacV1beta1ClusterRole(); // IoK8sKubernetesPkgApisRbacV1beta1ClusterRole | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRole result = apiInstance.createRbacAuthorizationV1beta1ClusterRole(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#createRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **createRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding createRbacAuthorizationV1beta1ClusterRoleBinding(body, pretty)



create a ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding body = new IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding(); // IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding result = apiInstance.createRbacAuthorizationV1beta1ClusterRoleBinding(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#createRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createRbacAuthorizationV1beta1NamespacedRole"></a>
# **createRbacAuthorizationV1beta1NamespacedRole**
> IoK8sKubernetesPkgApisRbacV1beta1Role createRbacAuthorizationV1beta1NamespacedRole(namespace, body, pretty)



create a Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisRbacV1beta1Role body = new IoK8sKubernetesPkgApisRbacV1beta1Role(); // IoK8sKubernetesPkgApisRbacV1beta1Role | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1Role result = apiInstance.createRbacAuthorizationV1beta1NamespacedRole(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#createRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="createRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **createRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBinding createRbacAuthorizationV1beta1NamespacedRoleBinding(namespace, body, pretty)



create a RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisRbacV1beta1RoleBinding body = new IoK8sKubernetesPkgApisRbacV1beta1RoleBinding(); // IoK8sKubernetesPkgApisRbacV1beta1RoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBinding result = apiInstance.createRbacAuthorizationV1beta1NamespacedRoleBinding(namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#createRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteRbacAuthorizationV1beta1ClusterRole"></a>
# **deleteRbacAuthorizationV1beta1ClusterRole**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1ClusterRole(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRole
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1ClusterRole(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
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

<a name="deleteRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **deleteRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
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

<a name="deleteRbacAuthorizationV1beta1CollectionClusterRole"></a>
# **deleteRbacAuthorizationV1beta1CollectionClusterRole**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1CollectionClusterRole(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1CollectionClusterRole(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1CollectionClusterRole");
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

<a name="deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding"></a>
# **deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1CollectionClusterRoleBinding");
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

<a name="deleteRbacAuthorizationV1beta1CollectionNamespacedRole"></a>
# **deleteRbacAuthorizationV1beta1CollectionNamespacedRole**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1CollectionNamespacedRole(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1CollectionNamespacedRole(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1CollectionNamespacedRole");
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

<a name="deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding"></a>
# **deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1CollectionNamespacedRoleBinding");
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

<a name="deleteRbacAuthorizationV1beta1NamespacedRole"></a>
# **deleteRbacAuthorizationV1beta1NamespacedRole**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
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

<a name="deleteRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **deleteRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sApimachineryPkgApisMetaV1Status deleteRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#deleteRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
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

<a name="getRbacAuthorizationV1beta1APIResources"></a>
# **getRbacAuthorizationV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getRbacAuthorizationV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getRbacAuthorizationV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#getRbacAuthorizationV1beta1APIResources");
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

<a name="listRbacAuthorizationV1beta1ClusterRole"></a>
# **listRbacAuthorizationV1beta1ClusterRole**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleList listRbacAuthorizationV1beta1ClusterRole(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleList result = apiInstance.listRbacAuthorizationV1beta1ClusterRole(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1ClusterRole");
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

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleList**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **listRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBindingList listRbacAuthorizationV1beta1ClusterRoleBinding(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBindingList result = apiInstance.listRbacAuthorizationV1beta1ClusterRoleBinding(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1ClusterRoleBinding");
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

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBindingList**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRbacAuthorizationV1beta1NamespacedRole"></a>
# **listRbacAuthorizationV1beta1NamespacedRole**
> IoK8sKubernetesPkgApisRbacV1beta1RoleList listRbacAuthorizationV1beta1NamespacedRole(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleList result = apiInstance.listRbacAuthorizationV1beta1NamespacedRole(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1NamespacedRole");
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

[**IoK8sKubernetesPkgApisRbacV1beta1RoleList**](IoK8sKubernetesPkgApisRbacV1beta1RoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **listRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList listRbacAuthorizationV1beta1NamespacedRoleBinding(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList result = apiInstance.listRbacAuthorizationV1beta1NamespacedRoleBinding(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1NamespacedRoleBinding");
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

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList**](IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRbacAuthorizationV1beta1RoleBindingForAllNamespaces"></a>
# **listRbacAuthorizationV1beta1RoleBindingForAllNamespaces**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList listRbacAuthorizationV1beta1RoleBindingForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList result = apiInstance.listRbacAuthorizationV1beta1RoleBindingForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1RoleBindingForAllNamespaces");
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

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList**](IoK8sKubernetesPkgApisRbacV1beta1RoleBindingList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="listRbacAuthorizationV1beta1RoleForAllNamespaces"></a>
# **listRbacAuthorizationV1beta1RoleForAllNamespaces**
> IoK8sKubernetesPkgApisRbacV1beta1RoleList listRbacAuthorizationV1beta1RoleForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleList result = apiInstance.listRbacAuthorizationV1beta1RoleForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#listRbacAuthorizationV1beta1RoleForAllNamespaces");
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

[**IoK8sKubernetesPkgApisRbacV1beta1RoleList**](IoK8sKubernetesPkgApisRbacV1beta1RoleList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchRbacAuthorizationV1beta1ClusterRole"></a>
# **patchRbacAuthorizationV1beta1ClusterRole**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRole patchRbacAuthorizationV1beta1ClusterRole(name, body, pretty)



partially update the specified ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRole
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRole result = apiInstance.patchRbacAuthorizationV1beta1ClusterRole(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#patchRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **patchRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding patchRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty)



partially update the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding result = apiInstance.patchRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#patchRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchRbacAuthorizationV1beta1NamespacedRole"></a>
# **patchRbacAuthorizationV1beta1NamespacedRole**
> IoK8sKubernetesPkgApisRbacV1beta1Role patchRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty)



partially update the specified Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1Role result = apiInstance.patchRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#patchRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="patchRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **patchRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBinding patchRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty)



partially update the specified RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBinding result = apiInstance.patchRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#patchRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readRbacAuthorizationV1beta1ClusterRole"></a>
# **readRbacAuthorizationV1beta1ClusterRole**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRole readRbacAuthorizationV1beta1ClusterRole(name, pretty)



read the specified ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRole
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRole result = apiInstance.readRbacAuthorizationV1beta1ClusterRole(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#readRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **readRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding readRbacAuthorizationV1beta1ClusterRoleBinding(name, pretty)



read the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding result = apiInstance.readRbacAuthorizationV1beta1ClusterRoleBinding(name, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#readRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readRbacAuthorizationV1beta1NamespacedRole"></a>
# **readRbacAuthorizationV1beta1NamespacedRole**
> IoK8sKubernetesPkgApisRbacV1beta1Role readRbacAuthorizationV1beta1NamespacedRole(name, namespace, pretty)



read the specified Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1Role result = apiInstance.readRbacAuthorizationV1beta1NamespacedRole(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#readRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **readRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBinding readRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, pretty)



read the specified RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBinding result = apiInstance.readRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#readRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceRbacAuthorizationV1beta1ClusterRole"></a>
# **replaceRbacAuthorizationV1beta1ClusterRole**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRole replaceRbacAuthorizationV1beta1ClusterRole(name, body, pretty)



replace the specified ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRole
IoK8sKubernetesPkgApisRbacV1beta1ClusterRole body = new IoK8sKubernetesPkgApisRbacV1beta1ClusterRole(); // IoK8sKubernetesPkgApisRbacV1beta1ClusterRole | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRole result = apiInstance.replaceRbacAuthorizationV1beta1ClusterRole(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#replaceRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRole**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRole.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **replaceRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding replaceRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty)



replace the specified ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding body = new IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding(); // IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding result = apiInstance.replaceRbacAuthorizationV1beta1ClusterRoleBinding(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#replaceRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1ClusterRoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceRbacAuthorizationV1beta1NamespacedRole"></a>
# **replaceRbacAuthorizationV1beta1NamespacedRole**
> IoK8sKubernetesPkgApisRbacV1beta1Role replaceRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty)



replace the specified Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisRbacV1beta1Role body = new IoK8sKubernetesPkgApisRbacV1beta1Role(); // IoK8sKubernetesPkgApisRbacV1beta1Role | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1Role result = apiInstance.replaceRbacAuthorizationV1beta1NamespacedRole(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#replaceRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1Role**](IoK8sKubernetesPkgApisRbacV1beta1Role.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **replaceRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sKubernetesPkgApisRbacV1beta1RoleBinding replaceRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty)



replace the specified RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sKubernetesPkgApisRbacV1beta1RoleBinding body = new IoK8sKubernetesPkgApisRbacV1beta1RoleBinding(); // IoK8sKubernetesPkgApisRbacV1beta1RoleBinding | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisRbacV1beta1RoleBinding result = apiInstance.replaceRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#replaceRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisRbacV1beta1RoleBinding**](IoK8sKubernetesPkgApisRbacV1beta1RoleBinding.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchRbacAuthorizationV1beta1ClusterRole"></a>
# **watchRbacAuthorizationV1beta1ClusterRole**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1ClusterRole(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRole
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1ClusterRole(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1ClusterRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRole |
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

<a name="watchRbacAuthorizationV1beta1ClusterRoleBinding"></a>
# **watchRbacAuthorizationV1beta1ClusterRoleBinding**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1ClusterRoleBinding(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the ClusterRoleBinding
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1ClusterRoleBinding(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1ClusterRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the ClusterRoleBinding |
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

<a name="watchRbacAuthorizationV1beta1ClusterRoleBindingList"></a>
# **watchRbacAuthorizationV1beta1ClusterRoleBindingList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1ClusterRoleBindingList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of ClusterRoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1ClusterRoleBindingList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1ClusterRoleBindingList");
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

<a name="watchRbacAuthorizationV1beta1ClusterRoleList"></a>
# **watchRbacAuthorizationV1beta1ClusterRoleList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1ClusterRoleList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of ClusterRole

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1ClusterRoleList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1ClusterRoleList");
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

<a name="watchRbacAuthorizationV1beta1NamespacedRole"></a>
# **watchRbacAuthorizationV1beta1NamespacedRole**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1NamespacedRole(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the Role
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1NamespacedRole(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1NamespacedRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the Role |
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

<a name="watchRbacAuthorizationV1beta1NamespacedRoleBinding"></a>
# **watchRbacAuthorizationV1beta1NamespacedRoleBinding**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String name = "name_example"; // String | name of the RoleBinding
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1NamespacedRoleBinding(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1NamespacedRoleBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the RoleBinding |
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

<a name="watchRbacAuthorizationV1beta1NamespacedRoleBindingList"></a>
# **watchRbacAuthorizationV1beta1NamespacedRoleBindingList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1NamespacedRoleBindingList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1NamespacedRoleBindingList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1NamespacedRoleBindingList");
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

<a name="watchRbacAuthorizationV1beta1NamespacedRoleList"></a>
# **watchRbacAuthorizationV1beta1NamespacedRoleList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1NamespacedRoleList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1NamespacedRoleList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1NamespacedRoleList");
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

<a name="watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces"></a>
# **watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of RoleBinding

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1RoleBindingListForAllNamespaces");
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

<a name="watchRbacAuthorizationV1beta1RoleListForAllNamespaces"></a>
# **watchRbacAuthorizationV1beta1RoleListForAllNamespaces**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchRbacAuthorizationV1beta1RoleListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of Role

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.RbacAuthorizationV1beta1Api;

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

RbacAuthorizationV1beta1Api apiInstance = new RbacAuthorizationV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchRbacAuthorizationV1beta1RoleListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbacAuthorizationV1beta1Api#watchRbacAuthorizationV1beta1RoleListForAllNamespaces");
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

