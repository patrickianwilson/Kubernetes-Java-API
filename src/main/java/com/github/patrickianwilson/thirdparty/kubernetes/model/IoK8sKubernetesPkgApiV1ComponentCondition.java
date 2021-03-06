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
 * Information about the condition of a component.
 */
@ApiModel(description = "Information about the condition of a component.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1ComponentCondition {
  @SerializedName("error")
  private String error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sKubernetesPkgApiV1ComponentCondition error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Condition error code for a component. For example, a health check error code.
   * @return error
  **/
  @ApiModelProperty(value = "Condition error code for a component. For example, a health check error code.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public IoK8sKubernetesPkgApiV1ComponentCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message about the condition for a component. For example, information about a health check.
   * @return message
  **/
  @ApiModelProperty(value = "Message about the condition for a component. For example, information about a health check.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sKubernetesPkgApiV1ComponentCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition for a component. Valid values for \&quot;Healthy\&quot;: \&quot;True\&quot;, \&quot;False\&quot;, or \&quot;Unknown\&quot;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition for a component. Valid values for \"Healthy\": \"True\", \"False\", or \"Unknown\".")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sKubernetesPkgApiV1ComponentCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of condition for a component. Valid value: \&quot;Healthy\&quot;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of condition for a component. Valid value: \"Healthy\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1ComponentCondition ioK8sKubernetesPkgApiV1ComponentCondition = (IoK8sKubernetesPkgApiV1ComponentCondition) o;
    return Objects.equals(this.error, ioK8sKubernetesPkgApiV1ComponentCondition.error) &&
        Objects.equals(this.message, ioK8sKubernetesPkgApiV1ComponentCondition.message) &&
        Objects.equals(this.status, ioK8sKubernetesPkgApiV1ComponentCondition.status) &&
        Objects.equals(this.type, ioK8sKubernetesPkgApiV1ComponentCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1ComponentCondition {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

