# LogsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logFileHandler**](LogsApi.md#logFileHandler) | **GET** /logs/{logpath} | 
[**logFileListHandler**](LogsApi.md#logFileListHandler) | **GET** /logs/ | 


<a name="logFileHandler"></a>
# **logFileHandler**
> logFileHandler(logpath)



### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.LogsApi;

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

LogsApi apiInstance = new LogsApi();
String logpath = "logpath_example"; // String | path to the log
try {
    apiInstance.logFileHandler(logpath);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logFileHandler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logpath** | **String**| path to the log |

### Return type

null (empty response body)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="logFileListHandler"></a>
# **logFileListHandler**
> logFileListHandler()



### Example
```java
// Import classes:
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiClient;
//import com.github.patrickianwilson.thirdparty.kubernetes.ApiException;
//import com.github.patrickianwilson.thirdparty.kubernetes.Configuration;
//import com.github.patrickianwilson.thirdparty.kubernetes.auth.*;
//import com.github.patrickianwilson.thirdparty.kubernetes.api.LogsApi;

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

LogsApi apiInstance = new LogsApi();
try {
    apiInstance.logFileListHandler();
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#logFileListHandler");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BearerToken](../README.md#BearerToken), [HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

