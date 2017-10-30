
-- ########################
-- ������ 2�� �̻��� ���̺��� ������ ��
-- inner join
-- left join
-- ########################

 
 -- emp ���̺� p ��� ��Ī �ο��Ͻÿ�.
 select *from emp ;
 select emp.* from emp ;
 
 select * from emp p;
 select p.* from emp p;
 -- emp ���̺� p ��� ��Ī �ο��ϰ� ename�� �̸�����, job �� �������� ����Ͻÿ�.
select ename �̸�,job ���� from emp p;
-- emp ���̺��� �̸�(enam)�� '�̹���'�� ����� ����Ͻÿ�.
select *from emp where ename ='�̹���';
-- dept ���̺��� deptno �� 10 �� �μ��� ����Ͻÿ�.
select deptno from dept where deptno =10;
-- ���������� �̿��ؼ� '�̹���'�� �����Ϳ� �μ����� �Բ� ����Ͻÿ�.

-- ���������� �̿��ؼ� '�̹���'�� ������ �μ��� �׸��� ��ġ�� ����Ͻÿ�.

-- ���������� �̿��ؼ� ���� �÷��� ǥ���� �� ���� �߻���.
-- �̷� ��쿡�� ������ �̿��Ͽ� ���� �ذ��� �����Ѵ�.


-- ������ �̿��ؼ� '�̹���'�� ������ �μ��� �׸��� ��ġ�� ����Ͻÿ�.
select * from emp inner join dept on emp.deptno=dept.deptno where ename ='�̹���'; 


-- @@@@@@@ 
-- inner join 
-- emp �� dept ���̺� inner join �ϱ�
-- @@@@@@@ 

-- ���� ������ �Ҽӵ� �μ����� ����Ͻÿ�.
  select emp.* , dept.deptno from emp join dept on emp.deptno =dept.deptno;
-- ���� SQL�� �����Ͻÿ�. 
-- dept ���̺� d��� ��Ī��, emp ���̺��� e��� ��Ī�� �ο��ϵ��� �����Ͻÿ�.
select * from dept d ,emp e where d.deptno = e.deptno;-- equi join��� 
-- @@@@@@@ 
-- equi join 
-- @@@@@@@ 
  
-- ���� SQL���� ���̺� ��Ī�� �ο��ϵ��� �����Ͻÿ�. 
-- dept --> d , emp-->e .
select * from dept d inner join emp e on d.deptno=e.deptno; -- inner join

-- @@@@@@@ 
-- left join
-- @@@@@@@ 

-- dept ���̺��� �������� emp ���̺��� �����͸� ��ġ�ÿ�.
select * from dept left join emp on dept.deptno=emp.deptno;
-- dept - emp �� �������� ���Ͻÿ�. 3���� ���
select * from dept left join emp on dept.deptno=emp.deptno where emp.empno is null;


-- @@@@@@@ 
-- right join 
-- @@@@@@@    

-- emp ���̺��� �������� dept ���̺��� �����͸� ��ġ�ÿ�.
select * from emp right join dept on dept.deptno=emp.deptno ;





-- ----------
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� left join ���ϱ�
-- ----------

-- left join �ϱ� : auth ���̺��� �������� book ���̺��� �����͸� ��ġ�ÿ�.
-- auth - book �� ������ 




-- ----------
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� right join ���ϱ�
-- ----------

-- right join : book ���̺��� �������� auth ���̺��� �����͸� ��ġ�ÿ�.
-- book - auth �� ������ 


   
-- ----------
-- full join = left join union right join
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� full join �ϱ�
-- oracle�� full join�� ������.
-- mysql�� full join�� �������� ����.
-- ----------



-- @@@@@@@ 
-- cross join
--    on ���� ����
-- @@@@@@@ 





-- @@@@@@@ 
-- self join :  �ڽſ��� �ڱ⸦ ������ �ϴ� ���
-- @@@@@@@ 

-- inner join�� �̿��Ͽ� ��� �Ŵ��� ã��. emp.mgr
select q.ename , q.empno , q.mgr ,e.ename,e.empno from emp q inner join emp e on q.mgr = e.empno;

-- equi self join�� �̿��Ͽ� ��� �Ŵ��� ã��
select ����.ename ,����.empno,����.mgr ,�Ŵ���.ename,�Ŵ���.empno from emp ���� , emp �Ŵ��� where ����.mgr = �Ŵ���.empno;

       
       
-- @@@@@@@@@@
-- �̼� 06. 
-- @@@@@@@@@@
-- 1. �渮�μ��� �ٹ��ϴ� ����� �̸��� �Ի����� ����Ͻÿ�. 3��. ��������
select deptno from dept where dname='�渮��';
select ename , hiredate from emp where deptno in(select deptno from dept where dname='�渮��');

select emp.ename , emp.hiredate from emp inner join dept on emp.deptno = dept.deptno where dept.dname = '�渮��';

-- 2. ��õ���� �ٹ��ϴ� ������(ename), �Ի���(hiredate), �޿�(sal) �׸��� �μ���(dname)�� ����ϴ� SQL���� �ۼ��Ͻÿ�. 3��. ����
select deptno from dept where loc='��õ';
select ename , hiredate , sal ,(select dname from dept where deptno=emp.deptno) dname from emp where deptno in(select deptno from dept where loc='��õ');

select emp.ename , emp.hiredate , emp.sal, dept.dname from emp inner join dept on emp.deptno = dept.deptno where dept.loc='��õ';

-- 3. ��õ���� �ٹ��ϴ� ������ ���� ����Ͻÿ�. 6��
select deptno from dept where loc='��õ';
select count(*) from emp where deptno in(select deptno from dept where loc='��õ');

select count(*) from emp inner join dept on emp.deptno = dept.deptno where dept.loc='��õ';

-- 4. ����(emp.job)�� ������ ������ �̸�(emp.ename), �μ���(dept.dname)�� ����Ͻÿ�. 3��
select ename,job,(select dname from dept where dept.DEPTNO= emp.DEPTNO) danme from emp where job ='����';

select emp.job , emp.ename ,dept.dname from emp inner join dept on emp.deptno =dept.deptno where emp.job='����';


-- 5. ���� ����� "���켺"�� �������� �̸�(ename),����(job)�� ����Ͻÿ�. 6��
select empno from emp where ename='���켺';
select * from emp where mgr  in(select empno from emp where ename='���켺');

select * from emp ���� inner join emp �Ŵ��� on ����.mgr = �Ŵ���.empno where �Ŵ���.ename ='���켺';

-- 6. "���켺"�� ���� �ٹ������� ���ϴ� ������ '���'�� ������ ����Ͻÿ�.4��
-- �������� ���
select a.deptno from emp a where a.ename='���켺';
select b.loc from dept b where b.deptno='30';
select c.deptno from dept c where c.loc='����';
select d.* from emp d where d.deptno in(30,31)and job='���' ;


select *       from emp 
where job='���' and deptno in (select deptno from dept 
																		where loc=(select loc from dept 
																								where deptno=(select deptno from emp 
																															where ename='���켺'))) ; 

-- ���ι��
select a.deptno from emp a where a.ename='���켺';
select b.loc from dept b where b.deptno='30';
select c.deptno from dept c where c.loc='����';
select d.* from emp d where d.deptno in(30,31)and job='���' ;

select d.* 
 from emp a inner join dept b on b.deptno = a.DEPTNO
                              inner join  dept c on c.loc =b.LOC
                                             	inner join emp d on d.deptno =c.DEPTNO 
	where a.ENAME = '���켺' and d.JOB='���';

-- 7. '�̹���'�� ������ ������ ���� ����� ����Ͻÿ�. 4��
select * from emp where ename='�̹���';
-- ����Ŀ�� 
select * from emp  where job in( select job from emp where ename='�̹���');
--����
select p.* from emp p inner join  emp e on p.job = e.job where e.ename='�̹���';

-- 8. �μ����� ���� �޿��� ���� �޴� ����� 
--    �����ȣ, ����̸�, �޿�, �μ���ȣ, �μ��� ����Ͻÿ�. 8��
select max(sal),deptno from emp group by deptno;

select empno , ename , sal , deptn from emp
where deptno in( deptno=10 and sal = 520) 
or( deptno=20 and sal = 1000)
or( deptno=21 and sal = 1000)
or( deptno=30 and sal = 500) 
or( deptno=31 and sal = 250)
or(deptno = 50 and sal is null);
-- 8.1 �������� ���

select empno , ename , sal , deptno ,(select dname from dept where dept.DEPTNO=emp.DEPTNO) dname from emp 
 where ( deptno,sal ) in ( select deptno, max(sal) from emp group by deptno ) ;


-- 8.2 join ���
select e.EMPNO,e.ENAME,e.SAL,e.DEPTNO,d.DNAME 
from emp e inner join dept d on e.DEPTNO=d.DEPTNO
where ( e.deptno,e.sal ) in ( select deptno, max(sal) from emp group by deptno ) ; 



-- 9. ����(job) ������ ���� �ִ� �μ��� �μ���ȣ�� �μ���, ��ġ 
--    �׸��� �� �μ��� ���� ������� ������ ����Ͻÿ�. 9��
select DISTINCT deptno from emp where job='����';
select * from dept where deptno in (10,30); 

-- 9.1 �������� ��� Mysql ,Oracel ���� �ȵ�

select dept.* , (select * from emp where emp.DEPTNO=dept.DEPTNO)
 from dept 
where deptno in(select DISTINCT deptno from emp where job='����');

-- 9.2 join���
select dept.*, emp.* from dept inner join emp on dept.DEPTNO=emp.DEPTNO 
where dept.deptno in(select DISTINCT deptno from emp where job='����');

-- 10. ���庸�� ���� �޿�(���� ���� ����)�� �޴� �������� �̸�, �μ���, ����, �޿��� ����ϵ�
--     ������ ������� ���ÿ�. 5�� or 7��


select max(sal) from emp where job ='����';
select * from emp where sal >500 and job != '����';

-- 9.1 �������� ���
select *,( select dname from dept where dept.DEPTNO=emp.deptno) 
from emp where sal>(select max(sal) from emp where job ='����') and job!='����';

-- 9.2 join���

select emp.* ,dept.DNAME
from emp inner join dept on emp.deptno = dept.DEPTNO
where emp.sal >(select max(sal)from emp a where a.job ='����')
and emp.job != '����';


-- 11. �μ����� ���庸�� ���� �޿�(���� ���� ����)�� �޴� ���� �μ��� �ٹ��ϴ� 
--     �������� �̸�, �μ���, ����, �޿��� ����ϵ� ������ ������� ���ÿ�. 1��

elect deptno,max(sal) from emp where job='����' group by deptno ;

select * from emp where (deptno = 10 and sal >500) or (deptno =30 and sal>500) and job !='����';

-- 9.1 �������� ���. ����


-- 9.2 join���
select emp.ename,emp.JOB,dept.DNAME,emp.SAL 
from emp  inner join dept on emp.DEPTNO = dept.DEPTNO
					inner join (select deptno , max(sal) sal from emp where job = '����' group by deptno) c
where emp.job !='����'
and (emp.DEPTNO =c.deptno and emp.sal>c.sal);

