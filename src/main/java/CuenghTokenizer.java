public class CuenghTokenizer extends CYTokenizer {

    @Override
    String getPatternString() {
        String mehsing = "(" +
                "{1,0}[bcdfghlmnrsvy]|" +
                "by|gy|my|ny|gv|ng|ngv|" +
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

    @Override
    Word getWordFromRMatcher(RMatcher m) {
        String mehsing = m.group(6);
        String mehyinh;
        String tone;

        if(m.group(3) != null) {
            mehyinh = m.group(3);
        } else {
            mehyinh = m.group(5);
        }

        if(m.group(2) != null) {
            tone = m.group(2);
        } else {
            tone = m.group(4);
        }

        return new Word(mehsing, mehyinh, tone);
    }
}
