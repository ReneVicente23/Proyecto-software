# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**petUseridGet**](DefaultApi.md#petUseridGet) | **GET** /pet/{userid} | Obtener la lista de mascotas registradas del usuario
[**petUseridPost**](DefaultApi.md#petUseridPost) | **POST** /pet/{userid} | Registrar nueva mascota
[**userGet**](DefaultApi.md#userGet) | **GET** /user | Obtener información usuario
[**userPost**](DefaultApi.md#userPost) | **POST** /user | Registrar nuevo usuario


<a name="petUseridGet"></a>
# **petUseridGet**
> List&lt;PetList&gt; petUseridGet(userid)

Obtener la lista de mascotas registradas del usuario

Obtener la lista de mascotas del usuario que ha iniciado sesión 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer userid = 56; // Integer | Referencia de usuario
    try {
      List<PetList> result = apiInstance.petUseridGet(userid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#petUseridGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **Integer**| Referencia de usuario |

### Return type

[**List&lt;PetList&gt;**](PetList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Lista de mascotas registradas |  -  |
**403** | No se pudo obtener la lista de mascotas |  -  |

<a name="petUseridPost"></a>
# **petUseridPost**
> petUseridPost(userid, petinfo)

Registrar nueva mascota

Enviar una solicitud de registro de mascota 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer userid = 56; // Integer | Referencia de usuario
    InlineObject2 petinfo = new InlineObject2(); // InlineObject2 | 
    try {
      apiInstance.petUseridPost(userid, petinfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#petUseridPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **Integer**| Referencia de usuario |
 **petinfo** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Solicitud de guardado exitosa |  -  |
**403** | No se pudo enviar la solicitud |  -  |

<a name="userGet"></a>
# **userGet**
> InfoProfile userGet(userlogin)

Obtener información usuario

Obtener la información del usuario que ha iniciado sesión 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject userlogin = new InlineObject(); // InlineObject | 
    try {
      InfoProfile result = apiInstance.userGet(userlogin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#userGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userlogin** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**InfoProfile**](InfoProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Información del perfil |  -  |
**400** | Solicitud invalida o usuario inexistente |  -  |

<a name="userPost"></a>
# **userPost**
> userPost(userinfo)

Registrar nuevo usuario

Enviar una solicitud de registro de usuario 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject1 userinfo = new InlineObject1(); // InlineObject1 | 
    try {
      apiInstance.userPost(userinfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#userPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userinfo** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Solicitud de guardado exitosa |  -  |
**403** | No se pudo enviar la solicitud |  -  |

