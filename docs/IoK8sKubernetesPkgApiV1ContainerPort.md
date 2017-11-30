
# IoK8sKubernetesPkgApiV1ContainerPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerPort** | **Integer** | Number of exposedPort to expose on the pod&#39;s IP address. This must be a valid exposedPort number, 0 &lt; x &lt; 65536. | 
**hostIP** | **String** | What host IP to bind the external exposedPort to. |  [optional]
**hostPort** | **Integer** | Number of exposedPort to expose on the host. If specified, this must be a valid exposedPort number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this. |  [optional]
**name** | **String** | If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named exposedPort in a pod must have a unique name. Name for the exposedPort that can be referred to by services. |  [optional]
**protocol** | **String** | Protocol for exposedPort. Must be UDP or TCP. Defaults to \&quot;TCP\&quot;. |  [optional]



