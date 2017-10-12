

-- SQL ���� ���ڿ� ������ ����
-- ����: ������ ����
-- ����: ���� ����


-- SQL ���� Null �̶�?

       


-- ########################
-- select ����
-- 
-- select *
--   from ���̺��;
--
-- select �÷�1, �÷�2, �÷�3
--   from ���̺��;
-- ########################


-- DEPT ���̺��� ��� �÷��� �����͸� ��ȸ�Ͻÿ�.
select * from dept;

-- DEPT ���̺���  deptno, dname �÷��� �����͸� ����Ͻÿ�.
select deptno, dname from dept;

-- EMP ���̺��� JOB, ENAME �÷��� ����Ͻÿ�.
select job , ename from emp;

-- EMP ���̺��� ��� �÷��� �����͸� ����Ͻÿ�.
select * from emp;


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �÷��� ��Ī(����) �ֱ�
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- AS�� �÷��� ��Ī �ο��ϱ�. job �÷����� ��å�� , enname �÷��� �̸��̶�� ��Ī�� �ٿ� ����Ͻÿ�.
select  job as ��å,  ename as �̸� from emp;

-- AS���� �÷��� ��Ī �ο��ϱ�. job �÷����� ��å�� , enname �÷��� �̸��̶�� ��Ī�� �ٿ� ����Ͻÿ�.
select job ��å, ename �̸� from emp;
-- '' �� ��Ī �ο��ϱ�. job �÷�����  "aa//aa"�� , enname �÷����� "nick -+name" �̶�� ��Ī�� �ٿ� ����Ͻÿ�.
select job "aa//aa" , ename "nick -+name" from emp;


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- null ó���� ���ؼ��� ifnull() �Լ��� ����ؾ� �Ѵ�
-- @@@@@@@@@@@@@@@@@@@@@@@@
  
-- emp ���̺��� �̸��� mgr ���� ����Ͻÿ�. 
select ename,mgr from emp;
-- ��, mgr�� null �̸� 0���� �ٲپ� ����Ͻÿ�.

select ename, nvl(mgr ,0) from emp;

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �ߺ� ���� - DISTINCT
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- �ߺ��Ǵ� ename �� �����ϰ� ename �� ����Ͻÿ�. 18��
select distinct ename from emp;


-- emp ���̺��� deptno ���� �ߺ��Ǵ� ���� �����Ͽ� ����Ͻÿ�. 17��
select distinct deptno from emp;

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �÷� ����,  ���ڿ� ����  
--  concat( �÷�1  , �÷�2  ) 
--  concat( �÷�1  , �÷�2 , �÷�3, �÷�4   ) 
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- ���� ��ȸ�ϱ�
select ename,job from emp where ename ='����';
-- '������ ������ �����Դϴ�' ����ϱ�
-- ����Ŭ ������ , ��� || �λ���Ѵ� .ename|| '�� ������ '|| job|| '�Դϴ�'
select  ename ||'�������� '||job||'�Դϴ�'  from emp where ename ='����';

-- '������ ������ �����Դϴ�' ����ϴ� �÷��̸��� '����'���� ����Ͻÿ�
select ename||'��������' ||job||'�Դϴ�.' as ���� from emp where ename='����';
-- ########################
-- where ����
-- 
-- select �÷�1, �÷�2, �÷�3
--   from ���̺��
--  where ����
-- ########################

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- ��������ڸ� �̿��� ���� �˻�
-- =, > , >=, <, <=, !=
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- emp ���̺��� sal�� 500���� ũ�ų� ���� ��츸 ����Ͻÿ�
  select *from emp where sal <=500;
-- emp ���̺��� deptno �� 10 �ΰ�츸 ����Ͻÿ�.
 select *from emp where deptno =10;
 
-- ��������( != )
-- deptno �� 10 �� �ƴ� ����� ����Ͻÿ�.
 select * from emp where deptno !=10;
 
