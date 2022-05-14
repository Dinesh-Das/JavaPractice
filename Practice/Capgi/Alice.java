package Capgi;

public class Alice {
    public static void main(String[] args) {
        Encryption obj = new Encryption();
        System.out.println(obj.decodeMessage("oriGinal MessAge"));
        System.out.println(obj.encodeMessage("QWRT cvbN MnKL"));
    }
}

class Encryption {
    String vowels = "aeiou";
    String result = "";

    public String decodeMessage(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    continue;

            }
            result += str.charAt(i);
        }
        return result;
    }

    public String encodeMessage(String str) {
        String newString = "";
        for (int i = 0, j = 0; i < str.length(); i++) {

            newString += str.charAt(i) + "" + vowels.charAt(j);
            j++;
            if (j == vowels.length()) {
                j = 0;
            }

        }
        return newString;
    }
}