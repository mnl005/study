show databases;
CREATE DATABASE data;
use data;
show tables;
desc test;
select * from test;

-- 테이블 생성, 삭제--------------------------------------------------------------------
DROP TABLE TABLE_NAME
CREATE TABLE member_table (
 seq        INT NOT NULL AUTO_INCREMENT,
 mb_id     VARCHAR(20),
  PRIMARY KEY(seq)
)
use ttt;
CREATE table vs1(
    seq int not null AUTO_INCREMENT,
    id VARCHAR(10),
    pwd VARCHAR(10),
    name VARCHAR(20),
    email VARCHAR(20),
    PRIMARY key(seq)
)
ALTER TABLE ddd1 ADD COLUMN id varchar(32) NOT NULL;
-- 열추가
alter table data1 modify column age float(10);
-- 열 속성추가?
ALTER TABLE ddd1 CHANGE COLUMN mb_id info varchar(16) NULL;
-- 열 속성변경
alter table vs5 modify column pwd varchar(20) primary key;
alter table vs5 modify column name varchar(20) not null;
ALTER TABLE ddd1 DROP COLUMN address;
-- 열 삭제
ALTER TABLE table_name1 RENAME table_name2;
-- 테이블 이름 변경

-- 레코드 구조수정--------------------------------------------------------------------
INSERT INTO ddd1 (seq, info, pwd, id)
VALUE(3, 'this333',  '34234', 'qlpoi'),(3, 'this333',  '34234', 'qlpoi');
-- 레코드 삽입
update test set age = 23 where id = 6;
-- 레코드 업데이트
delete from test where id = 6;
-- 레코드삭제

-- 레코드 조회-------------------------------------------------------------------

SELECT DISTINCT id FROM test;
SELECT id AS idea, age AS isnotname FROM data1;
-- 필드 이름 다르게 보여

SELECT id FROM test WHERE id BETWEEN 1 AND 3;
SELECT * FROM test WHERE name LIKE 'k%';
SELECT * FROM test WHERE name IN ('lee', 'king', 'kkk');
-- (= , > , < , <= , >= , <> , BETWEEN , LIKE , IN)
SELECT id, color, age FROM test WHERE id = 1 OR id = 2;
SELECT id, color, age FROM test WHERE id > 2 AND age < 50;
SELECT id, color, age FROM test WHERE NOT id = 1 AND NOT id = 2;

-- 찾을 레코드 개수 제한
SELECT id, age FROM test ORDER BY id, age DESC;
SELECT color FROM test WHERE color IS NOT NULL;
SELECT * FROM test WHERE age > 10 LIMIT 3;

SELECT MIN(age) FROM test;
SELECT MAX(age) FROM test;
-- 최소, 최대
SELECT AVG(age) FROM test;
-- 평균
SELECT SUM(age) FROM test WHERE age > 2;
-- 합계
SELECT FLOOR(age), id FROM test;
-- 내림
SELECT CEIL(age), id FROM test;
-- 올림
SELECT ROUND(age), id FROM test;
-- 반올림

SELECT COUNT(id) FROM test;
-- 레코드 개수

SELECT * FROM test WHERE name LIKE 'e%';
-- 'e'로 시작하는
SELECT * FROM test WHERE name LIKE '%e%';
-- 'e'를 포함하는
SELECT * FROM test WHERE name LIKE 'e%';
-- 두 번째 자리에 'e'가 있는
SELECT * FROM test WHERE name LIKE 'e_%';
-- 'e'로 시작하고 3글자 이상인
SELECT * FROM test WHERE name LIKE 'a%1__1';
-- 'a'로 시작하고 '1__1'로 끝나는
SELECT * FROM test WHERE name LIKE 'lee%' OR name LIKE 'king%';
SELECT * FROM test WHERE name LIKE 'ab_d_f_1%';
-- 패턴 조회(숫자 가능)

