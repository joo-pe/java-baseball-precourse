import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    String result = "";

    public void init() {
        System.out.println("========= Baseball Game ===========");

        while(true) {
            System.out.println("숫자를 입력해주세요 : ");
            Scanner scanner = new Scanner(System.in);
        }
    }

    // 초기 정답 랜덤값 만들기
    public void resultMaker() {
        Random rand = new Random();

        for(int i = 0 ; i < 3 ; i++) {
            boolean flag = true;
            while(flag) {
                int random = rand.nextInt(10) ;
                if(!checkDuplicationResult(random)){
                    result += random+ "";
                    flag = false;
                };
            }
        }
    }

    // 중복되는 랜덤값 확인
    public boolean checkDuplicationResult(int random) {
        return result.contains(random+"");
    }


    // 결과확인
    public void confirmResult() {

    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.init();

    }
}
