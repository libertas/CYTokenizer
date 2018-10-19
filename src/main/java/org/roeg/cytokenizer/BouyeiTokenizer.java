package org.roeg.cytokenizer;

public class BouyeiTokenizer extends CYTokenizer {

    @Override
    String getPatternString() {
        String mehsing = "(" +
                "{1,0}[bpmfwdtnlgkhjqxyzcsr]|" +
                "by|my|qy|gv|ngv|qv|" +
                "nd|mb|ng|ny" +
                ")";
        String mehyinh1 = "(" +
                "[aoeiu]|" +
                "eng|en|em|" +
                "ang|aang|an|aan|am|aam|au|ae|aau|ai|aai|ao|" +
                "ong|oong|on|oon|om|oom|oi|" +
                "eeng|eang|en|een|ean|em|eam|ei|er|" +
                "ing|iang|in|ian|im|iam|ie|iu|ia|io|iao|" +
                "ung|uang|un|uan|um|uam|ui|ue|ua|uai" +
                ")";
        String sangsing1 = "([lzxcshyfjq])";
        String mehyinh2 = "(" +
                "[aoeiu]|" +
                "aa|oo|ee|ea|ia|ua" +
                ")";
        String sangsing2 = "([bdg]|bt|dt|gt)";

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
