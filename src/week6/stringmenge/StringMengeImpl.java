package week6.stringmenge;

public class StringMengeImpl extends AbstrakteStringMenge implements StringMenge {
    @Override
    public boolean contains(String s) {
        if (Strings.contains(s)) { //Checks using s.equals(element), okay for strings.
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void add(String s) {
        if(!contains(s)) {
            Strings.add(s);
        }
        else {
            //System.out.println("String is already in the set.");
        }
    }

    @Override
    public void remove(String s) {
        if (!Strings.remove(s)) { //method returns true if passed argument is found & removed.
            System.out.println("String couldn't be found in the set.");
        }
    }

    @Override
    public int getSize() {
        return Strings.size();
    }

    @Override
    public String[] getElements() {
        return Strings.toArray(new String[Strings.size()]);
    }
}
