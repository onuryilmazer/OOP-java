package week6.stringmenge;

import java.util.LinkedList;

public abstract class AbstrakteStringMenge implements StringMenge {
    protected LinkedList<String> Strings;

    public AbstrakteStringMenge() {
        Strings = new LinkedList<>();
    }

    @Override
    public int getCharCount() {
        int count = 0;

        for (String s : Strings) {
            count += s.length();
        }

        return count;
    }

    @Override
    public boolean isEmpty() {
        return (Strings.size() == 0);
    }

    @Override
    public void print() {
        for (String s : Strings) {
            System.out.print(s + " ");
        }
    }
}
