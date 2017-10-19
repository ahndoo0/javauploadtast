-- @@@@@@@@@@
-- from �� ���� ����
-- MySql  : from �� ���� ����
-- MsSql  : from �� ���� ����
-- Oracle : from �� ���� �Ұ�. dual ���̺� ���.
--          dual ���̺��� oracle���� �ִ� 1��1���� ���̺��̴�.
--          dual ���̺��� �ܼ� ����̳� ������ ���ؼ� ���ȴ�.
-- @@@@@@@@@@

-- 24*35�� ��� ����� ����Ͻÿ�.
select 24*35 from dual;
select * from dual;
-- @@@@@@@@@@
-- ���� ���� �Լ�
-- @@@@@@@@@@

-- floor : 2356.2578 �� ������ ���Ͻÿ�.
select floor(2356.2578) from dual;
-- round : 2356.2578 �� �ݿø��Ͻÿ�.
select round(2356.2578) from dual;
-- round�� �̿��Ͽ� 2356.2578 ���� ������ ����Ͻÿ�.
select round(2356.2578,0) from dual;
-- round�� �̿��Ͽ� 2356.2578�� ���� �ι�° �ڸ����� �ݿø��Ͽ�  ����Ͻÿ�.
select round(2356.2578, -2 )from dual;
-- round�� �̿��Ͽ� 2356.2578�� �Ҽ� ����° �ڸ����� �ݿø��Ͽ�  ����Ͻÿ�.
select round(2356.2578, 2) from dual;
-- ����: 
-- MySQL  : truncate 
-- Oracle : trunc

-- truncate(trunc)�� �̿��Ͽ� 2356.2578 ���� ������ ����Ͻÿ�. 2356
select trunc(2356.2578 ,0) from dual;
-- truncate(trunc)�� �̿��Ͽ� 2356.2578�� ���� �ι�° �ڸ����� �����ÿ�. 2300
select trunc(2356.2578, -2) from dual;
-- truncate(trunc)�� �̿��Ͽ� 2356.2578�� �Ҽ� ����° �ڸ����� �����ÿ�. 2356.25
select trunc(2356.2578, 2) from dual;
-- ������ ���ϱ�: mod
-- mod�� �̿��Ͽ� 2356�� 3���� ���� �������� ���Ͻÿ�. 1
select mod(2356,3) from dual;
-- mod�� �̿��Ͽ� 2356.2578�� 3���� ���� �������� ���Ͻÿ�.
select mod(2356.2578 , 3) from dual;

-- @@@@@@@@@@
-- ���� ���� �Լ� 
-- @@@@@@@@@@

-- ���� ���� ���ϱ�. length(). 'kfa ������' �� ���̷� ó���Ͻÿ�. 7
-- MySQL  : �ѱ��� 3byte, �����ڴ� 1byte
-- Oracle : �ѱ��� 1byte, �����ڴ� 1byte
select length('kfa ������') from dual;

-- ����Ʈ ���� ���ϱ�. lengthb(). 'kfa ������' �� ���̷� ó���Ͻÿ�. 10
-- MySQL  : ����
-- Oracle : �ѱ��� 2byte, �����ڴ� 1byte
-- ����Ʈ ���� ���ϱ�. �ѱ��� 2byte, �����ڴ� 1byte
select lengthb('kfa ������') from dual;



-- ���ڿ� ����. 
-- MySQL  : substring
-- Oracle : substr

select substr('abcdefghij',4,4) from dual;
select substr('abcdefghij',4) from dual;
select substr('abcdefghij',-5) from dual;
select substr('abcdefghij',-5,3) from dual;

-- ���ʿ� ��ȣ ä���. lpad
select lpad('Page 1',15,'*.') from dual;
--                  ���ڿ� �����ä���
select lpad('abcd',10,'0') from dual;
select lpad('abcd',10,0) from dual;

