package ru.imit.omsu;

public class EndStringFilter implements Filterable {

    private String pattern;
    public EndStringFilter(String pattern){
        this.pattern = pattern;
    }
    @Override
    public boolean apply(String s) {
        return s.endsWith(pattern);
    }
}