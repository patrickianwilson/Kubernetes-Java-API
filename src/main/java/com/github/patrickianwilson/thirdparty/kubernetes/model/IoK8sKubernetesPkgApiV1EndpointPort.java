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
 * EndpointPort is a tuple that describes a single port.
 */
@ApiModel(description = "EndpointPort is a tuple that describes a single port.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1EndpointPort {
  @SerializedName("name")
  private String name = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("protocol")
  private String protocol = null;

  public IoK8sKubernetesPkgApiV1EndpointPort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this port (corresponds to ServicePort.Name). Must be a DNS_LABEL. Optional only if one port is defined.
   * @return name
  **/
  @ApiModelProperty(value = "The name of this port (corresponds to ServicePort.Name). Must be a DNS_LABEL. Optional only if one port is defined.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sKubernetesPkgApiV1EndpointPort port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port number of the endpoint.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port number of the endpoint.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public IoK8sKubernetesPkgApiV1EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The IP protocol for this port. Must be UDP or TCP. Default is TCP.
   * @return protocol
  **/
  @ApiModelProperty(value = "The IP protocol for this port. Must be UDP or TCP. Default is TCP.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1EndpointPort ioK8sKubernetesPkgApiV1EndpointPort = (IoK8sKubernetesPkgApiV1EndpointPort) o;
    return Objects.equals(this.name, ioK8sKubernetesPkgApiV1EndpointPort.name) &&
        Objects.equals(this.port, ioK8sKubernetesPkgApiV1EndpointPort.port) &&
        Objects.equals(this.protocol, ioK8sKubernetesPkgApiV1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1EndpointPort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
