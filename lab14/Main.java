import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String ipAdress = "авыфафыва 144.255.255.10 авпывап";
        String ipAdress1 = "авыфафыва 256.255.255.10 авпывап";
        String regex = "\\b((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAdress);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("IP-адрес не найден");
        }
    }
}
