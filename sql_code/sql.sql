# 데이터베이스 : 여러 시스템 또는 사용자들이 공용할 목적으로 통합,저장 한 데이터의 집합
# 데이터베이스 정의 : 통합된 데이터, 저장된 데이터, 운영 데이터, 공용 데이터
# 데이터베이스 시스템 특징 : 실시간 접근성, 지속적 변화, 동시공유, 내용에 의한 참조
# 데이터베이스 관리시스템 : 데이터의 입력,수정,삭제 등의 기능 제공하는 별도의 시스템

# 계층형 데이터베이스 : 데이터가 부모와 자식 관계인 트리구조, 상위레코드 아래에 여러개의 하위 레코드 있고, 중복쉽게발생, 상하종속관계임으로 프로세스변경어렵다
# 네트워크형 데이터베이스 : 데이터를 노드로 표현, 구조복잡하고 변경.운영 어렵고 데이터 종속 문제
# 키-값 데이터베이스 : 키-값을 일대일 대응해 비정형 데이터 저장시 유리, 데이터테이블.JSON.XML스키마 등으로 표현 가능
# 관계형 데이터베이스 : 테이블로 데이터 표현, 테이블끼리 관계 표현은 ERD로 표현

# 데이터 정의 언어(DDL) : CREATE, ALTER, DROP, TRUNCATE
# 데이터 조작 언어(DML) : SELECT, INSERT, UPDATE, DELETE
# 데이터 제어 언어(DCL) : GRANT, REVOKE, COMMIT, ROLLBACK

# 데이터베이스 개념적 모델링 : 요구사항 도출과 프로젝트의 범위와 설계를 정의, 비즈니스 요구사항 포함
# ... 절차 : 주제영역 도출 -> 핵심 엔티티 도출 -> 엔티티간 관계설정 -> 엔티티 속성 정의 -> 엔티티 식별자 관리
# 논리적 데이터 모델 : 개념적 데이터 모델에서 도출된 엔티티를 기술적 데이터 구조와 연결하는 단계, 논리적 ERD 생성
# 물리적 데이터 모델 : DBMS언어 사용해 데이터모델 생성
# 모델링 절차 : 요구사항분석 -> 개념모델링(엔티티도출) -> 논리모델링(요건을표현한모델생성) -> 물리모델링(성능고려) -> DB구현(특정DB에구현)

# 릴레이션 : 엔티티 사이의 관계, 1:1 ~ n:m, DB설계시 관계를 정확히 표현해 일관성 유지

# 스토어드 프로시저 : 복잡한쿼리를 프로시저 내부에 저장 후 호출한다
# 스토어드 함수 : return 으로 반드시 하나의 값만 반환, 사용자가 정의하는 함수
# 클러스터형 인덱스 : 데이터가 정렬된 순서대로 저장되어 검색에 빠르고 효율적, 데이터 삽입.업데이트시 성능에 영향
# 비클러스터형 인덱스 : 데이터 저장 방식에 영향없다, 많은 열에 인덱스 추가 가능, 데이터 검색시 추가 조회 비용 발생 가능

# 트리거 : 특정 조건시 자동실행, insert시 변경사항이 테이블에 기록, 전후 트리거가 각각 존재하는이유는 상태값 비교시 전과후중
# ... 둘 중 하나를 선택할 수 있게 하기 위함이다
# 행트리거 : insert,update,delete 등의 명령문으로 이벤트가 실행
# 열트리거 : insert,update,delete에 대해 영향받는 행 갯수 상관없이 한번만 실행, 트랜잭션에 대해 명령문 트리거가 한번만 실행

# 제1정규화 : 복수값 가지는 속성을 다른 테이블로 분리
# 제2정규화 : 부분 종속성 제거
# 제3정규화 : 이행적 종속성 제거(속성이 다른 속성을 통해 종속시)
# bcnf 정규화 : 다수의 주 식별자를 분리, 기본키 아닌 속성이 기본이키의 속성을 결정짓지 못한다, 강화된 제3정규화
# 제4정규화 : 다치 종속성 제거, 독립적 관계의 속성들이 한 속성에 종속시 이를 분리
# 제5정규화 : 조인속성을 제거해 n개의 테이블로 분리

