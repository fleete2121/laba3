package ru.imit.omsu;

public class PackedUnitGood extends UnitGood implements Packable {

    protected PackageGood packageGood;
    public PackedUnitGood(String name, String Description, float weight, int countGoods, PackageGood packageGood) {
        super(name, Description, weight, countGoods);
        this.packageGood = packageGood;
    }

    public float getMassBrutto(){
        return this.getAllWeight() + this.packageGood.getWeight();
    }

    public float getMassNetto(){
        return this.getAllWeight();
    }

    @Override
    public String getName(){
        return this.Name;
    }

    @Override
    public String toString(){
        return String.format("Штучный Упакованный товар <%s> %d шт. %f кг.(вес 1 шт.) (%s) [Масса нетто = %f кг. Масса брутто = %f кг.]",
                this.Name, this.countGoods,  this.weightOneGood, this.Description, this.getMassNetto(),
                this.getMassBrutto());
    }
}