-- ����1.
-- ename �� '�̹���'�� ��츸 ���
select *from emp where ename ='�̹���';
-- ����2.
-- ename �� '�̹���'�� �ƴ� ��츸 ���
select * from emp where ename!='�̹���';

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �������ڸ� �̿��� ���� �˻� 
-- and, or, not( !=, <> )
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- deptno �� 10 �� ����� ����Ͻÿ�
select * from emp where deptno =10;
-- job�� ������ ����� ����Ͻÿ�
select * from emp where job='����';

-- deptno �� 10  �̰�(and) job�� ������ ����� ����Ͻÿ�. ������
select *from emp where deptno =10 and job ='����';

-- deptno �� 10  �̰ų�(or) job�� ������ ����� ����Ͻÿ�. ������
select *from emp where deptno =10 or job ='����';



-- ����. ��������ڸ� �̿��ؼ� 
-- sal ���� 400���� ũ�ų� ���� �׸���(and) 
-- sal ���� 500���� �۰ų� ���� ������ ����Ͻÿ�. 5��
select * from emp where sal >=400 and sal<=500 ;

-- ����. ��������ڸ� �̿��ؼ� 
-- sal ���� 400���� �۰ų� ���� �Ǵ�(or) 
-- sal ���� 500���� ũ�ų� ���� ������ ����Ͻÿ�. 16��
select *from emp where sal<=400 or sal >=500 ;


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- between A and B �� �̿��� ���� �˻� 
-- @@@@@@@@@@@@@@@@@@@@@@@@


-- ����. sal ���� 400���� ũ�ų� ���� �׸���(and) 
-- sal ���� 500���� �۰ų� ���� ������ ����Ͻÿ�
select * from emp where sal >= 400 and sal <=500 ;

-- ���1. ��� �����ڸ� �̿��ϴ� ���5��
select * from emp where sal between 400 and 500;
-- ���2. between A and B �� �̿��ϴ� ���



-- ����. �Ի���(hiredate)�� 2005/01/01 ������ ����鸸 ����Ͻÿ�
select * from emp where hiredate <'2005/01/01';


-- ����. �Ի���(hiredate)�� 2005/01/01 ����  
-- 2012/12/31 ���� �Ի��� ����鸸 ����Ͻÿ�
-- ���1. �� �����ڸ� �̿��ϴ� ���
select *from emp where hiredate >='2005.01.01' and hiredate<='2012.12.31' ;

-- ���2. between A and B �� �̿��ؼ� 
select * from emp where  hiredate between '2005.01.01'and'2012.12.31';


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- like�� �̿��� ���� �˻�
-- ���ϵ�ī��: % , _
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- �̸�(ename)�� '��'�� �����ϴ� ������ ����Ͻÿ�. 4��
select *from emp where ename like '��%';
-- �̸�(ename)�� '��'�� ������ ������ ����Ͻÿ�. 0��
select * from emp where ename like '%��';
-- �̸�(ename)�� '��'�� �� �ִ� ������ ����Ͻÿ�. 4��
select *from emp where ename like '%��%';

-- ����. �̸�(ename)�� '��'�ڰ� ���� ������ ����Ͻÿ�. 3��
select *from emp where ename like '%��%';
-- ����. �̸�(ename)�� '��'�ڰ� ���� �ʴ� ������ ����Ͻÿ�. 15��
select *from emp where ename not like  '%��%';


-- ���ϵ� ī�� "_"�� ����Ͽ� "�ȼ���" ���
select *from emp where ename like '��__';

-- ���ϵ� ī�� "_"�� ����Ͽ� "���켺", "���μ�" ����Ͻÿ�.
select *from emp where ename like '__��';

