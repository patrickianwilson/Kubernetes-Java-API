
# IoK8sKubernetesPkgApisAppsV1beta1StatefulSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentReplicas** | **Integer** | currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision. |  [optional]
**currentRevision** | **String** | currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas). |  [optional]
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server. |  [optional]
**readyReplicas** | **Integer** | readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition. |  [optional]
**replicas** | **Integer** | replicas is the number of Pods created by the StatefulSet controller. | 
**updateRevision** | **String** | updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas) |  [optional]
**updatedReplicas** | **Integer** | updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision. |  [optional]



