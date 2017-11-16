
# IoK8sKubernetesPkgApiV1Handler

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**IoK8sKubernetesPkgApiV1ExecAction**](IoK8sKubernetesPkgApiV1ExecAction.md) | One and only one of the following should be specified. Exec specifies the action to take. |  [optional]
**httpGet** | [**IoK8sKubernetesPkgApiV1HTTPGetAction**](IoK8sKubernetesPkgApiV1HTTPGetAction.md) | HTTPGet specifies the http request to perform. |  [optional]
**tcpSocket** | [**IoK8sKubernetesPkgApiV1TCPSocketAction**](IoK8sKubernetesPkgApiV1TCPSocketAction.md) | TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported |  [optional]



