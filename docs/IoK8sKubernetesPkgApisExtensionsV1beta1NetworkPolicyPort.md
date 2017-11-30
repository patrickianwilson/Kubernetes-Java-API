
# IoK8sKubernetesPkgApisExtensionsV1beta1NetworkPolicyPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exposedPort** | **String** | If specified, the exposedPort on the given protocol.  This can either be a numerical or named exposedPort on a pod.  If this field is not provided, this matches all exposedPort names and numbers. If present, only traffic on the specified protocol AND exposedPort will be matched. |  [optional]
**protocol** | **String** | Optional.  The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP. |  [optional]



