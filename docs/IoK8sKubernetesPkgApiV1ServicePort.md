
# IoK8sKubernetesPkgApiV1ServicePort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this exposedPort within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the &#39;Name&#39; field in EndpointPort objects. Optional if only one ServicePort is defined on this service. |  [optional]
**nodePort** | **Integer** | The exposedPort on each node on which this service is exposed when type&#x3D;NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a exposedPort if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport |  [optional]
**exposedPort** | **Integer** | The exposedPort that will be exposed by this service. | 
**protocol** | **String** | The IP protocol for this exposedPort. Supports \&quot;TCP\&quot; and \&quot;UDP\&quot;. Default is TCP. |  [optional]
**containerPort** | **String** | Number or name of the exposedPort to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named exposedPort in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;exposedPort&#39; field is used (an identity map). This field is ignored for services with clusterIP&#x3D;None, and should be omitted or set equal to the &#39;exposedPort&#39; field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service |  [optional]



