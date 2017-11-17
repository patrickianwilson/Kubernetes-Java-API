# CertificatesV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#createCertificatesV1beta1CertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**deleteCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#deleteCertificatesV1beta1CertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**deleteCertificatesV1beta1CollectionCertificateSigningRequest**](CertificatesV1beta1Api.md#deleteCertificatesV1beta1CollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**getCertificatesV1beta1APIResources**](CertificatesV1beta1Api.md#getCertificatesV1beta1APIResources) | **GET** /apis/certificates.k8s.io/v1beta1/ | 
[**listCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#listCertificatesV1beta1CertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests | 
[**patchCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#patchCertificatesV1beta1CertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**readCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#readCertificatesV1beta1CertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**replaceCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#replaceCertificatesV1beta1CertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name} | 
[**replaceCertificatesV1beta1CertificateSigningRequestApproval**](CertificatesV1beta1Api.md#replaceCertificatesV1beta1CertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/approval | 
[**replaceCertificatesV1beta1CertificateSigningRequestStatus**](CertificatesV1beta1Api.md#replaceCertificatesV1beta1CertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status | 
[**watchCertificatesV1beta1CertificateSigningRequest**](CertificatesV1beta1Api.md#watchCertificatesV1beta1CertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1beta1/watch/certificatesigningrequests/{name} | 
[**watchCertificatesV1beta1CertificateSigningRequestList**](CertificatesV1beta1Api.md#watchCertificatesV1beta1CertificateSigningRequestList) | **GET** /apis/certificates.k8s.io/v1beta1/watch/certificatesigningrequests | 


<a name="createCertificatesV1beta1CertificateSigningRequest"></a>
# **createCertificatesV1beta1CertificateSigningRequest**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest createCertificatesV1beta1CertificateSigningRequest(body, pretty)



create a CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest body = new IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest(); // IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.createCertificatesV1beta1CertificateSigningRequest(body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#createCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="deleteCertificatesV1beta1CertificateSigningRequest"></a>
# **deleteCertificatesV1beta1CertificateSigningRequest**
> IoK8sApimachineryPkgApisMetaV1Status deleteCertificatesV1beta1CertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteCertificatesV1beta1CertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#deleteCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
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

<a name="deleteCertificatesV1beta1CollectionCertificateSigningRequest"></a>
# **deleteCertificatesV1beta1CollectionCertificateSigningRequest**
> IoK8sApimachineryPkgApisMetaV1Status deleteCertificatesV1beta1CollectionCertificateSigningRequest(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



delete collection of CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteCertificatesV1beta1CollectionCertificateSigningRequest(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#deleteCertificatesV1beta1CollectionCertificateSigningRequest");
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

<a name="getCertificatesV1beta1APIResources"></a>
# **getCertificatesV1beta1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getCertificatesV1beta1APIResources()



get available resources

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getCertificatesV1beta1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#getCertificatesV1beta1APIResources");
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

<a name="listCertificatesV1beta1CertificateSigningRequest"></a>
# **listCertificatesV1beta1CertificateSigningRequest**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequestList listCertificatesV1beta1CertificateSigningRequest(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch)



list or watch objects of kind CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequestList result = apiInstance.listCertificatesV1beta1CertificateSigningRequest(pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#listCertificatesV1beta1CertificateSigningRequest");
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

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequestList**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequestList.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf, application/json;stream=watch, application/vnd.kubernetes.protobuf;stream=watch

<a name="patchCertificatesV1beta1CertificateSigningRequest"></a>
# **patchCertificatesV1beta1CertificateSigningRequest**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest patchCertificatesV1beta1CertificateSigningRequest(name, body, pretty)



partially update the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.patchCertificatesV1beta1CertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#patchCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/strategic-merge-patch+json
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="readCertificatesV1beta1CertificateSigningRequest"></a>
# **readCertificatesV1beta1CertificateSigningRequest**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest readCertificatesV1beta1CertificateSigningRequest(name, pretty, exact, export)



read the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean exact = true; // Boolean | Should the export be exact.  Exact export maintains cluster-specific fields like 'Namespace'.
Boolean export = true; // Boolean | Should this value be exported.  Export strips fields that a user can not specify.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.readCertificatesV1beta1CertificateSigningRequest(name, pretty, exact, export);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#readCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **exact** | **Boolean**| Should the export be exact.  Exact export maintains cluster-specific fields like &#39;Namespace&#39;. | [optional]
 **export** | **Boolean**| Should this value be exported.  Export strips fields that a user can not specify. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificatesV1beta1CertificateSigningRequest"></a>
# **replaceCertificatesV1beta1CertificateSigningRequest**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest replaceCertificatesV1beta1CertificateSigningRequest(name, body, pretty)



replace the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest body = new IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest(); // IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.replaceCertificatesV1beta1CertificateSigningRequest(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificatesV1beta1CertificateSigningRequestApproval"></a>
# **replaceCertificatesV1beta1CertificateSigningRequestApproval**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest replaceCertificatesV1beta1CertificateSigningRequestApproval(name, body, pretty)



replace approval of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest body = new IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest(); // IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.replaceCertificatesV1beta1CertificateSigningRequestApproval(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificatesV1beta1CertificateSigningRequestApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="replaceCertificatesV1beta1CertificateSigningRequestStatus"></a>
# **replaceCertificatesV1beta1CertificateSigningRequestStatus**
> IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest replaceCertificatesV1beta1CertificateSigningRequestStatus(name, body, pretty)



replace status of the specified CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest body = new IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest(); // IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest result = apiInstance.replaceCertificatesV1beta1CertificateSigningRequestStatus(name, body, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#replaceCertificatesV1beta1CertificateSigningRequestStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
 **body** | [**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest**](IoK8sKubernetesPkgApisCertificatesV1beta1CertificateSigningRequest.md)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="watchCertificatesV1beta1CertificateSigningRequest"></a>
# **watchCertificatesV1beta1CertificateSigningRequest**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchCertificatesV1beta1CertificateSigningRequest(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch changes to an object of kind CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String name = "name_example"; // String | name of the CertificateSigningRequest
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchCertificatesV1beta1CertificateSigningRequest(name, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#watchCertificatesV1beta1CertificateSigningRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the CertificateSigningRequest |
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

<a name="watchCertificatesV1beta1CertificateSigningRequestList"></a>
# **watchCertificatesV1beta1CertificateSigningRequestList**
> IoK8sApimachineryPkgApisMetaV1WatchEvent watchCertificatesV1beta1CertificateSigningRequestList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch)



watch individual changes to a list of CertificateSigningRequest

### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.CertificatesV1beta1Api;

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

CertificatesV1beta1Api apiInstance = new CertificatesV1beta1Api();
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
Boolean includeUninitialized = true; // Boolean | If true, partially initialized resources are included in the response.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1WatchEvent result = apiInstance.watchCertificatesV1beta1CertificateSigningRequestList(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatesV1beta1Api#watchCertificatesV1beta1CertificateSigningRequestList");
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

