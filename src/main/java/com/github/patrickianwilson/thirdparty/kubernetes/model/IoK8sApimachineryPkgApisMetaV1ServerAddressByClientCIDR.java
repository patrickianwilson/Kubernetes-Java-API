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
 * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
 */
@ApiModel(description = "ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR {
  @SerializedName("clientCIDR")
  private String clientCIDR = null;

  @SerializedName("serverAddress")
  private String serverAddress = null;

  public IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR clientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return this;
  }

   /**
   * The CIDR with which clients can match their IP to figure out the server address that they should use.
   * @return clientCIDR
  **/
  @ApiModelProperty(required = true, value = "The CIDR with which clients can match their IP to figure out the server address that they should use.")
  public String getClientCIDR() {
    return clientCIDR;
  }

  public void setClientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
  }

  public IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR serverAddress(String serverAddress) {
    this.serverAddress = serverAddress;
    return this;
  }

   /**
   * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:exposedPort, IP or IP:exposedPort.
   * @return serverAddress
  **/
  @ApiModelProperty(required = true, value = "Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:exposedPort, IP or IP:exposedPort.")
  public String getServerAddress() {
    return serverAddress;
  }

  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR ioK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR = (IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR) o;
    return Objects.equals(this.clientCIDR, ioK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR.clientCIDR) &&
        Objects.equals(this.serverAddress, ioK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR.serverAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCIDR, serverAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR {\n");
    
    sb.append("    clientCIDR: ").append(toIndentedString(clientCIDR)).append("\n");
    sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
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

