package ru.imit.omsu;

public class ContainsStringFilter implements Filterable {

    private String pattern;
    public ContainsStringFilter(String pattern){
        this.pattern = pattern;
    }
    @Override
    public boolean apply(String s) {
        return s.contains(pattern);
    }
}
