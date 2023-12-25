package ru.imit.omsu;

public class Good {
    public String Name, Description;
    public Good(String name, String Description){
        this.Name = name;
        this.Description = Description;
    }

    @Override
    public String toString() {
        return String.format("<%s> %s", this.Name, this.Description);
    }
}
