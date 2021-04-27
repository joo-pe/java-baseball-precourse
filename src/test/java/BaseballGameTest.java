import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    static BaseballGame baseballGame ;

    @BeforeAll
    static void setup() {
        baseballGame = new BaseballGame();
    }

    @Test
    @DisplayName("랜숫자 뽑아내기")
    void resultMakerTest() {
        baseballGame.resultMaker();
        System.out.println(baseballGame.result);
        assertThat(baseballGame.result).hasSize(3);
    }


    @DisplayName("결과확인")
    @ParameterizedTest
    @CsvSource(value = {"123:1:0", "352:0:0", "872:0:1", "192:2:0" ,"178:2:0"}, delimiter = ':')
    void contains(String input, int strikeSu, int bollSu) {
        baseballGame.result = "198";
        baseballGame.confirmResult(input);
        assertThat(baseballGame.strikeCnt).isEqualTo(strikeSu);
        assertThat(baseballGame.bollCnt).isEqualTo(bollSu);
        baseballGame.strikeCnt = 0;
        baseballGame.bollCnt = 0;
    }
}