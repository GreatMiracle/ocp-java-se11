import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class TernaryOperator {
    public static void main(String[] args) {

        // Example 1
        // The value returned from this ternary operation is a boolean.
        boolean hasArguments = (args.length == 0) ? false : true;
        System.out.println("Result of Example 1 = " + hasArguments);

        // Example 2
        // Value returned from ternary operation is primitive data
        boolean b = true;
        int result = (b && (hasArguments && args[0].equals("10"))) ? 10 : 0;
        System.out.println("Result of Example 2 = " + result);

        // Example 3
        // Value returned from ternary operation is either an Integer or String
        Object objectResult =
                (b && (hasArguments && args[0].equals("10"))) ? 10 : "Not ten";
        System.out.println("Result of Example 3 = " + objectResult);

        // Example 4
        // Expressions only evaluated in the one of the cases
        int x = 0;
        int y = 0;
        int newResult = (b && (hasArguments && args[0].equals("10"))) ? x++ : y++;
        System.out.println("Result of Example 4 = " +
                newResult + ", x = " + x + ", y = " + y);


        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }

        System.out.println(loopIterations);


        ZoneId koreaTimeZone = ZoneId.of("Asia/Seoul");

        // Get the current date and time in Korea
        LocalDateTime currentDateTime = LocalDateTime.now(koreaTimeZone);

        // Convert the current date and time to milliseconds
        long milliseconds = currentDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();

        // Print the current date and time in milliseconds
        System.out.println("Current date and time in milliseconds: " + milliseconds);

    }
}