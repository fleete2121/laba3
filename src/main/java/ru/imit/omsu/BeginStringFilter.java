package ru.imit.omsu;

public class BeginStringFilter implements Filterable {

    private String pattern;
    public BeginStringFilter(String pattern){
        this.pattern = pattern;
    }
    @Override
    public boolean apply(String s) {
        return s.startsWith(pattern);
    }
}
