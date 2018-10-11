public class CuenghTokenizer extends CYTokenizer {

    @Override
    String getPatternString() {
        String mehsing = "(" +
                "{1,0}[bcdfghlmnrsvy]|" +
                "by|gy|my|ny|gv|" +
                "nd|mb" +
                ")";
        String mehyinh1 = "(" +
                "[aoewiu]|" +
                "eng|en|em|ei|" +
                "ang|aeng|an|aen|am|aem|au|aw|aeu|ae|ai|" +
                "ong|oeng|on|oen|om|oem|ou|oi|" +
                "wng|weng|wn|wen|wm|wem|wi|" +
                "ing|ieng|in|ien|im|iem|ie|iu|" +
                "ung|ueng|un|uen|um|uem|ui" +
                ")";
        String sangsing1 = "({1,0}[zjxqh])";
        String mehyinh2 = "(" +
                "[aoewiu]|" +
                "ae|oe|we|ie|ue" +
                ")";
        String sangsing2 = "([gkbpdt])";

        String pattern = mehsing + "(" + mehyinh2 + sangsing2 + "|" + mehyinh1 + sangsing1 + ")";

        return pattern;
    }
}
