import java.util.List;

public class Main {
    public static void main(String[] argv) {
        String line = "ndwenciengbaegenqsongdujvagyoengqdougyaezgyamagungqhuqsiengjaeumafwngzguegdaemxgyuxmboxminghsiuhndaejroxnaeuzndwi";

        CYTokenizer tokenizer = new CuenghTokenizer();
        List<Word> lw = tokenizer.tokenize(line);
        for(int i = 0; i < lw.size(); i++) {
            System.out.println(lw.get(i));
        }
    }
}
