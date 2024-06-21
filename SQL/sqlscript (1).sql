REM   Script: Activity 1-5
REM   Activities 1-5

CREATE TABLE salesman(salesman_id int primary key,salesman_name varchar2(20) NOT NULL,salesman_city varchar2(15),commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(1001, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

DESCRIBE salesman


select * from salesman;

DROP TABLE salesman;

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int primary key,salesman_name varchar2(20) NOT NULL,salesman_city varchar2(15),commission int);

DESCRIBE salesman


select * from salesman;

INSERT ALL 
    INTO salesman VALUES(1001, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

DESCRIBE salesman


select * from salesman;

update salesman set salesman_id='5005' where salesman_id='1001';

select * from salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

SELECT 1 FROM DUAL;

select * from salesman;

Insert into salesman(salesman_id,salesman_name,salesman_city,commission,grade)VALUES(5002, 'Nail Knite', 'Paris', 13,100);

select * from salesman;

Insert into salesman(salesman_id,salesman_name,salesman_city,commission,grade)VALUES(5001, 'James Hoog', 'Paris', 13,100);

select * from salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

