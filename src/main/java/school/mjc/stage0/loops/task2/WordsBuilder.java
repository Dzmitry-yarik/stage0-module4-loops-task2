package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
           String s = "";
        int i = 0;
        while (i < chars.length && chars[i] != ' ') {
            s = s + chars[i];
            i++;
        }
        System.out.println(s);
    }
}
