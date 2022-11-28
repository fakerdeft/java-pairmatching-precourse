package code;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.lhg.codechecker.tool.CodeChecker;

public class CodeTest {

    @Test
    void parameterTest() {
        // given
        CodeChecker codeChecker = CodeChecker.rules()
                .limitParameters(2)
                .build();

        // when
        boolean check = codeChecker.checkParameterCount("pairmatching", true);

        // then
        assertThat(check).as(codeChecker.getMessage()).isEqualTo(true);
    }
}
