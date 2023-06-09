-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition (GROUP BY의 조건은 HAVING에서)
-- ORDER BY column_name(s);
-- INNER JOIN 
-- ON
-- 2) - 설문자 가능 명단(가입 완료)
--    1. 홍길동, 2.장길산, 3.신사임당, ...
SELECT * 
FROM respondents;

-- -설문자 번호 입력 : 4 
-- db에 4번이 존재함? NO : code에서 해결해야함.

-- -- 설문 시작	리뷰는 1, 2번만 할 예정. 답은 우선 생략한다. 
	-- --> 아래 참조 : poll contents example
    -- 참조 : poll contents example --
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
-- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
-- 3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
-- 4. 강의 진행 속도는 적절하였는가?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. 
-- db에서 어떻게 볼 수 있을까.. ? 일단 반복되는 것은? 문항-답항-문항-답항_반복패턴찾는다
-- Think 질문이 먼저 display!답항은 질문에 종속적임_일단 table을 가져와서 display에서 바꿔준다.
-- 고로 table을 먼저 가져와야함.
-- 문항 가져오기 
SELECT *
FROM questions
;
-- 문항다음에 답항이 나와야하는데 답항은 문항에 종속적인거같은데.. JOIN?
-- 이것은 서로 연결이 되어 있다는 뜻이다. 무엇으로 콕 찝어서 가져오지?
-- PK, FK로 이어져 있음을 알 수 있음. 고로 Q1코드로 답항을 가져올 수 있다.
-- PK도 봐야하고 FK도 봐야하는데..> 

-- 일단 statistics에 있는 김영희씨항목을 delete하기
DELETE FROM statistics
WHERE RESPONDENTS_ID = 'R1';

-- insert 김영희씨 항목에 맞게 하기, STATISTICS_ID는 자동 발생 '임의'
-- 응답자에 대한 설문 입력 결과
INSERT INTO statistics
(STATISTICS_ID,RESPONDENTS_ID,QUESTIONS_ID,CHOICE_ID)
VALUES
('ST-01', 'R1', 'Q1','C3');
INSERT INTO statistics
(STATISTICS_ID,RESPONDENTS_ID,QUESTIONS_ID,CHOICE_ID)
VALUES
('ST-02', 'R1', 'Q2','C1');



 