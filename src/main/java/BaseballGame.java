import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    String result = "";
    int strikeCnt = 0;
    int bollCnt = 0;

    public void init() {
        System.out.println("========= Baseball Game ===========");
        resultMaker();

        boolean gameFlag = true;
        while(gameFlag) {
            System.out.println(" 숫자를 입력해주세요 : ");
            Scanner scanner = new Scanner(System.in);
            gameFlag = confirmResult(scanner.nextInt()+"");
            if(strikeCnt == 0 && bollCnt == 0) {
                System.out.println("nothing");
            }else if(!gameFlag) {
                System.out.println("정답입니다.");
            }else {
                System.out.println(strikeCnt + " 스트라이크 " + bollCnt + " 볼 입니다.");
            }

            //초기화
            strikeCnt = 0;
            bollCnt = 0;
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
    public boolean confirmResult(String inputValue) {
        String str[] = inputValue.split("");
        for(int i = 0 ; i < result.length() ; i++) {
            for(int j = 0; j < str.length ; j++) {
                if((result.charAt(i)+"").equals(str[j]) ) {
                    if(i==j) {
                        strikeCnt++;
                    }else {
                        bollCnt++;
                    }
                }
            }
        }

        return strikeCnt == 3 ? false : true;
    }


    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.init();

    }
}
