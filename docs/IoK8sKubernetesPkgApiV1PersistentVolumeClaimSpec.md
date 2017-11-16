
# IoK8sKubernetesPkgApiV1PersistentVolumeClaimSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 |  [optional]
**resources** | [**IoK8sKubernetesPkgApiV1ResourceRequirements**](IoK8sKubernetesPkgApiV1ResourceRequirements.md) | Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources |  [optional]
**selector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | A label query over volumes to consider for binding. |  [optional]
**storageClassName** | **String** | Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 |  [optional]
**volumeName** | **String** | VolumeName is the binding reference to the PersistentVolume backing this claim. |  [optional]



