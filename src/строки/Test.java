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
        String[] str1 = response.split("=");

        for (String s : str) {
            if (str1.equals("0")) {
                continue;
            }
            System.out.println(s);
        }
        if (str1.equals("50")) {
            System.out.println("");
        }
    }
}