SELECT * FROM tab1 WHERE kee IN (1, 3);
-- 키값이 1, 3인 레코드를 조회

UNION
-- 두 개의 SELECT 문을 결합한다
WHERE kee IS NULL
WHERE kee IS NOT NULL
-- 해당 값이 빈 값인 경우를 선택한다

--테이블 조인 조회----------------------------------------------------------------------

SELECT * FROM test INNER JOIN data1 ON test.name = data1.name;
-- 내부 조인

SELECT * FROM test LEFT JOIN data1 ON test.name = data1.name;
-- 왼쪽 조인 (왼쪽의 모든 정보 포함)

SELECT * FROM test RIGHT JOIN data1 ON test.name = data1.name;
-- 오른쪽 조인 (오른쪽의 모든 정보 포함)

SELECT * FROM test FULL JOIN data1;
-- 모든 정보 포함

SELECT test.id, test.name FROM test LEFT JOIN data1 ON test.name = data1.name;
-- 예시

--테이블 그룹-----------------------------------------------------------------------------

select count(kee),address from tab1 group by address;
--tab1테이블의 address를 kee의 갯수로 카운트한다
select count(id),other from tab2 group by other having count(id) > 1;
--other을 기준으로 id의 갯수를 구하고, 갯수가 1 이상을 필터링한
select * from tab2 order by address;
--address를 기준으로 조회

--테이블 그룹-----------------------------------------------------------------------------

select * from tab2 where kee = (select count(*) from tab2 where address like '일%');
--조건 안에 셀렉트문 사용한다
select * from tab2 where kee = any (select kee from tab1 where kee > 3);
--tab1에서 값을 추출하여 조건으로 사용한다

--사용자 관련-----------------------------------------------------------------------------

SHOW DATABASES;
-- 데이터베이스 목록 조회

USE mysql;
-- mysql 데이터베이스 선택

SELECT 아이디, 호스트 FROM 사용자;
-- 사용자 목록 조회

CREATE USER 'mnl005'@'localhost' IDENTIFIED BY '비밀번호';
-- 내부 접근 가능한 사용자 생성

CREATE USER 'mnl111'@'%' IDENTIFIED BY '비밀번호';
-- 외부 접근 가능한 사용자 생성

CREATE USER 'mnl111'@'{아이피}' IDENTIFIED BY '비밀번호';
-- 특정 IP만 접근 허용하는 사용자 생성

CREATE USER 'mnl111'@'{아이피 대역}' IDENTIFIED BY '비밀번호';
-- 특정 IP 대역의 사용자만 허용하는 사용자 생성

DROP USER 'mnl111';
-- 사용자 제거

DROP USER 'mnl005'@'%';
-- 사용자 제거

DELETE FROM 사용자 WHERE 아이디='mnl005';
-- 사용자 제거

-- 권한 부여 예시

GRANT ALL PRIVILEGES ON . TO '사용자'@'localhost';
-- 모든 데이터베이스의 모든 테이블에 모든 권한 부여

GRANT ALL PRIVILEGES ON DB이름.* TO '사용자'@'localhost';
-- 특정 데이터베이스의 모든 테이블에 모든 권한 부여

GRANT ALL PRIVILEGES ON DB이름.테이블명 TO '사용자'@'localhost';
-- 특정 데이터베이스의 특정 테이블에 모든 권한 부여

GRANT SELECT ON DB이름.테이블명 TO '사용자'@'localhost';
-- 특정 데이터베이스의 특정 테이블에 select 권한 부여

GRANT SELECT, INSERT ON DB이름.테이블명 TO '사용자'@'localhost';
-- 특정 데이터베이스의 특정 테이블에 select, insert 권한 부여

GRANT UPDATE(컬럼1, 컬럼2) ON DB이름.테이블명 TO '사용자'@'localhost';
-- 특정 데이터베이스의 특정 테이블의 컬럼1과 컬럼2의 update 권한 부여

SELECT * FROM 사용자;
-- 권한 정보 조회




