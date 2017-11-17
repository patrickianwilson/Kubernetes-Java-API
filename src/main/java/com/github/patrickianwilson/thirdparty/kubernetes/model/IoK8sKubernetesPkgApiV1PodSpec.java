/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.7.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.patrickianwilson.thirdparty.kubernetes.model;

import java.util.Objects;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1Affinity;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1Container;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1HostAlias;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1LocalObjectReference;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1PodSecurityContext;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1Toleration;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1Volume;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PodSpec is a description of a pod.
 */
@ApiModel(description = "PodSpec is a description of a pod.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1PodSpec {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("affinity")
  private IoK8sKubernetesPkgApiV1Affinity affinity = null;

  @SerializedName("automountServiceAccountToken")
  private Boolean automountServiceAccountToken = null;

  @SerializedName("containers")
  private List<IoK8sKubernetesPkgApiV1Container> containers = new ArrayList<IoK8sKubernetesPkgApiV1Container>();

  @SerializedName("dnsPolicy")
  private String dnsPolicy = null;

  @SerializedName("hostAliases")
  private List<IoK8sKubernetesPkgApiV1HostAlias> hostAliases = null;

  @SerializedName("hostIPC")
  private Boolean hostIPC = null;

  @SerializedName("hostNetwork")
  private Boolean hostNetwork = null;

  @SerializedName("hostPID")
  private Boolean hostPID = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("imagePullSecrets")
  private List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets = null;

  @SerializedName("initContainers")
  private List<IoK8sKubernetesPkgApiV1Container> initContainers = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = null;

  @SerializedName("restartPolicy")
  private String restartPolicy = null;

  @SerializedName("schedulerName")
  private String schedulerName = null;

  @SerializedName("securityContext")
  private IoK8sKubernetesPkgApiV1PodSecurityContext securityContext = null;

  @SerializedName("serviceAccount")
  private String serviceAccount = null;

  @SerializedName("serviceAccountName")
  private String serviceAccountName = null;

  @SerializedName("subdomain")
  private String subdomain = null;

  @SerializedName("terminationGracePeriodSeconds")
  private Long terminationGracePeriodSeconds = null;

  @SerializedName("tolerations")
  private List<IoK8sKubernetesPkgApiV1Toleration> tolerations = null;

  @SerializedName("volumes")
  private List<IoK8sKubernetesPkgApiV1Volume> volumes = null;

  public IoK8sKubernetesPkgApiV1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(value = "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public IoK8sKubernetesPkgApiV1PodSpec affinity(IoK8sKubernetesPkgApiV1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * If specified, the pod&#39;s scheduling constraints
   * @return affinity
  **/
  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  public IoK8sKubernetesPkgApiV1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(IoK8sKubernetesPkgApiV1Affinity affinity) {
    this.affinity = affinity;
  }

  public IoK8sKubernetesPkgApiV1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public IoK8sKubernetesPkgApiV1PodSpec containers(List<IoK8sKubernetesPkgApiV1Container> containers) {
    this.containers = containers;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addContainersItem(IoK8sKubernetesPkgApiV1Container containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  public List<IoK8sKubernetesPkgApiV1Container> getContainers() {
    return containers;
  }

  public void setContainers(List<IoK8sKubernetesPkgApiV1Container> containers) {
    this.containers = containers;
  }

  public IoK8sKubernetesPkgApiV1PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

   /**
   * Set DNS policy for containers within the pod. One of &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39; or &#39;Default&#39;. Defaults to \&quot;ClusterFirst\&quot;. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @ApiModelProperty(value = "Set DNS policy for containers within the pod. One of 'ClusterFirstWithHostNet', 'ClusterFirst' or 'Default'. Defaults to \"ClusterFirst\". To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public IoK8sKubernetesPkgApiV1PodSpec hostAliases(List<IoK8sKubernetesPkgApiV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addHostAliasesItem(IoK8sKubernetesPkgApiV1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<IoK8sKubernetesPkgApiV1HostAlias>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified. This is only valid for non-hostNetwork pods.
   * @return hostAliases
  **/
  @ApiModelProperty(value = "HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
  public List<IoK8sKubernetesPkgApiV1HostAlias> getHostAliases() {
    return hostAliases;
  }

  public void setHostAliases(List<IoK8sKubernetesPkgApiV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }

  public IoK8sKubernetesPkgApiV1PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   * @return hostIPC
  **/
  @ApiModelProperty(value = "Use the host's ipc namespace. Optional: Default to false.")
  public Boolean getHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public IoK8sKubernetesPkgApiV1PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   * @return hostNetwork
  **/
  @ApiModelProperty(value = "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public IoK8sKubernetesPkgApiV1PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

   /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   * @return hostPID
  **/
  @ApiModelProperty(value = "Use the host's pid namespace. Optional: Default to false.")
  public Boolean getHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public IoK8sKubernetesPkgApiV1PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   * @return hostname
  **/
  @ApiModelProperty(value = "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sKubernetesPkgApiV1PodSpec imagePullSecrets(List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addImagePullSecretsItem(IoK8sKubernetesPkgApiV1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<IoK8sKubernetesPkgApiV1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  public List<IoK8sKubernetesPkgApiV1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public IoK8sKubernetesPkgApiV1PodSpec initContainers(List<IoK8sKubernetesPkgApiV1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addInitContainersItem(IoK8sKubernetesPkgApiV1Container initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<IoK8sKubernetesPkgApiV1Container>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   * @return initContainers
  **/
  @ApiModelProperty(value = "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  public List<IoK8sKubernetesPkgApiV1Container> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<IoK8sKubernetesPkgApiV1Container> initContainers) {
    this.initContainers = initContainers;
  }

  public IoK8sKubernetesPkgApiV1PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   * @return nodeName
  **/
  @ApiModelProperty(value = "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public IoK8sKubernetesPkgApiV1PodSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public IoK8sKubernetesPkgApiV1PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   * @return restartPolicy
  **/
  @ApiModelProperty(value = "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public IoK8sKubernetesPkgApiV1PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public IoK8sKubernetesPkgApiV1PodSpec securityContext(IoK8sKubernetesPkgApiV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
   * @return securityContext
  **/
  @ApiModelProperty(value = "SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
  public IoK8sKubernetesPkgApiV1PodSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(IoK8sKubernetesPkgApiV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public IoK8sKubernetesPkgApiV1PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   * @return serviceAccount
  **/
  @ApiModelProperty(value = "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public IoK8sKubernetesPkgApiV1PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   * @return serviceAccountName
  **/
  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public IoK8sKubernetesPkgApiV1PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

   /**
   * If specified, the fully qualified Pod hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   * @return subdomain
  **/
  @ApiModelProperty(value = "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public IoK8sKubernetesPkgApiV1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   * @return terminationGracePeriodSeconds
  **/
  @ApiModelProperty(value = "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public IoK8sKubernetesPkgApiV1PodSpec tolerations(List<IoK8sKubernetesPkgApiV1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addTolerationsItem(IoK8sKubernetesPkgApiV1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<IoK8sKubernetesPkgApiV1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<IoK8sKubernetesPkgApiV1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<IoK8sKubernetesPkgApiV1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public IoK8sKubernetesPkgApiV1PodSpec volumes(List<IoK8sKubernetesPkgApiV1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSpec addVolumesItem(IoK8sKubernetesPkgApiV1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<IoK8sKubernetesPkgApiV1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   * @return volumes
  **/
  @ApiModelProperty(value = "List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
  public List<IoK8sKubernetesPkgApiV1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<IoK8sKubernetesPkgApiV1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PodSpec ioK8sKubernetesPkgApiV1PodSpec = (IoK8sKubernetesPkgApiV1PodSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, ioK8sKubernetesPkgApiV1PodSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, ioK8sKubernetesPkgApiV1PodSpec.affinity) &&
        Objects.equals(this.automountServiceAccountToken, ioK8sKubernetesPkgApiV1PodSpec.automountServiceAccountToken) &&
        Objects.equals(this.containers, ioK8sKubernetesPkgApiV1PodSpec.containers) &&
        Objects.equals(this.dnsPolicy, ioK8sKubernetesPkgApiV1PodSpec.dnsPolicy) &&
        Objects.equals(this.hostAliases, ioK8sKubernetesPkgApiV1PodSpec.hostAliases) &&
        Objects.equals(this.hostIPC, ioK8sKubernetesPkgApiV1PodSpec.hostIPC) &&
        Objects.equals(this.hostNetwork, ioK8sKubernetesPkgApiV1PodSpec.hostNetwork) &&
        Objects.equals(this.hostPID, ioK8sKubernetesPkgApiV1PodSpec.hostPID) &&
        Objects.equals(this.hostname, ioK8sKubernetesPkgApiV1PodSpec.hostname) &&
        Objects.equals(this.imagePullSecrets, ioK8sKubernetesPkgApiV1PodSpec.imagePullSecrets) &&
        Objects.equals(this.initContainers, ioK8sKubernetesPkgApiV1PodSpec.initContainers) &&
        Objects.equals(this.nodeName, ioK8sKubernetesPkgApiV1PodSpec.nodeName) &&
        Objects.equals(this.nodeSelector, ioK8sKubernetesPkgApiV1PodSpec.nodeSelector) &&
        Objects.equals(this.restartPolicy, ioK8sKubernetesPkgApiV1PodSpec.restartPolicy) &&
        Objects.equals(this.schedulerName, ioK8sKubernetesPkgApiV1PodSpec.schedulerName) &&
        Objects.equals(this.securityContext, ioK8sKubernetesPkgApiV1PodSpec.securityContext) &&
        Objects.equals(this.serviceAccount, ioK8sKubernetesPkgApiV1PodSpec.serviceAccount) &&
        Objects.equals(this.serviceAccountName, ioK8sKubernetesPkgApiV1PodSpec.serviceAccountName) &&
        Objects.equals(this.subdomain, ioK8sKubernetesPkgApiV1PodSpec.subdomain) &&
        Objects.equals(this.terminationGracePeriodSeconds, ioK8sKubernetesPkgApiV1PodSpec.terminationGracePeriodSeconds) &&
        Objects.equals(this.tolerations, ioK8sKubernetesPkgApiV1PodSpec.tolerations) &&
        Objects.equals(this.volumes, ioK8sKubernetesPkgApiV1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsPolicy, hostAliases, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, restartPolicy, schedulerName, securityContext, serviceAccount, serviceAccountName, subdomain, terminationGracePeriodSeconds, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PodSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