# creat view 뷰이름 as select ..., drop view 뷰이름
# 뷰 : 가상테이블로 제약없시 삭제가능, 변경시 제약많다, 인덱스 못가진다

# all : 모두 참일때
# and : 둘다 참일때
# any : 하나라도 참일때
# between : 범위내 조회
# exisits : 하위 쿼리에 행 포함시
# in : 하나라도 포함될때
# like : 패턴과 일치시
# not : 부정
# or : 둘중 하나라도 참일때
# some : 비교 집합중 일부가 참일때

# '^K|N$' : K로 시작하거나 N으로 끝나는
# 'K[L-N]' : K와 함께 L과N사이글자를 포함하는
# 'K[^L-N]' : K와 함께 L과N사이글자를 포함않는

# SELECT MIN(age) FROM test;
# SELECT MAX(age) FROM test;
# SELECT AVG(age) FROM test;
# SELECT SUM(age) FROM test WHERE age > 2;
# SELECT FLOOR(age), id FROM test;
# SELECT CEIL(age), id FROM test;
# SELECT ROUND(age), id FROM test;
# SELECT COUNT(id) FROM test;
# select concat('i','o','a') as c1;
# ABS(-10), sign(0), power(2,3), sqrt(4), rand(1)

# ifnull(열, 대체값)
# coalesce(열1,열2...) : null 이 아닌 대체값 나올때까지 가능
# lower(문자열), upper(문자열)
# trim(문자열), ltrim(문자열), rtrim(문자열)
# length(문자열) : 바이트값 반환
# char_length(문자열) : 문자갯수 반환]
# left(문자열, 반환할갯수)
# substring(문자열, 반환시작 인덱스, 반환문자갯수)
# replace(문자열, 바꿀타겟, 바꿀값)
# repeat(문자,반복횟수)
# space(공백넣을횟수)
# reverse(역순반환할문자)
# ctrcmp(비교할문자1,비교할문자2)

# 시간함수 : current_date(), current_time(), current_timestamp(), now(),
# ... datediff(날짜1,날짜2), timestampdiff(날짜1,날짜2)


# type : int, bigint, float, double, time, date, datetime, timestamp
# row_number() : 유일순위
# rank() : 공동순위, 순위 점프
# dense_rank() : 공동순위, 순위 점프 없음

# CTE : 공통 테이블 표현식, 결합은(union, intersect,except)


show databases;
CREATE DATABASE main;
use main;
show tables;
show create table tt1;
desc tt1;


CREATE TABLE t1
(
    c1 INT NOT NULL AUTO_INCREMENT,
    c2 VARCHAR(20),
    c3 int,
    PRIMARY KEY (c1)
);
CREATE TABLE tt1
(
    cc1 INT NOT NULL AUTO_INCREMENT,
    cc2 VARCHAR(20),
    PRIMARY KEY (cc1),
    foreign key (cc1) references t1(c1) on delete cascade
);



alter table tt1 rename ttt1;
alter table tt1 add column cc3 varchar(23);
alter table tt1 modify column cc3 float(10);
alter table tt1 change column cc3 ccc3 varchar(10);
alter table tt1 drop column ccc3;
drop table tt1;

# -----------------------------------------

select * from tt1;
select * from t1 where c1 > 5 ;
select * from t1 order by c1 desc, c1 desc;
select * from t1 where c1 not between 1 and 3;
select * from t1 where c1 in (1,4);
select * from t1 where c2 is not null;
select * from t1 limit 4 offset 2;
select * from t1 where c2 like 'as__f%';
select c1, c2 from t1 group by c1, c2;
select c2, count(*) as id_count from t1 group by c2 having c2 like '%f%' order by count(*) desc;
select distinct c2 from t1;

