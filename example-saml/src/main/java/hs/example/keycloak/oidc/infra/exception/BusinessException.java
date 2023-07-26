package hs.example.keycloak.oidc.infra.exception;

import hs.example.keycloak.oidc.infra.dto.element.ErrorCode;
import hs.example.keycloak.oidc.infra.dto.element.TreatCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
  private final ErrorCode errorCode;
  private final TreatCode treatCode;
  private final String customMessage;

  public BusinessException(ErrorCode errorCode, TreatCode treatCode, String customMessage) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
    this.treatCode = treatCode;
    this.customMessage = customMessage;
  }

  public BusinessException(ErrorCode errorCode, TreatCode treatCode) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
    this.treatCode = treatCode;
    this.customMessage = "";
  }

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
    this.treatCode = TreatCode.BLANK;
    this.customMessage = "";
  }
}
