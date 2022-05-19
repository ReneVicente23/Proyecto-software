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
 * InfoProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T16:22:03.847948500-04:00[America/La_Paz]")
public class InfoProfile {
  public static final String SERIALIZED_NAME_USERID = "userid";
  @SerializedName(SERIALIZED_NAME_USERID)
  private Integer userid;

  public static final String SERIALIZED_NAME_USERMAIL = "usermail";
  @SerializedName(SERIALIZED_NAME_USERMAIL)
  private String usermail;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_ADITIONALCONTACTS = "aditionalcontacts";
  @SerializedName(SERIALIZED_NAME_ADITIONALCONTACTS)
  private String aditionalcontacts;


  public InfoProfile userid(Integer userid) {
    
    this.userid = userid;
    return this;
  }

   /**
   * Get userid
   * @return userid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "")

  public Integer getUserid() {
    return userid;
  }


  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public InfoProfile usermail(String usermail) {
    
    this.usermail = usermail;
    return this;
  }

   /**
   * Get usermail
   * @return usermail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@gmail.com", value = "")

  public String getUsermail() {
    return usermail;
  }


  public void setUsermail(String usermail) {
    this.usermail = usermail;
  }


  public InfoProfile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Juan Paco", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InfoProfile lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pedro D.LaMar", value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public InfoProfile aditionalcontacts(String aditionalcontacts) {
    
    this.aditionalcontacts = aditionalcontacts;
    return this;
  }

   /**
   * Get aditionalcontacts
   * @return aditionalcontacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Telefono 123456789", value = "")

  public String getAditionalcontacts() {
    return aditionalcontacts;
  }


  public void setAditionalcontacts(String aditionalcontacts) {
    this.aditionalcontacts = aditionalcontacts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoProfile infoProfile = (InfoProfile) o;
    return Objects.equals(this.userid, infoProfile.userid) &&
        Objects.equals(this.usermail, infoProfile.usermail) &&
        Objects.equals(this.name, infoProfile.name) &&
        Objects.equals(this.lastname, infoProfile.lastname) &&
        Objects.equals(this.aditionalcontacts, infoProfile.aditionalcontacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, usermail, name, lastname, aditionalcontacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoProfile {\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    usermail: ").append(toIndentedString(usermail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    aditionalcontacts: ").append(toIndentedString(aditionalcontacts)).append("\n");
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

