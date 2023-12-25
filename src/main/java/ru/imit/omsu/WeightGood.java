package ru.imit.omsu;

public class WeightGood extends Good {
    protected  float weight;
    public WeightGood(String name, String Description, float weight) {
        super(name, Description);
        this.weight = weight;
    }
    @Override
    public String toString(){
        return String.format("Весовой товар <%s> %f кг. (%s)", this.Name, this.weight, this.Description);
    }
}
