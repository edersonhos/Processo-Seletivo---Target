package src;

public class InventeString {
    public static StringBuilder inverter (String text){
        char[] textPadrao = text.toCharArray();
        StringBuilder textReverso = new StringBuilder("");
        for (int i = textPadrao.length-1; i >= 0; i--){
            textReverso.append(textPadrao[i]);
        }
        return textReverso;
    }
}
