package hs.example.keycloak.oidc.infra.dto.element;

import lombok.Getter;

@Getter
public enum TreatCode {
    CHECK_COMMON_AREA("CHECK_COMMON_AREA", "Common Area를 확인하세요."),
    CHECK_ACCOUNT("UKHC0003", "존재하지 않는 계좌번호입니다. 계좌번호를 확인하시기 바랍니다."),
    REQUIRED_ACCOUNT_NO("UKHC0167", "계좌번호는 필수 입력 사항입니다."),
    REQUIRED_PRODUCT_CONTRACT_NTH("UKHC0430", "상품계약회차를 입력하신 후 거래하여 주십시오."),
    REQUIRED_PRODUCT_LARGE_CLASSIFICATION("UKHC0914", "상품대분류코드를 입력하세요."),
    REQUIRED_PRODUCT_MIDDLE_CLASSIFICATION("UKHC0933", "상품중분류코드를 입력하세요."),
    REQUIRED_PRODUCT_TEMPLATE("UKHCC972", "상품템플릿코드가 입력되지 않았습니다."),
    REQUIRED_PRODUCT_NO("UKHC2601", "상품번호를 입력하세요."),
    REQUIRED_BRANCH_INFO("UNHCAG01", "부점 정보가 없습니다. 부점 정보는 필수 항목입니다."),
    REQUIRED_EMPLOYEE_INFO("UNHCAG02", "직원 정보가 없습니다. 직원 정보는 필수 항목입니다."), // MEMO UKHCA907 유사
    REQUIRED_PRODUCT_CONDITION_INFO("UNHCAG03", "상품조건 정보가 없습니다. 상품조건은 필수 항목입니다."),
    CHECK_PRODUCT_CONDITION_CODE("UKHC2854", "상품조건코드를 확인후 거래하시기 바랍니다."),
    CHECK_PRODUCT_CONDITION_PATTERN("UKHC2859", "상품조건유형구분은 1(목록형), 2(범위형) 중의 하나를 입력하십시오."),
    CHECK_CATALOG_CONDITION_CODE("UKHC0626", "목록조건코드를 확인후 거래하십시오."),
    CHECK_RANGE_VALUE("UKHC2860", "범위값 혹은 측정단위를 입력하셔야 합니다."),
    CHECK_MEASUREMENT_UNIT_PATTERN("UKHC1945", "측정단위유형구분을 확인후 거래하십시오."),
    VALUE_IS_NUM("UKHA975", "관련금액에 정당한 숫자를 입력하시기 바랍니다."),
    PRODUCT_CONTRACT_NTH_IS_NUM("UKHCB108", "상품계약회차가 숫자가 아닙니다. 상품계약회차값은 0 이상의 숫자가 입력되어야 합니다."),
    CHECK_PRODUCT_IDENTIFIER_CODE("UKHC9394", "계좌상품식별구분 오류입니다. 확인 후 재거래 하십시오."),
    CHECK_SPARE_TRANSACTION_CODE("UKHC9424", "예비거래구분코드 입력 오류입니다. 확인 후 재입력 하십시오."),
    CHECK_CONTRACT_EMPLOYEE_RELATIONSHIP_CODE("UKHC7648", "상품계약직원관계구분코드를 확인하십시오."),
    CHECK_CONTRACT_EMPLOYEE_MODIFY_REASON_CODE("UKHC7649", "상품계약직원관계상태변경사유구분코드를 확인하십시오."),
    CHECK_CONTRACT_BRANCH_RELATIONSHIP_CODE("UKHC7650", "상품계약부점관계구분코드를 확인하십시오."),
    CHECK_CONTRACT_BRANCH_MODIFY_REASON_CODE("UKHC7651", "상품계약부점관계상태변경사유구분코드를 확인하십시오."),
    REQUIRED_PRODUCT_CONTRACT_STATUS_CODE("UKHC7906", "상품계약상태구분코드는 필수 입력 항목입니다."),
    CHECK_PRODUCT_CONTRACT_STATUS_CODE("UKHCQ160", "상품계약상태구분코드를 확인하십시오."),
    REQUIRED_PRODUCT_CONTRACT_STATUS_REASON_CODE("UKHC2662", "상품계약상태변경사유코드를 입력하여 주십시오."),
    CHECK_MEDIA_CLASSIFICATION_CODE("UKHC0899", "상품계약조건상태변경매체구분을 확인 후 거래하십시오."),
    ALREADY_EXISTS_ACCOUNT("UKHCP236", "등록하시는 계좌는 이미 존재하는 계좌입니다."),
    PRODUCT_BASIC_INFO_NOT_READ("UKHC4799", "상품계약상품기본원장 조회오류입니다."),
    PRODUCT_CONTRACT_STATUS_HIS_NOT_READ("UKHC3496", "상품계약상태이력 READ 오류입니다."),
    REQUIRED_RELATED_ACCOUNT_NO_CONTRACT_NTH("", "관련계좌계약회차를 입력하세요."),
    REQUIRED_RELATED_ACCOUNT_NO("UKHC0248", "관련계좌번호는 필수입력 사항입니다."),
    REQUIRED_CONTRACT_BETWEEN_RELATIONSHIP_DISTINCTION_CODE("UKHC7645", "상품계약간관계구분을 입력하세요."),
    REQUIRED_CONTRACT_BETWEEN_SERIAL_NUMBER("", "상품계약간일련번호를 입력하세요."),
    REQUIRED_CONTRACT_BETWEEN_STATUS_DISTINCTION_CODE("UKHC7646", "상품계약간상태구분을 입력하세요."),
    REQUIRED_AUTO_INSTALLMENT_DEPOSIT_LINKING_NUMBER_OF_TIMES("UKHCS550", "자동적금연결횟수를 입력하세요."),


    // CoreNext U Code
    RANGE_VALUE_IS_NUM("UNHCAG01", "범위값이 숫자가 아닙니다. 범위값은 0 이상의 숫자가 입력되어야 합니다."),
    CHECK_ACCOUNT_NUMBER_AND_PRODUCT_CONTRACT_NTH("UNHCAG02", "계좌번호 및 상품계약회차를 확인하세요."),
    REQUIRED_GROUP_CD("UKHC2213", "그룹회사코드는 필수 입니다."),
    REQUIRED_PTRN_TRAN_CD("UKHC3458", "거래유형구분코드를 확인해주세요."),
    REQUIRED_INQUIRE_DSTCD("UKHC1724", "조회구분은 1,2 만 가능합니다."),
    REQUIRED_PRODUCT("UKHC0938", "상품코드 입력해주세요."),
    CHECK_DATA("UKHC4442", "조회하고자 하는 일자의 금리가 존재하지 않습니다. 입력하신 조회일자를 확인하십시오"),
    CHECK_RANGE_DATE("UKHC1470", "종료년월일은 조회시작년월일보다 후일자여야 합니다."),
    BLANK("", "");
    private final String code;
    private final String message;

    TreatCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
