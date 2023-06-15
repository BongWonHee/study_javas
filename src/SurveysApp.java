import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import cars.FactoryDMLs;
import surveys.Statistics;

import java.util.ArrayList;

public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";
            String queryA = "";
            Connection connection = DriverManager.getConnection(url, user, password); // network 자원사용
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement(); // DB자원

            // Statistics statistics = new Statistics();
            // statistics.getRespondents(statement);

            // SELECT COUNT(*) CNT
            // FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT
            // FROM statistics
            // GROUP BY RESPONDENTS_ID) AS t_STATIC;
            // 총 설문자 3명
            // String queryB = "SELECT COUNT(*) CNT\n" + //
            // "FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
            // "FROM statistics\n" + //
            // "GROUP BY RESPONDENTS_ID) AS t_STATIC";
            // // FactoryDMLs factoryDMLs = new FactoryDMLs();
            // // ResultSet resultSet = factoryDMLs.selectStatements(statement, query); //
            // // select문에서 table 형태의 결과값 출력명령어
            // ResultSet reusltSet = statement.executeQuery(queryB);
            // while (reusltSet.next()) {
            // System.out.println("총 설문자: " + reusltSet.getString("CNT"));

            // }
            // 입력키하기
            System.out.println("--- 설문자 가능 명단 ---");
            // 2) - 설문자 가능 명단(가입 완료)
            // 1. 홍길동, 2.장길산, 3.신사임당, ...<숫자 넘버링은 출력때 만들어준다.
            queryA = "SELECT * \n" + //
                    "FROM respondents";
            ResultSet resultSet = statement.executeQuery(queryA);
            int number = 1;

            while (resultSet.next()) {
                System.out.print(number + "." + resultSet.getString("respondents"));
                number = number + 1;
                System.out.println();
            }

            // 3) 설문 시작 리뷰는 1, 2번만 할 예정. 답은 우선 생략한다.
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?

            System.out.println("설문 시작");
            queryA = "SELECT *\n" + //
                    "FROM questions\n";
            resultSet = statement.executeQuery(queryA);
            number = 1;
            Statement statement_second = connection.createStatement();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("QUESTIONS"));
                // 4) 답항 나오는건 질문이 사라지지 않게 종속적인 쿼리문필요
                // (1)이 답항이 나오기 위한 쿼리문의 위치_순환적으로 가지고 와야함
                // (2)이걸 while문으로 돌려야함. while문 안에서 쿼리가 돌아가야함.
                queryA = "SELECT t_CHO.CHOICE_ID, t_CHO.CHOICE\n" + //
                        "FROM question_choice AS t_QUES\n" + //
                        " INNER JOIN choice AS t_CHO\n" + //
                        " ON t_QUES.CHOICE_ID = t_CHO.CHOICE_ID\n" + //
                        "AND QUESTIONS_ID = 'Q1'";
                ResultSet resultSet_second = statement_second.executeQuery(queryA);
                int number_second = 1;

                while (resultSet_second.next()) {
                    System.out.print(number_second + ") " + resultSet_second.getString("CHOICE"));
                    number_second = number_second + 1;
                    System.out.println();
                }
            }
            System.out.println();

            // 만든 순서 1) 총 설문자 표시

            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }// return 0 ;
}
