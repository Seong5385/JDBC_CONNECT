import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import domain.users.UsersVO;
import repository.*;

public class UsersManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        UserDAOImpl info = new UserDAOImpl();

        while (true) {
            System.out.print("명령어를 입력하세요(I: 입력, M: 갱신, D: 삭제, A: 모두 출력, IN: 부분 출력, EP: 이메일로 출력, Q: 종료): ");
            String cmd = br.readLine().toUpperCase();

            switch (cmd) {
                case "I" -> info.userAdd(new UsersVO());
                case "M" -> info.userMod(new UsersVO(), new UsersVO());
                case "D" -> info.userDel(new UsersVO());
                case "A" -> info.userAll().forEach(System.out::println);
                case "IN" -> info.userSearchIdName();
                case "EP" -> info.userSearchEmail();
                case "Q" -> {
                    System.out.println("종료");
                    return;
                }
            }
        }
    }
}
