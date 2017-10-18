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
select now();
select now(),ename, empno from emp;
-- 현재 날짜를 출력하시오
select curdate();
-- 현재  시간을 출력하시오
select curtime();


select now(), date_format(now(),'%Y');
select now(), date_format(now(),'%y');
select now(), date_format(now(),'%M');
select now(), date_format(now(),'%m');
select now(), date_format(now(),'%D');
select now(), date_format(now(),'%d');

-- 현재 날짜를 'YYYY/MM/DD' 포맷으로 출력하시오

select now(), date_format(now(),'%Y/%m/%d');

-- 문제 emp 테이블에서  ename (이름)hiredata(입사일) 컬럼을 'yy/mm/dd' 포멧하시오.

select ename ,date_format(hiredate,'%y/%m/%d')from emp ;


-- 현재 날짜를 'YYYY-MM-DD' 포맷으로 출력하시오

select hiredate, date_format(hiredate, '%Y-%m-%d') from emp;



select now(), date_format (now(), '%H');
select now(), date_format (now(), '%h');
select now(), date_format (now(), '%i');
select now(), date_format (now(), '%s');
select now(), date_format (now(), '%T');

-- 현재 시간를 'hh:mm:ss' 포맷으로 출력하시오
select now(), curtime(), date_format(now(), '%H:%i:%s'), date_format(curtime(),'%H:%i:%s');
select now(), date_format (now(), '%T');

-- 이번달의 첫째날  구하기.  일반화
select now(),concat(date_format(now(),'%Y-%m'),'-01');
-- 이번달의 첫째날 요일 구하기.  
select '2017-10-01', date_format('2017-10-01','%a');
-- 이번달의 첫째날 요일 구하기.  일반화
select concat(date_format(now(),'%Y-%m'),'-01')
      ,date_format(concat( date_format(now(),'%Y-%m'),'-01'),'%a');
      
      
-- 문제 emp테이블에서 입사일 (hiredate)과 입사일의 요일을 출력하시오. 
select hiredate,date_format(hiredate,'%a') from emp;      


-- 문제 emp테이블에서 입사일(hiredate) 과 입사할 달의 마지막 일을 출력하되도록 하시오.last_day()

select hiredate , last_day(hiredate) from emp;


-- 지금부터 '2014-01-01'까지의 개월 수 차이 구하기 timestampdiff()

select now() , '2014-01-01' , timestampdiff (MONTH,'2014-01-01',now());

-- 지금부터 '2014-01-01'까지의 년수 차이 구하기 timestmapdff()

select now() , '2014-01-01' , timestampdiff (YEAR,now(),'2014-01-01');


-- 문제 지금부터 '2014-01-01'까지의 일수를 계산하시오.
select now() , '2014-01-01' , timestampdiff (day,now(),'2014-01-01');




-- 오늘 날짜에 6개월 후를  계산하기
select now(), date_add(now(), INTERVAL 6 MONTH);

-- 오늘 날짜에 -6개월 전을  계산하기
select now(), date_add(now(), INTERVAL -6 MONTH);

-- 오늘 날짜에 17년 후는 ?
select now(), date_add(now(), INTERVAL 17 YEAR);



-- 오늘은 이번달의 몇 주차인가?

select now(), dayofweek( now() );





-- 해당월의 마지막 일을 구하기 last_day()
  
select curdate(), last_day(curdate());





-- @@@@@@@@@@
-- 형변환 함수 
-- SQL데이터 타입:  날짜(date) <--> 뮨자(character) <--> 숫자(number)
-- MySQL : convert() : 
-- Oracle : to_char, to_date, to_number
-- @@@@@@@@@@

-- 현재일자를 문자열로 변환 : YYYY, MM, DD 날짜 --> 문자로 바꾸는것
select now(), convert(now(), nchar(4) );
select now(), convert(now(), nchar(7) );
select now(), convert(now(), nchar(10) );

-- 현재시간을 문자열로 변환 hh:mm, hh:mm:ss 날짜 --> 문자
select curtime(), convert(curtime() , char(5));
select curtime(), convert(curtime() , char(8));





-- 문자를 날짜로 변환. 문자--> 날짜 변환 후 DATE 포맷이 된다.
select '2017-10-16', convert('2017-10-16', DATE);
select '17:10:15' , convert('17:10:15' , TIME);
select '2017-10-16 17:10:15' , convert('2017-10-16 17:10:15' , DATETIME);


-- 문자를 숫자로 변환
select '-120' , convert('-120' , SIGNED);
select '120' , convert('120' , UNSIGNED);
select '120.124' , convert('120.124' ,DECIMAL(10,0 ));
select '120.124' , convert('120.124' ,DECIMAL(10,5) );
select '120.124' , convert('120.124' ,DECIMAL(10,3) );
select '120.124' , convert('120.124' ,DECIMAL(7,5) );
select '120.124' , convert('120.124' ,DECIMAL(8,5) );

-- 문자를 숫자로 변환시 숫자의 포맷 지정하기


-- 문제.  문자를 숫자로 변환: 20,000,000.73797874857848 을 DECIMAL을 이용하여  숫자로 바꾸시오.

select '20,000,000.73797874857848' , convert( replace ('20,000,000.73797874857848', ',',''),DECIMAL(22, 14));


set @aaa :='20,000,000.73797874857848';
set @bbb :=replace('20,000,000.73797874857848',',','');
set @ccc := length (@bbb)-1;
select @aaa,@bbb,@ccc,convert(@bbb,DECIMAL(22,12)); 


-- 통화 기호 붙이기.
-- MySql  : 안됨.
-- Oracle : 가능



-- @@@@@@@@@@
-- NULL을 처리하는 함수 
-- mysql : ifnull() ,  if()
-- Oracle : nvl()
-- @@@@@@@@@@

-- ifnull 사용법

select ifnull(null , 1);
select ifnull(0    , 1);
select ifnull('0'  , 1);

-- @@@@@@@@@@
-- 선택 함수 : CASE 문. 자바의 연속if 와 유사
-- CASE WHEN ELSE 
-- @@@@@@@@@@ 


-- CASE WHEN  , ELSE 문
select ename , deptno, 

case when deptno=10 then'경리부'
when deptno=20 then'인사과'
when deptno=30 then'영업부'
when deptno=40 then'전산부'
else '나머지부'

end from emp ;

-- 지금부터 가장 가까운 수요일은 몇일후 인가? case when then else
-- 자바 에서의 표현 
-- if( dayofweek( now())>=4){
--  4-dayofweek(now())
-- }
-- else{
-- 4+(7-dayofweek(now()))
-- }

select now()
, dayofweek(now())
, case when dayofweek(now())<=4 then 4-dayofweek(now())
else 4+(7-dayofweek(now()))
end as '일수';


select now() ,dayofweek(now()) ,4-dayofweek(now()); -- 수요일 이전인 경우
select now() ,dayofweek(now()) ,4 +(7-dayofweek(now()));-- 수요일 초과인 경우


-- 지금부터 가장 가까운 수요일은 몇일인가?




-- @@@@@@@@@@@@@@
-- 미션
-- @@@@@@@@@@@@@@
-- 미션 1. substring 함수를 사용하여 9월에 입사한 사원을 출력하기. 1개
select * from emp where substring(hiredate,6,2) ='09';

-- 미션 2. SUBSTR 함수를 이용하여 2003년도에 입사한 사원을 검색하기. 2개
select * from emp where substring(hiredate,1,4)='2003';

-- 미션 3. 이름(ename)이 '기'로 끝나는 사원을 검색하시오. 2개
select * from emp where ename like '__기';

-- 미션 4. 이름의 두 번째 글자에 '동'이 있는 사원을 검색하기. 2개
select * from emp where ename like '%동%';

-- 미션 5. 직급(job)에 따라 직급에 따라 급여를 인상하시오.
-- '부장'인 사원은 5% 인상 
-- '과장'인 사원은 10% 인상
-- '대리'인 사원은 15% 인상 
-- '사원'인 사원은 20% 인상
select *, sal * case
when job='부장' then 1.05 
when job='과장' then 1.1
when job='대리' then 1.15
when job='사원' then 1.2
else sal
end '인상된 급여'from emp ;



-- 미션 6. 입사일을 연도는 2자리(YY), 
--         월은 숫자로 표시하고 
--         요일은 약어(DY)로 출력하시오.
-- 구글 검색을 이용 


