import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    static BaseballGame baseballGame ;

    @BeforeAll
    static void setup() {
        baseballGame = new BaseballGame();
    }

    @Test
    @DisplayName("랜덤숫자 뽑아내기")
    void resultMakerTest() {
        baseballGame.resultMaker();
        System.out.println(baseballGame.result);
        assertThat(baseballGame.result).hasSize(3);
    }

}