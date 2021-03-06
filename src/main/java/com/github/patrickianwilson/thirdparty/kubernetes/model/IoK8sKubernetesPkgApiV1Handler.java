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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1ExecAction;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1HTTPGetAction;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1TCPSocketAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Handler defines a specific action that should be taken
 */
@ApiModel(description = "Handler defines a specific action that should be taken")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1Handler {
  @SerializedName("exec")
  private IoK8sKubernetesPkgApiV1ExecAction exec = null;

  @SerializedName("httpGet")
  private IoK8sKubernetesPkgApiV1HTTPGetAction httpGet = null;

  @SerializedName("tcpSocket")
  private IoK8sKubernetesPkgApiV1TCPSocketAction tcpSocket = null;

  public IoK8sKubernetesPkgApiV1Handler exec(IoK8sKubernetesPkgApiV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

   /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   * @return exec
  **/
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  public IoK8sKubernetesPkgApiV1ExecAction getExec() {
    return exec;
  }

  public void setExec(IoK8sKubernetesPkgApiV1ExecAction exec) {
    this.exec = exec;
  }

  public IoK8sKubernetesPkgApiV1Handler httpGet(IoK8sKubernetesPkgApiV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * HTTPGet specifies the http request to perform.
   * @return httpGet
  **/
  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  public IoK8sKubernetesPkgApiV1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(IoK8sKubernetesPkgApiV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public IoK8sKubernetesPkgApiV1Handler tcpSocket(IoK8sKubernetesPkgApiV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * TCPSocket specifies an action involving a TCP exposedPort. TCP hooks not yet supported
   * @return tcpSocket
  **/
  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP exposedPort. TCP hooks not yet supported")
  public IoK8sKubernetesPkgApiV1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(IoK8sKubernetesPkgApiV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1Handler ioK8sKubernetesPkgApiV1Handler = (IoK8sKubernetesPkgApiV1Handler) o;
    return Objects.equals(this.exec, ioK8sKubernetesPkgApiV1Handler.exec) &&
        Objects.equals(this.httpGet, ioK8sKubernetesPkgApiV1Handler.httpGet) &&
        Objects.equals(this.tcpSocket, ioK8sKubernetesPkgApiV1Handler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1Handler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

