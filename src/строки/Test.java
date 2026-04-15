package строки;

public class Test {
    public static void main(String[] args) {
        String response1 = "balance=120.50;megabytes=2048;sms=0;minutes=150;roaming=0;tariff=Premium";
        formatBalance(response1);

        String response2 = "balance=30;megabytes=0;sms=5;minutes=50;roaming=0;tariff=Basic";
        formatBalance(response2);

        String response3 = "balance=500;megabytes=5120;sms=100;minutes=300;roaming=256;tariff=PremiumPlus";
        formatBalance(response3);
    }

    static void formatBalance(String response) {
        String[] str = response.split(";");

        for (String s : str) {
            String[] split = s.split("=");
            if (split[1].equals("0")) {
                continue;
            }
            if (split[0].equals("balance")) {
                double balance = Double.parseDouble(split[1]);
                if (balance < 50) {
                    System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
                } else if (balance > 50 && balance <= 200) {
                    System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
                } else if (balance > 200) {
                    System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");
                }
            }
            if (split[0].equals("megabytes")) {
                int megabytes = Integer.parseInt(split[1]);
                if (megabytes >= 1024) {
                    int gigabyte = megabytes / 1024;
                    s = "megabytes= " + gigabyte + " ГБ" + " (" + megabytes + ")";
                }
            }
            if (split[0].equals("balance")) {
                s = split[0] +  "= " + split[1] + " тг";
            } else if (split[0].equals("minutes")) {
                s = split[0] + "= " + split[1] + " мин";
            } else if (split[0].equals("roaming")) {
                s = split[0] + "= " + split[1] + " МБ";
            } else if (split[0].equals("sms")) {
                s = split[0] + "= " + split[1] + " шт";
            }
            System.out.println(s);
        }
    }
}



