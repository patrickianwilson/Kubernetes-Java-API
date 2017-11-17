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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApisExtensionsV1beta1IngressStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
 */
@ApiModel(description = "Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApisExtensionsV1beta1Ingress {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("spec")
  private IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec spec = null;

  @SerializedName("status")
  private IoK8sKubernetesPkgApisExtensionsV1beta1IngressStatus status = null;

  public IoK8sKubernetesPkgApisExtensionsV1beta1Ingress apiVersion(String apiVersion) {
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

  public IoK8sKubernetesPkgApisExtensionsV1beta1Ingress kind(String kind) {
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

  public IoK8sKubernetesPkgApisExtensionsV1beta1Ingress metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
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

  public IoK8sKubernetesPkgApisExtensionsV1beta1Ingress spec(IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @ApiModelProperty(value = "Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sKubernetesPkgApisExtensionsV1beta1IngressSpec spec) {
    this.spec = spec;
  }

  public IoK8sKubernetesPkgApisExtensionsV1beta1Ingress status(IoK8sKubernetesPkgApisExtensionsV1beta1IngressStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return status
  **/
  @ApiModelProperty(value = "Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public IoK8sKubernetesPkgApisExtensionsV1beta1IngressStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sKubernetesPkgApisExtensionsV1beta1IngressStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApisExtensionsV1beta1Ingress ioK8sKubernetesPkgApisExtensionsV1beta1Ingress = (IoK8sKubernetesPkgApisExtensionsV1beta1Ingress) o;
    return Objects.equals(this.apiVersion, ioK8sKubernetesPkgApisExtensionsV1beta1Ingress.apiVersion) &&
        Objects.equals(this.kind, ioK8sKubernetesPkgApisExtensionsV1beta1Ingress.kind) &&
        Objects.equals(this.metadata, ioK8sKubernetesPkgApisExtensionsV1beta1Ingress.metadata) &&
        Objects.equals(this.spec, ioK8sKubernetesPkgApisExtensionsV1beta1Ingress.spec) &&
        Objects.equals(this.status, ioK8sKubernetesPkgApisExtensionsV1beta1Ingress.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisExtensionsV1beta1Ingress {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
