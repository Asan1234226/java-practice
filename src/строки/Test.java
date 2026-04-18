package строки;

public class Test {
    public static void main(String[] args) {
        String response1 = "balance=120.50;megabytes=2048;sms=0;minutes=150;roaming=0;tariff=Premium";
        formatBalance(response1);

        String response2 = "balance=30;megabytes=512;sms=5;minutes=50;roaming=0;tariff=Basic";
        formatBalance(response2);

        String response3 = "balance=500;megabytes=5120;sms=100;minutes=300;roaming=256;tariff=PremiumPlus";
        formatBalance(response3);
    }

    static void formatBalance(String response) {
        String[] str = response.split(";");

        double balance =  0;
        for (String s : str) {
            String[] split = s.split("=");
            String key = split[0];
            String value = split[1];
            if (value.equals("0")) {
                continue;
            }
            if (key.equals("megabytes")) {
                int megabytes = Integer.parseInt(value);
                if (megabytes >= 1024) {
                    int gigabyte = megabytes / 1024;
                    s = "Интернет " + gigabyte + " ГБ" + " (" + megabytes + "МБ)";
                } else {
                    s = "Интернет " + megabytes +  " МБ";
                }
            }

            if (key.equals("balance")) {
                s =  "Баланс = " + value + " тг";
                balance = Double.parseDouble(value);
            } else if (key.equals("minutes")) {
                s =  "Минута = " + value + " мин";
            } else if (key.equals("roaming")) {
                s =  "Роуминг = " + value + " МБ";
            } else if (key.equals("sms")) {
                s =  "СМС = " + value + " шт";
            } else if (key.equals("tariff")) {
                s = "Тариф = " + value;
            }
            System.out.println(s);
        }
        if (balance <= 50){
            System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
        } else if (balance > 50 && balance <= 200) {
            System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
        } else if (balance >= 200) {
            System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");
        }
    }
}


//   if (split[0].equals("balance")) {
//               double balance = Double.parseDouble(split[1]);
//               if (balance < 50) {
//                  System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
//                } else if (balance > 50 && balance <= 200) {
//                    System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
//                } else if (balance > 200) {
//                    System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");
//                }