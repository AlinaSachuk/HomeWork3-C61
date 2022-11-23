import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW17 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ip-address in IPv4 version (format X.X.X.X): ");
        String ipLine = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]{4,}");
        Pattern pattern2 = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(ipLine);
        Matcher matcher2 = pattern2.matcher(ipLine);
        String[] lines = ipLine.split("[.]");
        if (lines.length != 4) {
            System.out.println("NOT VALID ip-address!!! Restart the program and enter ip-address again.");
        } else if (matcher.find()) {
            System.out.println("NOT VALID ip-address!!!");
        } else if (matcher2.find()) {
            System.out.println("NOT VALID ip-address!!!");
        } else {
            System.out.println("Entered ip-address is valid");
        }
    }
}