insert into tt1(cc2) values('ewe');
update t1 set c2 = 'noid' where c1 = 1;
delete from t1 where c1 = 1;




# -----------------------------------------
select * from t1 inner join tt1 on t1.c1 = tt1.cc1;
select * from t1 left join tt1 on t1.c1 = tt1.cc1;
select * from t1 right join tt1 on t1.c1 = tt1.cc1;
select * from t1 full join tt1;
select * from t1 left outer join tt1 on t1.c1 = tt1.cc1 where tt1.cc1 is null;
select t1.c1, t1.c2, tt1.cc2 from t1 left join tt1 on t1.c1 = tt1.cc1;
select t1.c1, tt1.cc1 from t1 cross join tt1;

select * from t1 where c1 in (select cc1 from tt1 where cc1 >= 2);
select * from t1 where not exists (select * from t1 where c1 > 30);
select t1.c1 ,(select tt1.cc2 from tt1 where t1.c1 = tt1.cc1) as tt1_cc2 from t1 where c1 >= 3;


# -----------------------------------------
select row_number() over (order by c2 desc) as c1_rank, c2 from t1;
select rank() over (order by c2 desc) as c1_rank, c2 from t1;
select dense_rank() over (order by c2 desc) as c1_rank, c2 from t1;
select row_number() over (partition by c2 order by c1 desc) as c1_lank, c1, c2 from t1;

# -----------------------------------------
with custom (c1,c2)
as (
    select c1,c2 from t1 where c1 >5
                         and c1 <= 20
                         union
    select c1,c2 from t1 where c2 like '%f%'
    )
select * from custom;


# SHOW DATABASES;
# -- 데이터베이스 목록 조회
#
# USE mysql;
# -- mysql 데이터베이스 선택
#
# SELECT 아이디, 호스트 FROM 사용자;
# -- 사용자 목록 조회
#
# CREATE USER 'mnl005'@'localhost' IDENTIFIED BY '비밀번호';
# -- 내부 접근 가능한 사용자 생성
#
# CREATE USER 'mnl111'@'%' IDENTIFIED BY '비밀번호';
# -- 외부 접근 가능한 사용자 생성
#
# CREATE USER 'mnl111'@'{아이피}' IDENTIFIED BY '비밀번호';
# -- 특정 IP만 접근 허용하는 사용자 생성
#
# CREATE USER 'mnl111'@'{아이피 대역}' IDENTIFIED BY '비밀번호';
# -- 특정 IP 대역의 사용자만 허용하는 사용자 생성
#
# DROP USER 'mnl111';
# -- 사용자 제거
#
# DROP USER 'mnl005'@'%';
# -- 사용자 제거
#
# DELETE FROM 사용자 WHERE 아이디='mnl005';
# -- 사용자 제거
#
# -- 권한 부여 예시
#
# GRANT ALL PRIVILEGES ON . TO '사용자'@'localhost';
# -- 모든 데이터베이스의 모든 테이블에 모든 권한 부여
#
# GRANT ALL PRIVILEGES ON DB이름.* TO '사용자'@'localhost';
# -- 특정 데이터베이스의 모든 테이블에 모든 권한 부여
#
# GRANT ALL PRIVILEGES ON DB이름.테이블명 TO '사용자'@'localhost';
# -- 특정 데이터베이스의 특정 테이블에 모든 권한 부여
#
# GRANT SELECT ON DB이름.테이블명 TO '사용자'@'localhost';
# -- 특정 데이터베이스의 특정 테이블에 select 권한 부여
#
# GRANT SELECT, INSERT ON DB이름.테이블명 TO '사용자'@'localhost';
# -- 특정 데이터베이스의 특정 테이블에 select, insert 권한 부여
#
# GRANT UPDATE(컬럼1, 컬럼2) ON DB이름.테이블명 TO '사용자'@'localhost';
# -- 특정 데이터베이스의 특정 테이블의 컬럼1과 컬럼2의 update 권한 부여
#
# SELECT * FROM 사용자;
# -- 권한 정보 조회
