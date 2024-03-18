package ru.spb.reshenie.javatasks.re;
//Распарсить высокоуровневый astm, достать результаты
import java.util.regex.*;
public class HighLevelAstmParser {
    public String parseAstmProtocol(String astmProtocol, Pattern resultPattern) {
        StringBuilder parsedResult = new StringBuilder();
        Matcher matcher = resultPattern.matcher(astmProtocol);

        while (matcher.find()) {
            String testName = matcher.group("MSR");
            String resultValue = matcher.group("VAL");
            String resultDate = matcher.group("DAT");

            parsedResult.append("Result ").append(resultValue).append(", Test: ").append(testName).append(", Date: ")
                    .append(resultDate);
        }
        return parsedResult.toString();
    }
}
