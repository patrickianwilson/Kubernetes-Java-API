
# IoK8sKubernetesPkgApisAppsV1beta1DeploymentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minReadySeconds** | **Integer** | Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) |  [optional]
**paused** | **Boolean** | Indicates that the deployment is paused. |  [optional]
**progressDeadlineSeconds** | **Integer** | The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Once autoRollback is implemented, the deployment controller will automatically rollback failed deployments. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s. |  [optional]
**replicas** | **Integer** | Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. |  [optional]
**revisionHistoryLimit** | **Integer** | The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 2. |  [optional]
**rollbackTo** | [**IoK8sKubernetesPkgApisAppsV1beta1RollbackConfig**](IoK8sKubernetesPkgApisAppsV1beta1RollbackConfig.md) | The config this deployment is rolling back to. Will be cleared after rollback is done. |  [optional]
**selector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. |  [optional]
**strategy** | [**IoK8sKubernetesPkgApisAppsV1beta1DeploymentStrategy**](IoK8sKubernetesPkgApisAppsV1beta1DeploymentStrategy.md) | The deployment strategy to use to replace existing pods with new ones. |  [optional]
**template** | [**IoK8sKubernetesPkgApiV1PodTemplateSpec**](IoK8sKubernetesPkgApiV1PodTemplateSpec.md) | Template describes the pods that will be created. | 



