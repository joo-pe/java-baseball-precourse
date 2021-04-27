import java.util.Scanner;

public class BaseballGame {


    public void init() {
        System.out.println("========= Baseball Game ===========");

        while(true) {
            System.out.println("숫자를 입력해주세요 : ");
            Scanner scanner = new Scanner(System.in);
        }
    }

    // 초기 정답 랜덤값 만들기
    public void resultMaker() {

    }

    // 결과확인
    public void confirmResult() {

    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.init();

    }
}
