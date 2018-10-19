package org.roeg.cytokenizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RMatcher {
    private Pattern pattern;
    private CharSequence text;
    private Matcher matcher;

    public RMatcher(Pattern pattern, CharSequence input) {
        this.pattern = pattern;
        this.text = new StringBuilder(input).reverse().toString();
        this.matcher = pattern.matcher(this.text);
    }

    public boolean find() {
        return this.matcher.find();
    }

    public String group(int group) {
        String ans = this.matcher.group(group);
        if(ans == null) {
            return ans;
        }
        return new StringBuilder(ans).reverse().toString();
    }

    public int end(int group) {
        return this.matcher.end(group);
    }
}
