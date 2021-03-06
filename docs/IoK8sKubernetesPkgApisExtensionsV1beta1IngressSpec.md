
# IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend** | [**IoK8sKubernetesPkgApisExtensionsV1beta1IngressBackend**](IoK8sKubernetesPkgApisExtensionsV1beta1IngressBackend.md) | A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default. |  [optional]
**rules** | [**List&lt;IoK8sKubernetesPkgApisExtensionsV1beta1IngressRule&gt;**](IoK8sKubernetesPkgApisExtensionsV1beta1IngressRule.md) | A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend. |  [optional]
**tls** | [**List&lt;IoK8sKubernetesPkgApisExtensionsV1beta1IngressTLS&gt;**](IoK8sKubernetesPkgApisExtensionsV1beta1IngressTLS.md) | TLS configuration. Currently the Ingress only supports a single TLS exposedPort, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same exposedPort according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI. |  [optional]



