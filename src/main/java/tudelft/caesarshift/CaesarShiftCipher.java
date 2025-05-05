package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        int length = message.length();

        shift = shift % 26;

        for (int i = 0; i < length; i++) {
            char currentChar = message.charAt(i);

            if (currentChar != ' ' && (currentChar < 'a' || currentChar > 'z')) {
                return "invalid";
            }

            if (currentChar == ' ') {
                sb.append(' ');
            } else {
                char shifted = (char) ((currentChar - 'a' + shift + 26) % 26 + 'a');
                sb.append(shifted);
            }
        }

        return sb.toString();
    }
}