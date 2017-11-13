-- book 테이블 제거하기
DROP TABLE IF EXISTS book;

-- auth 테이블 제거하기
DROP TABLE IF EXISTS auth;

-- http://www.tutorialspoint.com/sqlite/sqlite_data_types.htm
-- SQLite does not have a separate storage class for storing dates and/or times, 
-- but SQLite is capable of storing dates and times as TEXT, REAL or INTEGER values.

-- book 테이블 생성
CREATE TABLE book (
      book_id     INTEGER PRIMARY KEY
    , title       VARCHAR(50)
    , publisher   VARCHAR(30)
    , year        VARCHAR(10)
    , price       INTEGER
    , dtm         TEXT
    , use_yn      INTEGER
    , authid      INTEGER    
);


-- auth 테이블 
CREATE TABLE auth (
      authid    INTEGER PRIMARY KEY   
    , name      VARCHAR(50)
    , birth     VARCHAR(10)
);



INSERT INTO book (title, publisher, year, price, dtm, use_yn, authid)
            VALUES('Operating System', 'Wiley', '2003', 30700, '2004-01-01', 0, 1 ) ;

INSERT INTO book (title, publisher, year, price, dtm, use_yn, authid)
            VALUES('MySQL', 'OReilly', '2009',  58700, '2010-01-01', 1, 2 ) ;

INSERT INTO book (title, publisher, year, price, dtm, use_yn, authid)
            VALUES('JAVA', 'Hall', '2013', 40000, '2014-01-01', 1,  3 ) ;

INSERT INTO book (title, publisher, year, price, dtm, use_yn, authid)
            VALUES('First SQL', 'Wiley', '2015',  57700, '2016-01-01', 1, 4 ) ;


INSERT INTO auth (authid, name, birth)   VALUES(1, 'bob' , '1970.05.01' ) ;
INSERT INTO auth (authid, name, birth)   VALUES(2, 'kim' , '1980.05.01' ) ;
INSERT INTO auth (authid, name, birth)   VALUES(7, 'park', '2000.05.01' ) ;


-- COMMIT;


SELECT * FROM auth;

SELECT * FROM book ;