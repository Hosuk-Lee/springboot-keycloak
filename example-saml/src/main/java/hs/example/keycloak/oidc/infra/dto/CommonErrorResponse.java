package hs.example.keycloak.oidc.infra.dto;

import hs.example.keycloak.oidc.infra.exception.BusinessException;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonErrorResponse {

  private String errorCode;
  private String errorMessage; //임시
  private String treatCode;
  private String treatMessage; //임시
  private String customMessage;
  private String path;
  private String errorStackTrace;

  public static CommonErrorResponse createErrorResponse(BusinessException exception,
          HttpServletRequest request) {
    return CommonErrorResponse.builder()
            .errorCode(exception.getErrorCode().getCode())
            .errorMessage(exception.getErrorCode().getMessage())
            .treatCode(exception.getTreatCode().getCode())
            .treatMessage(exception.getTreatCode().getMessage())
            .customMessage(exception.getCustomMessage())
            .path(request.getRequestURI())
            .errorStackTrace(Arrays.toString(exception.getStackTrace()))
            .build();
  }

//  public static CommonErrorResponse createErrorResponse(Exception exception,
//          HttpServletRequest request, ErrorCode errorCode) {
//    return CommonErrorResponse.builder()
//            .errorCode(errorCode.getCode())
//            .treatCode("")
//            .customMessage(exception.getMessage())
//            .path(request.getRequestURI())
//            .errorStackTrace(Arrays.toString(exception.getStackTrace()))
//            .build();
//  }
}