-- �����ʿ� ��ȣ ä���. rpad
select rpad('abcd',10,'0')from dual;
select rpad('abcd',10,0) from dual;

-- ���ڿ� �ٲٱ�. replace
select replace('abcdefghij','de',' ') from dual;

-- �빮�� ��ȯ : upper(). "fa ofakfo ��" �� �빮�ڷ� �ٲٽÿ�.
select upper('fa ofakfo ��') from dual;

-- �ҹ��� ��ȯ : lower(). "FA OFAKFO ��" �� �ҹ��ڷ� �ٲٽÿ�.
select lower('FA OFAKFO ��') from dual;

-- @@@@@@@@@@
-- ��¥ ���� �Լ� 
-- MySQL  : now(), curdate(), curtime(), date_format(), date_add(), date_sub()
-- Oracle : sysdate ��¥ , systimestamp��¥�ͽð� , to_date()
-- @@@@@@@@@@

-- ���� ��¥�� �ð��� ����Ͻÿ�
select systimestamp from dual;
-- ���� ��¥�� ����Ͻÿ�
select sysdate from dual;
-- ���� �ð��� ����Ͻÿ�
select to_char( systimestamp, 'hh24:mi:ss') from dual;

-- @@@@@@@
-- �� ��ȯ �Լ� : ��¥�� format
-- Mysql: date_format()
-- Oracle: to_char()���������κ�ȯ ,to_date()����������¥���κ�ȯ , to_number()���ڿ����������κ�ȯ
-- @@@@@@@@

-- ��¥�� format
-- ���� ��¥�� 'YYYY/MM/DD' �������� ����Ͻÿ�
select SYSTIMESTAMP ,to_char(systimestamp,'yyyy/mm/dd') from dual;

-- ����. emp ���̺��� �̸�(ename)�� �Ի���(hiredate) ����ϵ� �Ի���(hiredate)�� "����2�ڸ�/��/��" ���·� ����Ͻÿ�.
select ename �̸�, to_char(hiredate,'yy-mm-dd')�Ի��� from emp;
-- emp ���̺��� �Ի���(hiredate)�� '����4�ڸ�-��-��' �������� ����Ͻÿ�.
select to_char(hiredate,'yyyy-mm-dd')�Ի��� from emp;
select hiredate, to_char(hiredate,'yyyy-mm-dd')�Ի��� from emp;

-- �ð��� format
-- ���� �ð��� 'hh:mm:ss' �������� ����Ͻÿ�
select systimestamp, to_char(systimestamp, 'hh24:mi:ss') from dual;
select to_char(systimestamp, 'hh24:mi:ss') from dual;

-- �̹����� ù°�� ���ϱ�.
select trunc(sysdate, 'mm') from dual;
select to_char(trunc(sysdate, 'mm'), 'yyyymmdd') from dual ;
-- �̹����� ù°�� ���� ���ϱ�
select trunc(sysdate, 'mm') from dual;
select to_char(trunc(sysdate, 'mm'), 'day') from dual ;

-- �ش� ���� ������ ���� ����Ͻÿ�.
select sysdate , last_day(SYSDATE) from dual;
-- ����. emp ���̺��� �Ի���(hiredate)�� �Ի����� ������ ����ϵǵ��� �Ͻÿ�.
select hiredate, to_char(hiredate,'day') from emp;

-- ����. emp ���̺��� �Ի���(hiredate)�� �Ի��� ���� ������ ���� ����ϵǵ��� �Ͻÿ�.
select hiredate, last_day(hiredate) from emp;

-- ������ �̹����� �� �����ΰ�? dayofweek
-- Mysql: dayofweek()
-- Oracle: to_char(sysdate,'iw')������ ���� ,to_char(sysdate,'w')�̹����� ���� 
select sysdate, to_char(sysdate, 'W') from dual; --�̹��� ����
select sysdate, to_char(sysdate, 'iw') from dual;-- ������ ����

-- ���ݺ��� '2014-01-01'������ ���� �� ���̸� ����Ͻÿ�. 
select '2014-01-01', to_date('2014-01-01','yyyy-mm-dd')from dual; --���ڸ� ��¥�� ��ȯ
select sysdate
            ,to_date('2014-01-01','yyyy-mm-dd')
            ,trunc(months_between(sysdate ,to_date('2014-01-01','yyyy-mm-dd')))
from dual;

select sysdate ,trunc(months_between(sysdate ,to_date('2014-01-01','yyyy-mm-dd')))from dual;

-- ���ݺ��� '2014-01-01'������ ��� ���̸� ����Ͻÿ�.
select months_between(sysdate, to_date('2014-01-01','yyyy-mm-dd'))from dual;
select months_between(sysdate, to_date('2014-01-01','yyyy-mm-dd'))/12 from dual;
select trunc(months_between(sysdate, to_date('2014-01-01','yyyy-mm-dd'))/12) from dual;

-- ����. ���ݺ��� '2014-01-01'������ �ϼ��� ����Ͻÿ�.
select to_date('2014-01-01','yyyy-mm-dd')from dual;
select sysdate - to_date('2014-01-01','yyyy-mm-dd')from dual;
select trunc(sysdate - to_date('2014-01-01','yyyy-mm-dd')) from dual;

-- ���� ��¥�� 6���� �ĸ� ����Ͻÿ�.
select sysdate, add_months(sysdate,6) from dual;
-- ���� ��¥�� -6���� ���� ����Ͻÿ�.
select sysdate, add_months(sysdate,-6) from dual;

-- ����. ���� ��¥�� 17���ĸ� ����Ͻÿ�.
select sysdate, add_months(sysdate,17*12) from dual;


-- @@@@@@@@@@
-- ����ȯ �Լ� 
-- SQL ������ Ÿ�� : ��¥(date) <--> ����(character) <--> ����(number)
-- MySQL  : convert() : 
-- Oracle : to_char, to_date, to_number
-- @@@@@@@@@@

-- �������ڸ� ���ڿ��� ��ȯ. ��¥ --> ���ڷ� : YYYY, MM, DD
select sysdate , to_char(sysdate ,'yyyy-mm-dd') from dual;
-- ����ð��� ���ڿ��� ��ȯ. ��¥ --> ���ڷ� : hh:mm, hh:mm:ss
select systimestamp, to_char(systimestamp ,'hh24:mm:ss') from dual;
-- ���ڸ� ��¥�� ��ȯ. ���� --> ��¥. ��ȯ �Ŀ��� DATE ������ �ȴ�.
select '2012-03-21', to_date('2012-03-21','yyyy-mm-dd') from dual;
-- ���ڸ� ���ڷ� ��ȯ

-- ����. ���� 20,000,000.73797874857848 �� �Ǽ��� �ٲٽÿ�.�Ǽ��� ��ȯ����','�� �ݵ�� �����ؾ߸��Ѵ�.
select '20,000,000.73797874857848', replace('20,000,000.73797874857848',',','')
       , to_number(replace('20,000,000.73797874857848',',','') )
from dual;

-- @@@@@@@@@@
-- ��ȭ ��ȣ ���̱�.
-- MySql  : �ȵ�.
-- Oracle : ����.
-- @@@@@@@@@@
--emp ���̺��� sal �÷��� ����ҋ� ,�޷�,��ȭ,����ȭ�� ����Ͻÿ�.
select sal
          , to_char(sal,'$999,999.99')
          , to_char(sal,'L999,999.99')
          , to_char(sal,'U999,999.99')
          from emp;



-- @@@@@@@@@@
-- ���� ���̺� �����
-- @@@@@@@@@@


-- @@@@@@@@@@
-- NULL�� ó���ϴ� �Լ� 
-- MySQL  : ifnull(), if()
-- Oracle : nvl()
-- @@@@@@@@@@
select nvl( null, 1) from dual;
select nvl( 0, 1) from dual;
select nvl( '0', 1) from dual;


-- @@@@@@@@@@
-- ���� �Լ� : CASE ��. �ڹ��� ����if �� ����
-- CASE WHEN THEN ELSE 
-- @@@@@@@@@@ 


-- CASE WHEN THEN ELSE �� ����Ͽ� �μ����� ����Ͻÿ�.
-- deptno = 10  �̸� �渮��
-- deptno = 20  �̸� �λ��
-- deptno = 30  �̸� ������
-- deptno = 40  �̸� �����
-- �ƴϸ� ��������
select ename, deptno ,case when deptno =10 then '�渮��'
         when deptno =20 then '�λ��'
         when deptno =30 then '������'
         when deptno =20 then '�����'
         else '��������'
         end
from emp; 

-- CASE WHEN THEN ELSE �� ����Ͽ� ���ݺ��� ���� ����� �������� �� ���� �ΰ�? 
-- case when then else �� �̿��Ͻÿ�.
-- if( dayofweek( now() ) <= 4)  {
-- 		4 -  dayofweek( now()     )
-- }
-- else {
--		4 + (7-dayofweek( now() ) )
-- }
select sysdate
, to_char(sysdate ,'d')
, to_number(to_char(sysdate ,'d'))
,case when to_number( to_char(sysdate,'d'))<=4 
then 4-to_number( to_char(sysdate,'d'))
else 4+(7-to_number( to_char(sysdate,'d')))
end as "����" 
from dual;


-- @@@@@@@@@@@@@@
-- �̼�
-- @@@@@@@@@@@@@@
-- �̼� 1. ���ڿ� ����(substring, substr) �Լ��� ����Ͽ� 9���� �Ի��� ����� ����ϱ�. 1��
-- ���� ��¥���� ���� �����Ϸ���
select sysdate, to_char(sysdate,'mm') from dual;
-- �Ի���(hiredate)���� ���� �����Ϸ���
select hiredate, to_char(hiredate,'mm') from emp;
-- 9���� �Ի��� ������ ã�Ƽ� ����Ͻÿ�.
select ename,hiredate,to_char(hiredate,'mm') from emp where to_char(hiredate,'mm')=9 ;
-- �̼� 2. SUBSTR �Լ��� �̿��Ͽ� 2003�⵵�� �Ի��� ����� �˻��ϱ�. 2��
select hiredate from emp ;
select ename,hiredate,to_char(hiredate,'yyyy-mm-dd'),substr(to_char(hiredate,'yyyy-mm-dd'),1,4) from emp 
 where substr(to_char(hiredate,'yyyy-mm-dd'),1,4)=2003 ;

-- �̼� 3. �̸�(ename)�� '��'�� ������ ����� �˻��Ͻÿ�. 2��
select ename from emp where ename like '%��';
-- �̼� 4. �̸��� �� ��° ���ڿ� '��'�� �ִ� ����� �˻��ϱ�. 2��
select ename from emp where ename like '_��_';
-- �̼� 5. ����(job)�� ���� ���޿� ���� �޿��� �λ��Ͻÿ�.
-- '����'�� ����� 5% �λ� 
-- '����'�� ����� 10% �λ�
-- '�븮'�� ����� 15% �λ� 
-- '���'�� ����� 20% �λ�
select * from emp ;
select sal,ename,job,sal * case when job='����' then 1.05
when job='����'then 1.1
when job='�븮'then 1.15
when job='���'then 1.2
else 1
end as "�λ�" 
from emp ;
-- �̼� 6. �Ի����� ������ 2�ڸ�(YY), 
--         ���� ���ڷ� ǥ���ϰ� 
--         ������ ���(DY)�� ����Ͻÿ�.
-- ���� �˻��� �̿� 
-- ���� �˻��� �̿� : http://aesya.tistory.com/15


