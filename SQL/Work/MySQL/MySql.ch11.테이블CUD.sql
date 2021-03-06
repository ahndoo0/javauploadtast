-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 테이블 CUD
-- 테이블 추가           : CREATE TABLE  테이블명                   ;
-- 테이블 변경           : ALTER  TABLE  테이블명                   ; 
-- 테이블 삭제           : DROP   TABLE  테이블명                   ;
-- 테이블 이름 바꾸기     :  Mysql : rename 
                           Oracle : rename  
-- 테이블 복제           :  Mysql : CREATE TABLE 새테이블명 AS SELECT * FROM 원본테이블;
                           Oracle : SELECT *  INTO 새테이블명 FROM 원본테이블;
-- 테이블 로우 제거      :  MySQL : 
--                      :  Oralce : TRUNCATE TABLE 테이블명                 ; // DELETE 보다 속도가 빠름.
--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2


--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 테이블 컬럼 CUD
-- 테이블 컬럼 추가      : ALTER  TABLE  테이블명 ADD          컬럼이름 컬럼타입 
-- 테이블 컬럼 삭제      : ALTER  TABLE  테이블명 DROP  COLUMN 컬럼이름 
-- 테이블 컬럼 변경 타입 : ALTER  TABLE  테이블명 ALTER COLUMN 컬럼이름 컬럼타입
-- 테이블 제약 변경 조건 : ALTER  TABLE  테이블명 ALTER COLUMN 컬럼이름 컬럼타입
-- 테이블 컬럼 변경 이름 : EXEC SP_RENAME '테이블이름.컬럼이름' , '새컬럼이름', 'COLUMN'
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept01 테이블을 삭제하시오.
drop table if exists dept01;

-- dept01 테이블을 추가하시오.
-- 컬럼에는 
-- ename     : 문자열
-- job       : 문자열
-- email     : 문자열 
-- address   : 문자열
-- sex       : F 또는 M  두개중에 한개만 저장될 수 있게.
-- phone     : 11자리~15자리
-- birthday  : 생일. 날짜만 저장.
-- birthtime : 생시. 시간만 저장.
-- age       : 정수. 999 까지만 저장가능하게. 
-- height    : 실수. 정수부분은 3자리, 소수부분은 2자리까지.
create table dept01(
     ename     nvarchar(10)
   , job       nvarchar(20)
   , email     nvarchar(50)
   , address   nvarchar(100)
   , sex       char(1) check(sex in ('F', 'M'))
   , phone     varchar(15)
   , birthday  date
   , birthtime time
   , age       int(3)
   , height    double(5, 2)
);
select * from dept01;

-- dept01 테이블을 삭제하시오.
drop table if exists dept01;



CREATE TABLE `dept01` (
	`ename` VARCHAR(10) NULL DEFAULT NULL,
	`job` VARCHAR(20) NULL DEFAULT NULL,
	`email` VARCHAR(50) NULL DEFAULT NULL,
	`address` VARCHAR(100) NULL DEFAULT NULL,
	`sex` CHAR(1) NULL DEFAULT NULL,
	`phone` VARCHAR(15) NULL DEFAULT NULL,
	`birthday` DATE NULL DEFAULT NULL,
	`birthtime` TIME NULL DEFAULT NULL,
	`age` INT(3) NULL DEFAULT NULL,
	`height` DOUBLE(5,2) NULL DEFAULT NULL
);

-- dept01 테이블을 수정하시오.
-- email 컬럼에 not null 을 설정하시오.
alter table dept01 MODIFY email varchar(50) not null;

show COLUMNS from dept01;

-- dept01 테이블에 insert를 이용하여 데이터를 입력하시오. 
-- ename: abc, 나머지 컬럼 값은 null로
INSERT into dept01(ename,email)
				VALUES('abc','');
				
select * from dept01;

-- 문제. dept01 테이블에 salary 컬럼을 추가하되
-- 타입은 숫자형으로 하고 정수 10자리와 소수점 3자리,
-- 그리고 not null 조건을 설정하시오.
alter table dept01 add salary double (13,3) not null;

show COLUMNS from dept01;

-- 문제. dept01 테이블의 address 컬럼 타입을 nvarchar(1000)으로 바꾸시오.
alter table dept01 modify address varchar(1000);
show COLUMNS from dept01;


-- 문제. dept01 테이블에서 birthtime 컬럼을 삭제하시오.
alter table dept01 drop birthtime;
show COLUMNS from dept01;

-- 테이블 이름 바꾸기
-- dept01 을 dept_new로 바꾸시오.
alter table dept01 rename dept_new;
show COLUMNS from dept_new;

-- 테이블 구조와 데이터를 복제
-- dept 테이블을 복제해서 dept02 테이블을 만드시오.
-- 테이블이 없는 경우에 테이블과 데이터를 복제 하는 방법
-- CREATE TABLE 새로만들테이블명 AS SELECT * FROM 복사할테이블명;

-- 테이블 구조만 복제
-- dept 테이블 구조를 복제해서 dept03 테이블을 만드시오.


-- 문제. dept 테이블에 auto_increment를 갖는 pid 컬럼 를 추가하시오.
-- primary key 삭제
-- pid 컬럼 추가.

-- 문제. dept 테이블을 복제해서 dept11 테이블을 만드시오.
-- 테이블 복제후 auto_increment 조건을 pid 컬럼에 설정하시오.

-- 문제. dept 테이블을 복제해서 dept12 테이블을 만드시오.
-- 테이블 복제후 auto_increment 조건을 pid 컬럼에 설정하시오.

-- 문제. dept11 테이블은 delete을 사용하여 데이터를 제거하시오.
-- delete   방식:  auto_increment 컬럼 초기화 안됨

-- 문제. dept12 테이블은 truncate을 사용하여 데이터를 제거하시오.
-- truncate 방식:  auto_increment 컬럼 초기화 됨





--########################
-- Database 목록 조회
--########################



--########################
-- 테이블 목록 조회 
--########################


--########################
-- 컬럼 목록 조회
--########################

