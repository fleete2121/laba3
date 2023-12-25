package ru.imit.omsu;

public class UnitGood extends Good{
    protected float weightOneGood;
    protected int countGoods;
    public UnitGood(String name, String Description, float weight, int countGoods) {
        super(name, Description);
        this.weightOneGood = weight;
        this.countGoods = countGoods;
    }

    public int getCountGoods(){
        return this.countGoods;
    }

    public float getAllWeight(){
        return this.countGoods * this.weightOneGood;
    }

    @Override
    public String toString(){
        return String.format("Штучный товар <%s> %d шт. %f кг.(вес 1 шт.) (%s)",
                this.Name, this.countGoods,  this.weightOneGood, this.Description);
    }
}
