select user(), database();

show tables;

desc title;
desc department;
desc employee;


select * from department;

select tno, tname from title;
select deptNo, deptName, floor from department;

delete from title where tno = 6;
delete from department where deptno = 5;

select tno, tname from title;
select tno, tname from title where tno = 3;

update title set tname = '계약직' where tno = 6;
delete from title where tno = 6;
insert into title values(6, '인턴');

update department set deptname = '인사', floor = 12 where deptno = 5;
delete from department where deptno = 5;
insert into department values(5, '홍보', 11);

insert into employee values(1004, '천사', 2, 4377, 3000000, 3);

update employee
   set dept = 3
 where empno = 1004;

delete
  from employee
 where empno = 1004;


create or replace view vm_full_employee
as
select e.empno, e.empname, t.tno as title_no, t.tname as title_name, e.manager as manager_no, m.empname as manager_name, e.salary, d.deptno, d.deptname, d.floor
from employee e join title t on e.title = t.tno left join employee m on e.manager = m.empno join department d on e.dept = d.deptno;


select *
  from vm_full_employee;


select empno, empname, title_no, title_name, manager_no, manager_name from vm_full_employee;
select empno, empname, title_no, title_name, manager_no, manager_name, salary, deptno, deptname from vm_full_employee;

select empno, empname, title as title_no, manager as manager_no, salary, dept as deptno
  from employee
 where empno = 1365;

select empno, empname, title, manager, salary, dept from employee where empno = 1003;
select empno, empname, title, manager, salary, dept from employee

select deptno, deptname, floor from department;
select empno, empname, title, manager, salary, dept from employee;

select * from employee;

-- 부서가 1인 사원정보 출력
select empno, empname, title, manager, salary, dept
  from employee
 where dept = (select deptNo from department where deptNo = 3);


