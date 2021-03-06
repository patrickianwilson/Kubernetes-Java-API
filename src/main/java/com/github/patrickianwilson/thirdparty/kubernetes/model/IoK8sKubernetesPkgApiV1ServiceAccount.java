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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1LocalObjectReference;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1ObjectReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
 */
@ApiModel(description = "ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1ServiceAccount {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("automountServiceAccountToken")
  private Boolean automountServiceAccountToken = null;

  @SerializedName("imagePullSecrets")
  private List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("secrets")
  private List<IoK8sKubernetesPkgApiV1ObjectReference> secrets = null;

  public IoK8sKubernetesPkgApiV1ServiceAccount apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
   * @return automountServiceAccountToken
  **/
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.")
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount imagePullSecrets(List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount addImagePullSecretsItem(IoK8sKubernetesPkgApiV1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<IoK8sKubernetesPkgApiV1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @ApiModelProperty(value = "ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod")
  public List<IoK8sKubernetesPkgApiV1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<IoK8sKubernetesPkgApiV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount secrets(List<IoK8sKubernetesPkgApiV1ObjectReference> secrets) {
    this.secrets = secrets;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceAccount addSecretsItem(IoK8sKubernetesPkgApiV1ObjectReference secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<IoK8sKubernetesPkgApiV1ObjectReference>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
   * @return secrets
  **/
  @ApiModelProperty(value = "Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret")
  public List<IoK8sKubernetesPkgApiV1ObjectReference> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<IoK8sKubernetesPkgApiV1ObjectReference> secrets) {
    this.secrets = secrets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1ServiceAccount ioK8sKubernetesPkgApiV1ServiceAccount = (IoK8sKubernetesPkgApiV1ServiceAccount) o;
    return Objects.equals(this.apiVersion, ioK8sKubernetesPkgApiV1ServiceAccount.apiVersion) &&
        Objects.equals(this.automountServiceAccountToken, ioK8sKubernetesPkgApiV1ServiceAccount.automountServiceAccountToken) &&
        Objects.equals(this.imagePullSecrets, ioK8sKubernetesPkgApiV1ServiceAccount.imagePullSecrets) &&
        Objects.equals(this.kind, ioK8sKubernetesPkgApiV1ServiceAccount.kind) &&
        Objects.equals(this.metadata, ioK8sKubernetesPkgApiV1ServiceAccount.metadata) &&
        Objects.equals(this.secrets, ioK8sKubernetesPkgApiV1ServiceAccount.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1ServiceAccount {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

