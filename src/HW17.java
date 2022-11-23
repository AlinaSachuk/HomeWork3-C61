import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW17 {
    public static void main(String[] args) throws IOException {
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
        FileReader reader = new FileReader("/Users/alina/Documents//HW17.txt");
        StringBuilder builder = new StringBuilder();
        int c = -1;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        reader.close();
        String info = String.valueOf(builder);
        Pattern patternDocNumber = Pattern.compile("([0-9]{4})(-?[0-9]{4})(-?[0-9]{2})");
        Pattern patternMobNumber = Pattern.compile("[+][(][0-9]{2}[)][0-9]{7}");
        Matcher matcherDocNumber = patternDocNumber.matcher(info);
        Matcher matcherMobNumber = patternMobNumber.matcher(info);
        HashMap<String,String> allInfo = new HashMap<>();
        matcherDocNumber.find();
        matcherMobNumber.find();
        allInfo.put("Document number", matcherDocNumber.group());
        allInfo.put("Phone number", matcherMobNumber.group());
        System.out.println(allInfo);
    }
}
