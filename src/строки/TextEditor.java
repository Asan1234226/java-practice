package строки;

import java.util.Locale;

public class TextEditor {
    private boolean isCapsLock = false;


        public void CapsLock() {
            isCapsLock = true;

        }
        public void print(String str){
            if (isCapsLock == false) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.println(str.toLowerCase());
            }
        }
    }

