package passphrase;


public class PassphraseEncoder {

    public static String encode(String rawPassphrase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rawPassphrase.length(); i++) {
            char c = rawPassphrase.charAt(i);
            if (Character.isUpperCase(c)) {
                c += 32;
            } else if (Character.isLowerCase(c)) {
                c -= 32;
            }else {
                c=c;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decode(String encodedPassphrase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encodedPassphrase.length(); i++) {
            char c = encodedPassphrase.charAt(i);
            if (Character.isUpperCase(c)) {
                c += 32;
            } else if (Character.isLowerCase(c)) {
                c -= 32;
            }else {
                c=c;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
