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

/**
 * Represents a Photon Controller persistent disk resource.
 */
@ApiModel(description = "Represents a Photon Controller persistent disk resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("pdID")
  private String pdID = null;

  public IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource pdID(String pdID) {
    this.pdID = pdID;
    return this;
  }

   /**
   * ID that identifies Photon Controller persistent disk
   * @return pdID
  **/
  @ApiModelProperty(required = true, value = "ID that identifies Photon Controller persistent disk")
  public String getPdID() {
    return pdID;
  }

  public void setPdID(String pdID) {
    this.pdID = pdID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource ioK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource = (IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource) o;
    return Objects.equals(this.fsType, ioK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource.fsType) &&
        Objects.equals(this.pdID, ioK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource.pdID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, pdID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PhotonPersistentDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    pdID: ").append(toIndentedString(pdID)).append("\n");
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
