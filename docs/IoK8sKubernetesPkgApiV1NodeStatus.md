
# IoK8sKubernetesPkgApiV1NodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;IoK8sKubernetesPkgApiV1NodeAddress&gt;**](IoK8sKubernetesPkgApiV1NodeAddress.md) | List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses |  [optional]
**allocatable** | **Map&lt;String, String&gt;** | Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. |  [optional]
**capacity** | **Map&lt;String, String&gt;** | Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional]
**conditions** | [**List&lt;IoK8sKubernetesPkgApiV1NodeCondition&gt;**](IoK8sKubernetesPkgApiV1NodeCondition.md) | Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition |  [optional]
**daemonEndpoints** | [**IoK8sKubernetesPkgApiV1NodeDaemonEndpoints**](IoK8sKubernetesPkgApiV1NodeDaemonEndpoints.md) | Endpoints of daemons running on the Node. |  [optional]
**images** | [**List&lt;IoK8sKubernetesPkgApiV1ContainerImage&gt;**](IoK8sKubernetesPkgApiV1ContainerImage.md) | List of container images on this node |  [optional]
**nodeInfo** | [**IoK8sKubernetesPkgApiV1NodeSystemInfo**](IoK8sKubernetesPkgApiV1NodeSystemInfo.md) | Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info |  [optional]
**phase** | **String** | NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. |  [optional]
**volumesAttached** | [**List&lt;IoK8sKubernetesPkgApiV1AttachedVolume&gt;**](IoK8sKubernetesPkgApiV1AttachedVolume.md) | List of volumes that are attached to the node. |  [optional]
**volumesInUse** | **List&lt;String&gt;** | List of attachable volumes in use (mounted) by the node. |  [optional]



