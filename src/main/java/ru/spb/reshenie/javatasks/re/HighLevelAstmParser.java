package ru.spb.reshenie.javatasks.re;
//Распарсить высокоуровневый astm, достать результаты
import java.util.regex.*;
public class HighLevelAstmParser {
    public static void main(String[] args) {
        String astmProtocol = "H|\r\nP|1\r\nO|\r\nR|1|^^^Result 1|12.3|Unit\r\nR|2|^^^Result 2|4.56|Unit\r\nL|1|N\r\n";

        Pattern resultPattern = Pattern.compile("R\\|(\\d+)\\|\\^\\^\\^Result (\\d+)\\|(\\d+\\.?\\d*)\\|([^|]+)");
        Matcher matcher = resultPattern.matcher(astmProtocol);

        while (matcher.find()) {
            String resultId = matcher.group(1);
            String resultName = matcher.group(2);
            String resultValue = matcher.group(3);
            String resultUnit = matcher.group(4);

            System.out.println("Result " + resultName + " (ID: " + resultId + "): " + resultValue + " " + resultUnit);
        }
    }
}
