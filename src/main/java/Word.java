public class Word {
    private String mehsing, mehyinh, tone;

    public Word(String mehsing, String mehyinh, String tone) {
        this.mehsing = mehsing;
        this.mehyinh = mehyinh;
        this.tone = tone;
    }

    public String getMehsing() {
        return mehsing;
    }

    public String getMehyinh() {
        return mehyinh;
    }

    public String getTone() {
        return tone;
    }

    public String toString() {
        return mehsing + mehyinh + tone;
    }
}
