
# IoK8sKubernetesPkgApiV1Probe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**IoK8sKubernetesPkgApiV1ExecAction**](IoK8sKubernetesPkgApiV1ExecAction.md) | One and only one of the following should be specified. Exec specifies the action to take. |  [optional]
**failureThreshold** | **Integer** | Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. |  [optional]
**httpGet** | [**IoK8sKubernetesPkgApiV1HTTPGetAction**](IoK8sKubernetesPkgApiV1HTTPGetAction.md) | HTTPGet specifies the http request to perform. |  [optional]
**initialDelaySeconds** | **Integer** | Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]
**periodSeconds** | **Integer** | How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. |  [optional]
**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1. |  [optional]
**tcpSocket** | [**IoK8sKubernetesPkgApiV1TCPSocketAction**](IoK8sKubernetesPkgApiV1TCPSocketAction.md) | TCPSocket specifies an action involving a TCP exposedPort. TCP hooks not yet supported |  [optional]
**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]



