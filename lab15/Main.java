import java.util.regex.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("regex.txt"));
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String text = RR();
            if(!(text.isEmpty())){
                bw.write(text);
                bw.flush();
            }
            else {
                bw.write("Ничего не найдено");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String RR() {
        System.out.println("Введите строку: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        String ipAdress = in.nextLine();
        String regex = "\\b((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAdress);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}
