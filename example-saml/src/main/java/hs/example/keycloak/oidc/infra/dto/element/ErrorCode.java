package hs.example.keycloak.oidc.infra.dto.element;

import lombok.Getter;

@Getter
public enum ErrorCode {
    COMMON_AREA_PARSING_ERROR("INVALID_COMMON_AREA", "Common Area Parsing 중 오류가 발생했습니다."),
    COMMON_AREA_NULL("COMMON_AREA_NULL", "Common Area가 존재하지 않습니다."),
    PRODUCT_BASIC_INFO_NOT_FOUND("B1000320", "해당 계좌번호를 상품계약/상품기본원장에서 찾을 수 없습니다."),
    PRODUCT_CONTRACT_STATUS_HIS_NOT_FOUND("B1000321", "해당 계좌번호를 상품계약상태이력원장에서 찾을 수 없습니다."),
    CONTRACT_BRANCH_RELATIONSHIP_NOT_FOUND("B1000337", "해당 계좌번호를 상품계약/부점원장에서 찾을 수 없습니다."),
    CONTRACT_EMPLOYEE_RELATIONSHIP_NOT_FOUND("B1000338", "해당 계좌번호를 상품계약/직원원장에서 찾을 수 없습니다."),
    PRODUCT_CONTRACT_CONDITION_NOT_FOUND("B1000324", "해당 계좌번호를 상품계약조건원장에서 찾을 수 없습니다."),

    CUSTOMER_NOT_FOUND("B0900015", "존재하지 않는 고객입니다."),
    ALREADY_EXISTS_CUSTOMER("B0900179", "이미 등록되어 있습니다."),
    ACCOUNT_NOT_FOUND("B4000210", "존재하지 않는 계좌입니다."),
    ALREADY_EXISTS_ACCOUNT("B1000011", "이미 등록된 계좌번호입니다."),
    REQUIRED_ARGUMENT("B3800004", "필수항목 오류입니다."),
    INVALID_INPUT("B4600533", "입력데이터 오류입니다."),
    PRODUCT_CONTRACT_NTH_ERROR("B2500045", "상품계약회차 오류입니다."),
    PRODUCT_CONDITION_ERROR("B3000354", "조건코드 오류입니다."),
    MEDIA_CLASSIFICATION_CODE_ERROR("B3000210", "상품계약 조건상태변경매체구분 오류입니다."),
    PRODUCT_CONDITION_PATTERN_ERROR("B3002645", "상품조건유형구분 오류입니다."),
    CATALOG_CONDITION_CODE_ERROR("B3000170", "목록조건코드 오류입니다."),
    RANGE_VALUE_ERROR("B0100101", "범위값 오류입니다."),
    MEASUREMENT_UNIT_PATTERN_ERROR("B3000385  ", "측정단위유형구분 오류입니다."),
    INVALID_INSTANCE("B3600010", "인스턴스코드 오류입니다."),

    BAD_REQUEST("BAD_REQUEST", "잘못된 요청입니다."),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "서버에서 예기치 않은 오류가 발생하여 요청을 처리할 수 없습니다"),
    INVALID_ARGUMENT("INVALID_ARGUMENT", "잘못된 Value 요청입니다."),
    INVALID_GROUP_CD("B3600003", "그룹회사코드 오류입니다."),
    INVALID_PTRN_TRAN_CD("B3600493", "거래유형구분 오류입니다."),
    INVALID_PRODUCT("B3600028", "상품코드 오류입니다."),
    INVALID_ACNO("B0100002", "계좌번호 오류입니다."),
    INVALID_INQUIRE_DATE("B2700073", "조회일자 오류입니다."),
    NOT_FOUND_DATA("B4200223", "데이터를 검색할 수 없습니다."),
    INVALID_INQUIRE_DSTCD_ERROR("B3600074", "조회구분 오류입니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
