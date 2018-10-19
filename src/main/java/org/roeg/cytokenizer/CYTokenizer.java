package org.roeg.cytokenizer;

import java.util.LinkedList;
import java.util.List;

public abstract class CYTokenizer {
    private RPattern rpattern;

    public CYTokenizer() {
        rpattern = new RPattern();
        rpattern.compile(getPatternString());
    }

    abstract String getPatternString();

    abstract Word getWordFromRMatcher(RMatcher m);

    public List<Word> tokenize(String input) {

        RPattern r = this.rpattern;

        List<Word> ans = new LinkedList<Word>();

        while(!input.equals("")) {
            RMatcher m = r.rmatcher(input);
            if (m.find( )) {
                ans.add(0, getWordFromRMatcher(m));

                input = input.substring(0, input.length() - m.end(0));
            } else {
                System.out.println("NO MATCH FOR:" + input);
                input = input.substring(1);
            }
        }

        return ans;
    }
}
