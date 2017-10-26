
-- ########################
-- 조인은 2개 이상의 테이블을 연결할 때
-- inner join
-- left join
-- ########################

 
 -- emp 테이블에 p 라는 별칭 부여하시오.
 select *from emp ;
 select emp.* from emp ;
 
 select * from emp p;
 select p.* from emp p;
 -- emp 테이블에 p 라는 별칭 부여하고 ename은 이름으로, job 은 직업으로 출력하시오.
select ename 이름,job 직업 from emp p;
-- emp 테이블에서 이름(enam)이 '이문세'인 사람을 출력하시오.
select *from emp where ename ='이문세';
-- dept 테이블에서 deptno 가 10 인 부서를 출력하시오.
select deptno from dept where deptno =10;
-- 서브쿼리를 이용해서 '이문세'의 데이터와 부서명을 함께 출력하시오.

-- 서브쿼리를 이용해서 '이문세'의 정보와 부서명 그리고 위치를 출력하시오.

-- 서브쿼리를 이용해서 여러 컬럼을 표시할 때 문제 발생됨.
-- 이런 경우에는 조인을 이용하여 쉽게 해결이 가능한다.


-- 조인을 이용해서 '이문세'의 정보와 부서명 그리고 위치를 출력하시오.
select * from emp inner join dept on emp.deptno=dept.deptno where ename ='이문세'; 


-- @@@@@@@ 
-- inner join 
-- emp 와 dept 테이블 inner join 하기
-- @@@@@@@ 

-- 직원 정보와 소속된 부서명을 출력하시오.
  select emp.* , dept.deptno from emp join dept on emp.deptno =dept.deptno;
-- 위의 SQL을 수정하시오. 
-- dept 테이블에 d라는 별칭을, emp 테이블에는 e라는 별칭을 부여하도록 수정하시오.
select * from dept d ,emp e where d.deptno = e.deptno;-- equi join방식 
-- @@@@@@@ 
-- equi join 
-- @@@@@@@ 
  
-- 위의 SQL에서 테이블에 별칭을 부여하도록 수정하시오. 
-- dept --> d , emp-->e .
select * from dept d inner join emp e on d.deptno=e.deptno; -- inner join

-- @@@@@@@ 
-- left join
-- @@@@@@@ 

-- dept 테이블을 기준으로 emp 테이블의 데이터를 합치시오.
select * from dept left join emp on dept.deptno=emp.deptno;
-- dept - emp 의 차집합을 구하시오. 3개의 출력
select * from dept left join emp on dept.deptno=emp.deptno where emp.empno is null;


-- @@@@@@@ 
-- right join 
-- @@@@@@@    

-- emp 테이블을 기준으로 dept 테이블의 데이터를 합치시오.
select * from emp right join dept on dept.deptno=emp.deptno ;





-- ----------
-- auth(부모테이블), book(자식테이블) 테이블에서 left join 구하기
-- ----------

-- left join 하기 : auth 테이블을 기준으로 book 테이블의 데이터를 합치시오.
-- auth - book 의 차집합 




-- ----------
-- auth(부모테이블), book(자식테이블) 테이블에서 right join 구하기
-- ----------

-- right join : book 테이블을 기준으로 auth 테이블의 데이터를 합치시오.
-- book - auth 의 차집합 


   
-- ----------
-- full join = left join union right join
-- auth(부모테이블), book(자식테이블) 테이블에서 full join 하기
-- oracle은 full join을 지원함.
-- mysql은 full join을 지원하지 않음.
-- ----------



-- @@@@@@@ 
-- cross join
--    on 절을 생략
-- @@@@@@@ 





-- @@@@@@@ 
-- self join :  자신에게 자기를 조인을 하는 방법
-- @@@@@@@ 

-- inner join을 이용하여 담당 매니저 찾기. emp.mgr
select q.ename , q.empno , q.mgr ,e.ename,e.empno from emp q inner join emp e on q.mgr = e.empno;

-- equi self join을 이용하여 담당 매니저 찾기
select 나의.ename ,나의.empno,나의.mgr ,매니저.ename,매니저.empno from emp 나의 , emp 매니저 where 나의.mgr = 매니저.empno;

       
       
