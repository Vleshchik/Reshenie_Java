package ru.spb.reshenie.javatasks.retests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.HighLevelAstmParser;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HighLevelAstmParserTest {
    @Test
    void testParseAstmProtocol() {
        HighLevelAstmParser parser = new HighLevelAstmParser();
        String astmProtocol = "R|1|^^^^WBC^1|8.43|10*3/uL||N||F||||20240318100417";
        Pattern resultPattern = Pattern.compile("R\\|[0-9]+\\|(?:[^^]*\\^){4}(?<MSR>[^^]+)[^|]*\\|(?<VAL>[^|]+)(?:[^|]*\\|){9}(?<DAT>[0-9]+)");

        String expectedOutput = "Result 8.43, Test: WBC, Date: 20240318100417";
        String actualOutput = parser.parseAstmProtocol(astmProtocol, resultPattern);

        assertEquals(expectedOutput, actualOutput);
    }
}
