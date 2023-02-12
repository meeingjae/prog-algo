# 12. 소수 찾기

-- -- 

### 문제 설명

1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

### 제한사항

* n은 2이상 1000000이하의 자연수입니다.

### 입출력 예

| n   | result |
|-----|--------|
| 10	 | 4      |
| 5	  | 3      |

### 입출력 예 설명

* 입출력 예 #1
    * 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

* 입출력 예 #2
    * 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

### 해결 방법
에라토스테네스의 체를 활용

소수가 되는 수의 배수들을 지우면 소수만 남는다는 개념

int 배열을 사용하여, 소수로 판명된 숫자를 0으로 초기화한 후

int 배열의 0이 아닌 값의 갯수를 모두 더해준다
