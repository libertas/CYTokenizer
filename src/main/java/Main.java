import java.util.List;

public class Main {
    public static void main(String[] argv) {
        String line = "ndwenciengbaegenqsongdujvagyoengqdougyaezgyamagungqhuqsiengjaeumafwngzguegdaemxgyuxmboxminghsiuhndaejroxnaeuzndwi";

        CYTokenizer tokenizer = new CuenghTokenizer();
        List<Word> lw = tokenizer.tokenize(line);
        for(int i = 0; i < lw.size(); i++) {
            System.out.print(lw.get(i) + " ");
        }
        System.out.println();

        String line1 = "ndianlxianglbailgeenssoonglducwaljongsduljaizjalmalgungshussiangc'aulmalfengzguagdamxjuxmboxminghsiuhndaicroxnauzndeil";
        CYTokenizer tokenizer1 = new BouyeiTokenizer();
        List<Word> lw1 = tokenizer1.tokenize(line1);
        for(int i = 0; i < lw1.size(); i++) {
            System.out.print(lw1.get(i) + " ");
        }
        System.out.println();
    }
}
