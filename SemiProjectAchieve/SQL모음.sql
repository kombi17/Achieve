ALTER TABLE table_name

COMMENT ON COLUMN "BOARD"."BOARD_NO" IS '게시글 번호(시퀀스)';
COMMENT ON COLUMN "BOARD"."BOARD_TITLE" IS '게시글 제목';
COMMENT ON COLUMN "BOARD"."BOARD_CONTENT" IS '게시글 내용';
COMMENT ON COLUMN "BOARD"."CREATE_DT" IS '게시글 작성일';
COMMENT ON COLUMN "BOARD"."UPDATE_DT" IS '마지막 수정일';
COMMENT ON COLUMN "BOARD"."READ_COUNT" IS '조회수';
COMMENT ON COLUMN "BOARD"."BOARD_ST" IS '게시글 상태(정상N, 삭제Y)';
COMMENT ON COLUMN "BOARD"."MEMBER_NO" IS '작성자 회원번호';
COMMENT ON COLUMN "BOARD"."BOARD_CD" IS '게시판 코드';

-- BOARD 테이블 제약조건 추가
ALTER TABLE BOARD
ADD PRIMARY KEY (BOARD_NO); -- 제약 조건명 생략(SYS_XXX)

ALTER TABLE BOARD
ADD CONSTRAINT FK_BOARD_CD  -- 제약 조건명 지정
FOREIGN KEY (BOARD_CD)  -- BOARD의 BOARD_CODE 컬럼에 FK 지정
REFERENCES "BOARD_TYPE"; -- 참조할 테이블

ALTER TABLE BOARD
ADD CONSTRAINT "CHK_BOARD_ST"
CHECK ("BOARD_ST" IN ('N','Y'));

ALTER TABLE BOARD
MODIFY "UPDATE_DT" NULL;

-- BOARD_NO 시퀀스
CREATE SEQUENCE SEQ_BOARD_NO;

-- BOARD_TYPE 데이터 삽입
INSERT INTO BOARD_TYPE VALUES(1, '공지사항');
INSERT INTO BOARD_TYPE VALUES(2, '자유 게시판');
INSERT INTO BOARD_TYPE VALUES(3, '과제');

SELECT * FROM BOARD_TYPE;
SELECT * FROM BOARD;


-- BOARD 테이블 샘플 데이터 삽입(PL/ SQL)
BEGIN

    FOR I IN 1..20 LOOP

        INSERT INTO BOARD
        VALUES(SEQ_BOARD_NO.NEXTVAL, 
                SEQ_BOARD_NO.CURRVAL || '번째 게시글',
                SEQ_BOARD_NO.CURRVAL || '번째 게시글 내용 입니다.',
                DEFAULT, DEFAULT, DEFAULT, DEFAULT,1,1
        );

    END LOOP;
END;


-- 게시판이름조회
SELECT BOARD_NM FROM BOARD_TYPE
WHERE BOARD_CD=2;