-- @@@@@@@@@@
-- 미션 06. 
-- @@@@@@@@@@
-- 1. 경리부서에 근무하는 사원의 이름과 입사일을 출력하시오. 3개. 서브쿼리
select deptno from dept where dname='경리부';
select ename , hiredate from emp where deptno in(select deptno from dept where dname='경리부');

select emp.ename , emp.hiredate from emp inner join dept on emp.deptno = dept.deptno where dept.dname = '경리부';

-- 2. 인천에서 근무하는 직원명(ename), 입사일(hiredate), 급여(sal) 그리고 부서명(dname)을 출력하는 SQL문을 작성하시오. 3개. 조인
select deptno from dept where loc='인천';
select ename , hiredate , sal ,(select dname from dept where deptno=emp.deptno) dname from emp where deptno in(select deptno from dept where loc='인천');

select emp.ename , emp.hiredate , emp.sal, dept.dname from emp inner join dept on emp.deptno = dept.deptno where dept.loc='인천';

-- 3. 인천에서 근무하는 직원의 수를 출력하시오. 6개
select deptno from dept where loc='인천';
select count(*) from emp where deptno in(select deptno from dept where loc='인천');

select count(*) from emp inner join dept on emp.deptno = dept.deptno where dept.loc='인천';

-- 4. 직급(emp.job)이 과장인 직원의 이름(emp.ename), 부서명(dept.dname)을 출력하시오. 3개
select ename,job,(select dname from dept where dept.DEPTNO= emp.DEPTNO) danme from emp where job ='과장';

select emp.job , emp.ename ,dept.dname from emp inner join dept on emp.deptno =dept.deptno where emp.job='과장';


-- 5. 직속 상관이 "감우성"인 직원들의 이름(ename),직급(job)를 출력하시오. 6개
select empno from emp where ename='감우성';
select * from emp where mgr  in(select empno from emp where ename='감우성');

select * from emp 나의 inner join emp 매니저 on 나의.mgr = 매니저.empno where 매니저.ename ='감우성';

-- 6. "감우성"과 같은 근무지에서 일하는 직급이 '사원'인 직원만 출력하시오.4개
-- 서브쿼리 방식
select a.deptno from emp a where a.ename='감우성';
select b.loc from dept b where b.deptno='30';
select c.deptno from dept c where c.loc='용인';
select d.* from emp d where d.deptno in(30,31)and job='사원' ;


select *       from emp 
where job='사원' and deptno in (select deptno from dept 
																		where loc=(select loc from dept 
																								where deptno=(select deptno from emp 
																															where ename='감우성'))) ; 

-- 조인방식
select a.deptno from emp a where a.ename='감우성';
select b.loc from dept b where b.deptno='30';
select c.deptno from dept c where c.loc='용인';
select d.* from emp d where d.deptno in(30,31)and job='사원' ;

select d.* 
 from emp a inner join dept b on b.deptno = a.DEPTNO
                              inner join  dept c on c.loc =b.LOC
                                             	inner join emp d on d.deptno =c.DEPTNO 
	where a.ENAME = '감우성' and d.JOB='사원';

-- 7. '이문세'와 동일한 직급을 가진 사원을 출력하시오. 4개
select * from emp where ename='이문세';
-- 서브커리 
select * from emp  where job in( select job from emp where ename='이문세');
--조인
select p.* from emp p inner join  emp e on p.job = e.job where e.ename='이문세';

-- 8. 부서별로 가장 급여를 많이 받는 사원의 
--    사원번호, 사원이름, 급여, 부서번호, 부서명를 출력하시오. 8개

-- 8.1 서브쿼리 방식



-- 8.2 join 방식




-- 9. 직급(job) 과장이 속해 있는 부서의 부서번호와 부서명, 위치 
--    그리고 그 부서에 속한 사원들의 정보를 출력하시오. 9개



-- 10. 과장보다 많은 급여(같은 것은 제외)를 받는 직원들의 이름, 부서명, 직급, 급여를 출력하되
--     과장은 출력하지 마시오. 5개 or 7개


-- 11. 부서별로 과장보다 많은 급여(같은 것은 제외)를 받는 같은 부서에 근무하는 
--     직원들의 이름, 부서명, 직급, 급여를 출력하되 과장은 출력하지 마시오. 1개

