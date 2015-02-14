CREATE SEQUENCE seq_member;

CREATE TABLE member ( 
	name varchar(30) not null,
	email varchar(100) not null primary key,
	message varchar(1000) not null
);


INSERT INTO member (name, email, message)
VALUES ('홍길동', 'admin@test.com', 'test');

INSERT INTO member (name, email, message)
VALUES ('테스트', 'asdasd@asdas.com', '테스트');

