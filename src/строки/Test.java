package строки;

public class Test {
    public static void main(String[] args) {
        String response1 = "balance=120.50;megabytes=2048;sms=0;minutes=150;roaming=0;tariff=Premium;lang=ru";
        formatBalance(response1);

        String response2 = "balance=30;megabytes=512;sms=5;minutes=50;roaming=0;tariff=Basic;lang=en";
        formatBalance(response2);

        String response3 = "balance=500;megabytes=5120;sms=100;minutes=300;roaming=256;tariff=PremiumPlus";
        formatBalance(response3);

        String response4 = "balance=75;megabytes=3072;sms=20;minutes=200;roaming=128;tariff=Premium;lang=kz";
        formatBalance(response4);
    }

    static void formatBalance(String response) {
        String[] str = response.split(";");

        double balance = 0;
        int sms = 0;
        int minutes = 0;
        int roaming = 0;
        int megabytes = 0;
        String tariff = "";
        String lang = "ru";
        for (String s : str) {
            String[] split = s.split("=");
            String key = split[0];
            String value = split[1];
            if (key.equals("balance")) {
                balance = Double.parseDouble(value);
            } else if (key.equals("sms")) {
                sms = Integer.parseInt(value);
            } else if (key.equals("minutes")) {
                minutes = Integer.parseInt(value);
            } else if (key.equals("roaming")) {
                roaming = Integer.parseInt(value);
            } else if (key.equals("tariff")) {
                tariff = value;
            } else if (key.equals("lang")) {
                lang = value;
            } else if (key.equals("megabytes")) {
                megabytes = Integer.parseInt(value);
            }
            if (value.equals("0")) {
                continue;
            }
        }

        if (lang.equals("en")) {
            System.out.println("\n" + "balance: " + balance + "KZT");
            if (megabytes > 1024) {
                int gigabytes = megabytes / 1024;
                System.out.println("Internet " + gigabytes + " GB " + " (" + megabytes + " MB " + ")");
            } else {
                System.out.println("Internet " + megabytes + " MB");
            }
            System.out.println("minutes: " + minutes + " min");
            System.out.println("roaming: " + roaming + " MB");
            System.out.println("sms: " + sms + " pcs");
            System.out.println("tariff: " + tariff + "\n");
        } else if (lang.equals("ru")) {
            System.out.println("\n" + "Баланс: " + balance + "тг");
            if (megabytes > 1024) {
                int gigabytes = megabytes / 1024;
                System.out.println("Интернет " + gigabytes + " ГБ " + " (" + megabytes + " МБ " + ")");
            } else {
                System.out.println("Интернет " + megabytes + " МБ");
            }
            System.out.println("Минута: " + minutes + " мин");
            System.out.println("Роуминг: " + roaming + " Мб");
            System.out.println("СМС: " + sms + " шт");
            System.out.println("Тариф: " + tariff + "\n");
        } else
            if (lang.equals("kz")) {
                System.out.println("\n" + "Баланс: " + balance + "тг");
                if (megabytes > 1024) {
                    int gigabytes = megabytes / 1024;
                    System.out.println("Интернет " + gigabytes + " ГБ " + " (" + megabytes + " МБ " + ")");
                } else {
                    System.out.println("Интернет " + megabytes + " МБ");
                }
                System.out.println("Минуттар: " + minutes + " мин");
                System.out.println("Роуминг: " + roaming + " Мб");
                System.out.println("SMS: " + sms + " шт");
                System.out.println("Тариф: " + tariff + "\n");
            }
            if (lang.equals("ru")) {
                if (balance < 50) {
                    System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
                } else if (balance >= 50 && balance <= 200) {
                    System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
                } else if (balance >= 200) {
                    System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");

                }
            }
        if (lang.equals("en")) {
            if (balance < 50) {
                System.out.println("\n" + "Top up your account with 100 tenge now and get +500 minutes of talk time!");
            } else if (balance > 50 && balance <= 200) {
                System.out.println("Top up your account with 80 tenge and get +1 GB of internet as a gift!\n");
            } else if (balance >= 200) {
                System.out.println("Activate roaming in 15 countries! Top up your account and get a 50% discount!\n");

            }
        }
        if (lang.equals("kz")) {
            if (balance < 50) {
                System.out.println("Есептік жазбаңызды қазір 100 теңгеге толтырыңыз және +500 минут сөйлесу уақытын алыңыз!");
            } else if (balance >= 50 && balance <= 200) {
                System.out.println("Шотты 80 тг-ге толтырыңыз және +1 ГБ интернет сыйлыққа алыңыз!");
            } else if (balance >= 200) {
                System.out.println("\n" + "15 елде роумингті қосыңыз! Есептік жазбаңызды толтырыңыз және 50% жеңілдік алыңыз!");
            }
        }
    }
}


//        int megabytes = Integer.parseInt(value);
//        if (megabytes >= 1024) {
//            int gigabyte = megabytes / 1024;
//            if (lang.equals("ru")) {
//                s = "Интернет " + gigabyte + " ГБ" + " (" + megabytes + "МБ)";
//            }
//            s = "Интернет " + megabytes + " МБ";
//        } else {
//            if (megabytes >= 1024) {
//                int gigabyte = megabytes / 1024;
//                if (lang.equals("en")) {
//                    s = "Internet " + gigabyte + " GB" + " (" + megabytes + "MB)";
//                } else {
//                    s = "Internet " + megabytes + " MB";
//                }
//            }


//   if (split[0].equals("balance")) {
//               double balance = Double.parseDouble(split[1]);
//               if (balance < 50) {
//                  System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
//                } else if (balance > 50 && balance <= 200) {
//                    System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
//                } else if (balance > 200) {
//                    System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");
//                }
// if (language.equals("ru")) {
//                            s = "Интернет " + gigabyte + " ГБ" + " (" + megabytes + "МБ)";
//                        } else {
//                            s = "Интернет " + megabytes + " МБ";
//                        }
//                        if (language.equals("en")) {
//                            s = "Internet" + gigabyte + " GB" + " (" + megabytes + "MB)";
//                        } else {
//                            s = "Internet" + megabytes + " MB";
//                        }
// if (key.equals("balance")) {
//                s = "Баланс = " + value + " тг";
//                balance = Double.parseDouble(value);
//            } else if (key.equals("minutes")) {
//                s = "Минута = " + value + " мин";
//            } else if (key.equals("roaming")) {
//                s = "Роуминг = " + value + " МБ";
//            } else if (key.equals("sms")) {
//                s = "СМС = " + value + " шт";
//            } else if (key.equals("tariff")) {
//                s = "Тариф = " + value;
//            }
//            System.out.println(s);
//        }
//if (value.equals("ru")) {
//                if (balance < 50) {
//                    System.out.println("Срочно пополните счет на 100 тг и получите +500 минут разговора!");
//                } else if (balance > 50 && balance <= 200) {
//                    System.out.println("Пополните счет на 80 тг и получите +1 ГБ интернета в подарок!");
//                } else if (balance >= 200) {
//                    System.out.println("Активируйте роуминг в 15 странах! Пополните счет и получите 50% скидку!");