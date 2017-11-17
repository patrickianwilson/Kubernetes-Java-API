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
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 */
@ApiModel(description = "PersistentVolumeClaimStatus is the current status of a persistent volume claim.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus {
  @SerializedName("accessModes")
  private List<String> accessModes = null;

  @SerializedName("capacity")
  private Map<String, String> capacity = null;

  @SerializedName("phase")
  private String phase = null;

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<String>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @ApiModelProperty(value = "AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus putCapacityItem(String key, String capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<String, String>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Represents the actual resources of the underlying volume.
   * @return capacity
  **/
  @ApiModelProperty(value = "Represents the actual resources of the underlying volume.")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase represents the current phase of PersistentVolumeClaim.
   * @return phase
  **/
  @ApiModelProperty(value = "Phase represents the current phase of PersistentVolumeClaim.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus ioK8sKubernetesPkgApiV1PersistentVolumeClaimStatus = (IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus) o;
    return Objects.equals(this.accessModes, ioK8sKubernetesPkgApiV1PersistentVolumeClaimStatus.accessModes) &&
        Objects.equals(this.capacity, ioK8sKubernetesPkgApiV1PersistentVolumeClaimStatus.capacity) &&
        Objects.equals(this.phase, ioK8sKubernetesPkgApiV1PersistentVolumeClaimStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, capacity, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PersistentVolumeClaimStatus {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
