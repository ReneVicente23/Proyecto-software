/*
 * Mascotas API
 * Modelado de endpoins para la API de mascotas perdidas
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T16:22:03.847948500-04:00[America/La_Paz]")
public class InlineObject {
  public static final String SERIALIZED_NAME_USERMAIL = "usermail";
  @SerializedName(SERIALIZED_NAME_USERMAIL)
  private String usermail;

  public static final String SERIALIZED_NAME_HASHPASWORD = "hashpasword";
  @SerializedName(SERIALIZED_NAME_HASHPASWORD)
  private String hashpasword;


  public InlineObject usermail(String usermail) {
    
    this.usermail = usermail;
    return this;
  }

   /**
   * Get usermail
   * @return usermail
  **/
  @ApiModelProperty(example = "example@gmail.com", required = true, value = "")

  public String getUsermail() {
    return usermail;
  }


  public void setUsermail(String usermail) {
    this.usermail = usermail;
  }


  public InlineObject hashpasword(String hashpasword) {
    
    this.hashpasword = hashpasword;
    return this;
  }

   /**
   * Get hashpasword
   * @return hashpasword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fads5f4a65f4ad65f4a65f4a6798e7wr8q7wer9q7wer87qr97", value = "")

  public String getHashpasword() {
    return hashpasword;
  }


  public void setHashpasword(String hashpasword) {
    this.hashpasword = hashpasword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.usermail, inlineObject.usermail) &&
        Objects.equals(this.hashpasword, inlineObject.hashpasword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usermail, hashpasword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    usermail: ").append(toIndentedString(usermail)).append("\n");
    sb.append("    hashpasword: ").append(toIndentedString(hashpasword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

