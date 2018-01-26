# 5-1 데이터베이스 world_o 를 생성
CREATE database world_0;


# 5-2 테이블 city를 생성
CREATE table city (
	id int NOT NULL auto_increment,
	name varchar(50) NOT NULL,
	major varchar(20),
	pop int,
	PRIMARY KEY (id)
);

# 5-3
DESC city;


# 5-4 테이블 city에 다음 자료를 삽입
INSERT INTO city(name, major, pop) VALUES('서울', '이명길', 20000000);
INSERT INTO city(name, major, pop) VALUES('인천', '김동훈', 3500000);
INSERT INTO city(name, major, pop) VALUES('대구', '강수복', 3000000);
INSERT INTO city(name, major, pop) VALUES('부산', '남기문', 5000000);
INSERT INTO city(name, major, pop) VALUES('목포', '신용현', 2000000);


# 5-5 테이블 city의 모든 행과 열을 출력
SELECT * FROM city;

# 5-6 인구가 300만명이 넘는 도시의 모든 열을 출력
SELECT * from city WHERE pop > 3000000;

# 5-7 인구가 300만 명 미만인 도시의 이름과 시장을 표시
SELECT name,major FROM city WHERE pop < 3000000;

# 5-8 도시 목포의 모든 정보를 출력
SELECT * FROM city WHERE name = '목포';

# 5-9 도시 목포를 삭제
DELETE FROM city WHERE name = '목포';

# 5-10 도시 이름을 서울특별시로 수정
UPDATE city SET name = '서울특별시' WHERE name = '서울';