-- ����
-- LIKE 'a%'	: 
-- LIKE '%a'	: 
-- LIKE '%or%'	: 
-- LIKE '_r%'	: 1r, 1ra, 2rr
-- LIKE 'a_%_%' : 
-- LIKE 'a%o'	: 


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- in , not in
-- in      ����. or  ������ ���� ǥ��
-- not in  ����.
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- or ��������
-- comm�� 80 �̰ų� 100 �̰ų� 200�� ����� ����Ͻÿ�. 2��
select *from emp where comm=80 or comm=100 or comm=200;
-- in �������� 
-- comm�� 80 �̰ų� 100 �̰ų� 200�� ����� ����Ͻÿ�. 2��
select * from emp where comm in(80, 100, 200);

-- comm�� 80 �� �ƴϰ� �׸��� 100 �� �ƴϰ� �׸��� 200 �� �ƴ� ����� ����Ͻÿ�. 1��
select * from emp where comm!=80 and comm!=100 and comm!=200;

-- not in �������� 
-- comm�� 80 �� �ƴϰ� �׸��� 100 �� �ƴϰ� �׸��� 200 �� �ƴ� ����� ����Ͻÿ�. 1��
select * from emp where comm not in (80, 100, 200);



-- @@@@@@@@@@@@@@@@@@@@@@@@
-- is null , is not null
-- =
-- like
-- is null
-- @@@@@@@@@@@@@@@@@@@@@@@@
-- comm ����  null �� ����� ����Ͻÿ�. 14��
select * from emp where comm is null;
-- comm ����  null �� �ƴ� ��츸 ����Ͻÿ�
select* from emp where comm is not null;


-- ########################
-- ����
-- �������� ���� : asc
-- �������� ���� : desc
-- ########################

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �������� ���� : ASC : ascending 
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- sal �÷��� ������������ �����Ͻÿ�
select * from emp order by sal asc;
-- �̸�(ename)�� ������������ ����Ͻÿ�
select * from emp order by ename asc;

-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �������� ���� : DESC : descending 
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- sal �÷��� ������������ ����Ͻÿ�
select *from emp order by sal desc;

-- �̸�(ename)�� '�̺���'�� ������ ã�Ƽ� 
-- sal ���� �������� �������� �����Ͻÿ�.
select *from emp where ename ='�̺���' order by sal  asc;


-- @@@@@@@@@@@@@@@@@@@@@@@@
-- �ߺ� ����: ���� ������ 2�� �� ���
-- @@@@@@@@@@@@@@@@@@@@@@@@

-- �̸�(ename)�� ������������ �����ϰ� 
-- �Ի���(hiredate)�� ������������ �����Ͻÿ�     
select *from emp order by ename asc, hiredate desc;


-- ����. �޿�(sal)�� ���� �޴� ������ ����ϵ� �޿��� ������
--       �̸�(ename)�� ö�ڰ� ���� ������ ����Ͻÿ�.
select *from emp order by sal desc, ename asc ;



-- ########################
-- ���� ������
-- ������: union, union all
-- ������: inner join, equip join
-- ������: left join, right join
-- ########################

-- GROUP_STAR ������ ��ȸ. 14��
select * from group_star;
-- SINGLE_STAR ������ ��ȸ.7��
select * from SINGLE_STAR;


-- �ߺ��� ���ŵ� ������(union)�� ���Ͻÿ� : GROUP_STAR , SINGLE_STAR.
select *from GROUP_STAR union select *from SINGLE_STAR ;                                                                
-- �ߺ��� ���Ե� �������� ���Ͻÿ� : GROUP_STAR , SINGLE_STAR.  
select *from GROUP_STAR union all select* from SINGLE_STAR;                                    

-- ������ ���ϱ�. ���� �ι��� ��� : GROUP_STAR , SINGLE_STAR.  
-- inner join �Ǵ� equip join ��� 
-- oracle ������ intersect �� ���.
select * from group_star intersect select * from SINGLE_STAR;

-- ������ ���ϱ� : GROUP_STAR - SINGLE_STAR : 10�� ���
-- left join ���
-- oracle ������ minus �� ���.
select * from group_star minus select * from SINGLE_STAR;
-- ������ ���ϱ� : SINGLE_STAR - GROUP_STAR : 3�� ���
-- left join ���
-- oracle ������ minus �� ���.
select * from SINGLE_STAR minus select * from group_star;






