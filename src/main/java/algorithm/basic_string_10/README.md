# 문자열 다루기 기본

-- -- 

### 문제 설명

문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

### 제한사항

* s는 길이 1 이상, 길이 8 이하인 문자열입니다.
* s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

### 입출력 예

| s     | return |
|-------|--------|
| "a234 | false  | 
| "1234 | true   |

### 해결 방법

true를 반환해야 하는 조건을 상수로 명시하고, 참/거짓 값을 다루는 변수를 하나 만들어, 절차적으로 처리한다
모든 문자가 숫자로 구성되어 있는지는 `Character` 클래스의 `isDisit()` 메서드를 활용한다