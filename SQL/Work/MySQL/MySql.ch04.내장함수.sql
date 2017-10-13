-- @@@@@@@@@@
-- from 절 테이블 생략 여부
-- MySql  : from절 테이블 생략 가능
-- Oracle : from절 테이블 생략 불가. dual 테이블 사용.
--          dual 테이블은 oracle에만 있는 1행1열의 테이블이다.
--          dual 테이블은 단순 계산이나 연산을 위해서 사용된다.
-- MsSql  : 테이블 생략 가능
-- @@@@@@@@@@

-- 24*35의 계산 결과를 출력하시오.
select 24*35;
-- 현재 날짜와 시간을 출력하시오
select now();
-- 현재 날짜만 출력하시오
select curdate();
-- 현재  시간만 출력하시오
select curtime();

-- @@@@@@@@@@
-- 숫자 관련 함수
-- @@@@@@@@@@

-- 2356.2578의 정수값 구하기: floor
select floor(2356.2578);

-- round: 2356.2578의 반올림: round
--  round를 이용하여 2356.2578 에서 정수만 출력하시오.
select round(2356.2578,0);
 
--  round를 이용하여 2356.2578의 정수 두번쨰 자리에서 반올림하여 출력하시오.
select round(2356.2578,-2);

--  round를 이용하여 2356.2578의 소수 세번쨰 자리에서  두번쨰 자리에서 반올림하여 출력하시오.
select round(2356.2578, +2);

-- 버림: 
-- Mysql : truncate 
-- oracle: trunc

-- truncate(trunc) 를 이용하여 2356.2578 에서 정수만 출력하시오.
select truncate(2356.2578,0);
-- truncate(trunc) 를 이용하여 2356.2578의 정수 두번쨰 자리에서 버리시오.
select truncate(2356.2578, -2);
-- truncate(trunc) 를 이용하여 2356.2578의 소수 세번쨰 자리에서  두번쨰 자리에서 버리시오.
select truncate(2356.2578,+2);

-- 나머지 구하기: mod 
--  mod 를 이용하여 2356을 3으로 나눈 나머지만 출력하시오.
select mod(2356,3);
select mod(2356.2578,3);


-- @@@@@@@@@@
-- 문자 관련 함수 
-- @@@@@@@@@@

-- 대문자 변환 : upper()
select upper('abcdㄴㄴㄴ');
-- 소문자 변환 : lower()
select lower('ABCD ㄴㄴㄴ');
-- 문자 길이 구하기. length(). 한글은 2byte, 영문자는 1byte
select length('abc가나다');-- 영어와한글이 섞이면 모두2byte
select length('swkd');     -- 영어만 잇을때는 1byte
select length('가나다');   -- 한글만 있을떄는 2byte
select length('!@#');      -- 기호는 1byte

-- 문자열 추출. 
-- MySQL  : substring
-- Oracle : substr
select substring('abcdefghoj',4,4 );
select substring('abcdefghoj',4   );
select substring('abcdefghoj',-5  );
select substring('abcdefghoj',-5,3);

-- 왼쪽에 기호 채우기. lpad
select lpad('1234',10,'*');
select lpad('1234',10,'1');
select lpad('1234',10, 1 );
-- 오른쪽에 기호 채우기. rpad
select rpad('1234',10,'*');
select rpad('1234',10,'1');
select rpad('1234',10, 1 );
-- 문자열 바꾸기. replace
select replace ('abcdefghoj','de','  ');
select 'abcdefghoj', replace ('abcdefghoj','de','  ');

where
-- @@@@@@@@@@
-- 날짜 관련 함수 
-- MySQL  : now()   , date_format(), date_add(), date_sub()
-- Oracle : sysdate, systimestamp
-- @@@@@@@@@@

-- 현재 날짜와 시간을 출력하시오

-- 현재 날짜를 출력하시오

-- 현재  시간을 출력하시오

-- 현재 날짜를 'YYYY/MM/DD' 포맷으로 출력하시오

-- 현재 날짜를 'YYYY-MM-DD' 포맷으로 출력하시오



-- 현재 시간를 'hh:mm:ss' 포맷으로 출력하시오


-- 이번달의 첫째날 요일 구하기

-- 오늘은 이번달의 몇 주차인가?

-- 지금부터 '2014-01-01'까지의 개월 수 구하기

-- 오늘 날짜에 6개월 추가하기

-- 오늘 날짜에 -6개월 추가하기

-- 지금부터 가장 가까운 수요일은 몇일후 인가?

-- 지금부터 가장 가까운 수요일은 몇일인가?

-- 해당 월의 마지막 일을 구하기








-- @@@@@@@@@@
-- 형변환 함수 
-- MySQL : convert() : date <--> character <--> number
-- Oracle : to_char, to_date, to_number
-- @@@@@@@@@@

-- 현재일자를 문자열로 변환 : YYYY, MM, DD

-- 현재시간을 문자열로 변환

-- 통화 기호 붙이기.
-- MySql  : 안됨.
-- Oracle : 가능


-- 문자를 날짜로 변환. 변환 후 DATE 포맷이 된다.

-- 문자를 숫자로 변환

-- 문자를 숫자로 변환시 숫자의 포맷 지정하기


-- 문자를 숫자로 변환: 20,000,000.73797874857848 을 숫자로 바꾸시오.



-- @@@@@@@@@@
-- 윤달 테이블 만들기
-- @@@@@@@@@@


-- @@@@@@@@@@
-- NULL을 처리하는 함수 : ifnull()
-- @@@@@@@@@@

-- ifnull 사용법



-- @@@@@@@@@@
-- 선택 함수 : CASE 문. 자바의 연속if 와 유사
-- CASE WHEN ELSE 
-- @@@@@@@@@@ 


-- CASE WHEN ELSE
 




-- @@@@@@@@@@@@@@
-- 미션
-- @@@@@@@@@@@@@@
-- 미션 1. substring 함수를 사용하여 9월에 입사한 사원을 출력하기. 1개


-- 미션 2. SUBSTR 함수를 이용하여 2003년도에 입사한 사원을 검색하기. 2개

-- 미션 3. 이름(ename)이 '기'로 끝나는 사원을 검색하시오. 2개


-- 미션 4. 이름의 두 번째 글자에 '동'이 있는 사원을 검색하기. 2개


-- 미션 5. 직급(job)에 따라 직급에 따라 급여를 인상하시오.
-- '부장'인 사원은 5% 인상 
-- '과장'인 사원은 10% 인상
-- '대리'인 사원은 15% 인상 
-- '사원'인 사원은 20% 인상


-- 미션 6. 입사일을 연도는 2자리(YY), 
--         월은 숫자로 표시하고 
--         요일은 약어(DY)로 출력하시오.
-- 구글 검색을 이용 


