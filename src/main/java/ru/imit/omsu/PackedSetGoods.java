package ru.imit.omsu;

public class PackedSetGoods implements Packable{
    private Packable[] goods;
    private PackageGood packageGood;


    public PackedSetGoods(PackageGood packageGood, Packable ... goods){
        this.packageGood = packageGood;
        this.goods = goods;
    }

    public Packable[] getGoods(){
        return this.goods;
    }

    @Override
    public String getName(){
        return this.packageGood.PackageName;
    }
    @Override
    public float getMassNetto(){
        float allMass = 0;
        for (Packable good : goods) {
            allMass += good.getMassBrutto();
        }
        return allMass;
    }

    @Override
    public float getMassBrutto() {
        return this.getMassNetto() + this.packageGood.getWeight();
    }

    @Override
    public String toString(){
        return String.format("Набор <%s> %f кг. [Масса нетто = %f кг., Масса брутто = %f кг.]",
                this.packageGood.PackageName, this.packageGood.getWeight(), this.getMassNetto(), getMassBrutto());
    }
}
