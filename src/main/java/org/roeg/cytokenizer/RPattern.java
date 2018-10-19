package org.roeg.cytokenizer;

import java.util.regex.Pattern;

public final class RPattern {
    private Pattern pattern = null;

    public RPattern() {

    }

    // Because the method is very simple, any "$" in the src will be wrongly replaced
    private String swap(String src, String s1, String s2) {
        return src.replace(s1, "$").replace(s2, s1).replace("$", s2);
    }

    public RPattern compile(String input) {
        input = swap(input, "(", ")");
        input = swap(input, "[", "]");
        input = swap(input, "{", "}");
        input = new StringBuilder(input).reverse().toString();

        pattern = Pattern.compile(input);
        return this;
    }

    public RMatcher rmatcher(CharSequence input) {
        return new RMatcher(pattern, input);
    }
}
