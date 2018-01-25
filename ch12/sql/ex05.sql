# 데이터베이스 world_o 를 생성
CREATE database world_o;

DROP table city;

# 테이블 city를 생성
CREATE table city (
	id int NOT NULL auto_increment,
	name varchar(50) NOT NULL,
	major varchar(20) NULL,
	pop int NULL,
	PRIMARY KEY (id)
);






