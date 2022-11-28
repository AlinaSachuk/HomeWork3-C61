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
        Pattern pattern = Pattern.compile("\\d{1,3}");
        String[] lines = ipLine.split("[.]");
        boolean flag = true;
        if (lines.length != 4){
            flag = false;
        }
        for (int i = 0; i < lines.length; i++) {
            Matcher matcher1 = pattern.matcher(lines[i]);

            if (matcher1.find() && (Integer.parseInt(matcher1.group()) > 255)){
                flag = false;
            }
        }
        System.out.println(flag?"Entered ip-address is valid":"NOT VALID ip-address!!! Restart the program and enter ip-address again");

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
        Pattern patternMail = Pattern.compile("([A-z0-9_-]+)@[a-z]+(.[a-z]+)");
        Matcher matcherDocNumber = patternDocNumber.matcher(info);
        Matcher matcherMobNumber = patternMobNumber.matcher(info);
        Matcher matcherMail = patternMail.matcher(info);
        HashMap<String,String> allInfo = new HashMap<>();
        matcherDocNumber.find();
        matcherMobNumber.find();
        matcherMail.find();
        allInfo.put("Document number", matcherDocNumber.group());
        allInfo.put("Phone number", matcherMobNumber.group());
        allInfo.put("E-mail", matcherMail.group());
        System.out.println(allInfo);
    }
}