-- ########################
-- �̼� 1. READ( SELECT )
-- ########################
-- emp���̺��� ������ �̸��� �޿��� �Ի��ϸ��� ����Ͻÿ�. �÷� 3�� ����ϱ�
select ename , sal , hiredate from emp ; 
-- �÷� �̸��� ��Ī�� �ٿ� ����Ͻÿ�.
select ename as �̸� from emp; 
-- ������ �ߺ����� �ʰ� �� ������ ����Ͻÿ�
select distinct job from emp ;

-- ########################
-- �̼�2. SEARCHING( WHERE )
-- ########################
-- �޿��� 300 ������ ������ ������ȣ, ���� �̸�, �޿��� ����ϱ�
select empno,ename,sal from emp where sal<=300 ;
-- �̸��� ������ȣ���� ������ ������ȣ, ������, �޿��� ����ϱ�
select empno,ename,sal from emp where ename = '����ȣ';
-- �޿��� 250�̰ų� 300�̰ų� 500�� �������� ���� ��ȣ�� ������� �޿��� ����Ͻÿ�
select empno,ename,sal from emp where sal in(250,300,500);
-- �޿��� 250�̰ų� 300�̰ų� 500�� �ƴ� �������� �˻��ϱ�
select empno,ename,sal from emp where sal not in(250,300,500);

-- ########################
-- �̼�3. SORTING(ORDER BY)
-- ########################
-- LIKE �����ڿ� ���ϵ� ī�带 ����Ͽ� ������ �߿��� �̸��� ���衱���� �����ϴ� ����̳�
-- �̸� �߿� ���⡱�� �����ϴ� ������ ������ȣ�� �����̸��� ����ϵ� �ֱ� �Ի��� ���� ������ 
-- ������ȣ, ������, ����, �Ի��� �÷� �� ����ϱ�


-- ����� ���� ����(������ �ǰ�����!)�� �˻��ϱ�. mgr �÷��� ����Ͽ� ������ �ۼ��Ͻÿ�.



-- �μ� ��ȣ�� ���� �������� ����ϵ� ���� �μ����� ������ ����� ��� 
-- �Ի����� ���� ������ �������� ����ϱ�



-- ########################
-- �̼� 4.
-- ########################
-- book ���̺��� ��� �����͸� ����Ͻÿ�


-- book ���̺��� bookname,  publisher,  price,  authid   �÷��� ���ڵ带 ����Ͻÿ�.


-- book ���̺��� bookname �÷��� SQL �� �� �ִ� ���ڵ带 ����Ͻÿ�


-- bookname �� SQL�� ������ ���ڵ带 ����Ͻÿ�


-- bookname �� SQL�� �����ϴ� ���ڵ带 ����Ͻÿ�


-- price�� 30,700�� �̻�(ũ�ų� ����)�̰�
--         50,000�� �̸�(�۴�)�� ���ڵ带 ����Ͻÿ�

-- price�� 30,700�� �̻��̰� 50,000�� �̸��� ���ڵ带 ����Ͻÿ�.
-- ��, between���� ����Ͻÿ�


-- bookname�� ���� 'JAVA' �̰�
-- price �� 30,000 �� �̻��� �����͸� ã���ÿ�


-- price�� 30,700�� ����(�۰ų� ����) �̰ų� 
--         58,000�� �ʰ�(ũ��)�� ���ڵ带 ����Ͻÿ�


-- ���ڵ带 price ������������ �����Ͻÿ�.


-- ���ڵ带 price ������������ �����Ͻÿ�.


-- ���ڵ带  �����Ͻÿ�. publisher ��������, price  ��������


-- bookname�� 'SQL' �� ���� ���ڵ� �߿� price �� �� ������������ �����Ͻÿ�


