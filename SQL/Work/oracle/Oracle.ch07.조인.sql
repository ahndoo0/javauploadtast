
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

-- 8.1 �������� ���



-- 8.2 join ���




-- 9. ����(job) ������ ���� �ִ� �μ��� �μ���ȣ�� �μ���, ��ġ 
--    �׸��� �� �μ��� ���� ������� ������ ����Ͻÿ�. 9��



-- 10. ���庸�� ���� �޿�(���� ���� ����)�� �޴� �������� �̸�, �μ���, ����, �޿��� ����ϵ�
--     ������ ������� ���ÿ�. 5�� or 7��


-- 11. �μ����� ���庸�� ���� �޿�(���� ���� ����)�� �޴� ���� �μ��� �ٹ��ϴ� 
--     �������� �̸�, �μ���, ����, �޿��� ����ϵ� ������ ������� ���ÿ�. 1��

