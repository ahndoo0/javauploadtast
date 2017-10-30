-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- Ʈ�����(transaction)
-- 
-- ������ ó���� ���� �۾� ���� 
--		���� ���� SQL ��ɹ�(CUD)���� �������� ó��.
-- 
-- �������� �ϰ��� ����. all or nothing.
--		���� ���� SQL���� ������ ���������� ó���Ǹ� ���� ����
--		���� ���� SQL���� �߿��� �ϳ��� SQL���̶� �߸��Ǹ� ��ü ���
-- start transaction :
-- COMMIT    : ���� ���� ���� ����. ctrl+s
-- ROLLBACK  : ���� ���� ���. ctrl+z
-- SAVEPOINT : rollback�� ��ġ ����. breakpoint�� ����
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2


-- @@@@@
-- Ʈ����� ����
-- 
-- �۾� 1. �̺��� �����Ͻÿ�.
--      savepoint tran1 ����
--      delete
-- �۾� 2. �븮�� �������� �ٲٽÿ�.
--      savepoint tran2 ����
--      update
-- �۾� 3.  �߽ż��� �̻�� �ٲٽÿ�.
--      savepoint tran3 ����
--      update
-- �۾� 4. �κ� �ǵ�����. �߽ż��� ��������� ����Ͻÿ�
-- �۾� 5. Ʈ����� �Ϸ�. commit 
-- �۾� 6. ��ü �ǵ�����. rollback
-- @@@@@
select * from emp ;
-- Ʈ����� ����
start transaction;
-- �۾� 1. �̺��� �����Ͻÿ�.
delete from emp where ename='�̺���';
-- �۾� 2. �븮�� �������� �ٲٽÿ�.
update emp set job = '����' where job='�븮';
select * from emp where job='����';
-- �۾� 3. �߽ż��� �̻�� �ٲٽÿ�.
SAVEPOINT tran3 ;
update emp set job='�̻�'where empno=1018;
select * from emp where empno=1018;
-- �κ� �ǵ�����. �߽ż��� ��������� ����Ͻÿ�
rollback to tran3;
-- Ʈ����� �Ϸ�. transaction ����
commit;
-- ��ü �ǵ�����. transaction ����
rollback;


