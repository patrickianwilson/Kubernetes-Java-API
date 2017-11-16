
# IoK8sKubernetesPkgApiV1EnvVarSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMapKeyRef** | [**IoK8sKubernetesPkgApiV1ConfigMapKeySelector**](IoK8sKubernetesPkgApiV1ConfigMapKeySelector.md) | Selects a key of a ConfigMap. |  [optional]
**fieldRef** | [**IoK8sKubernetesPkgApiV1ObjectFieldSelector**](IoK8sKubernetesPkgApiV1ObjectFieldSelector.md) | Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP. |  [optional]
**resourceFieldRef** | [**IoK8sKubernetesPkgApiV1ResourceFieldSelector**](IoK8sKubernetesPkgApiV1ResourceFieldSelector.md) | Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported. |  [optional]
**secretKeyRef** | [**IoK8sKubernetesPkgApiV1SecretKeySelector**](IoK8sKubernetesPkgApiV1SecretKeySelector.md) | Selects a key of a secret in the pod&#39;s namespace |  [optional]



