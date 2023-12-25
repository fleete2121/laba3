package ru.imit.omsu;

public class PackedWeightGood extends WeightGood implements Packable{

    protected  PackageGood packageGood;
    public PackedWeightGood(String name, String Description, float weight, PackageGood packageGood) {
        super(name, Description, weight);
        this.packageGood = packageGood;
    }


    public float getMassNetto(){
        return this.weight;
    }

    public float getMassBrutto(){
        return this.weight + this.packageGood.getWeight();
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String toString(){
        return String.format("Упакованный <%s> %f кг. (%s) [Масса нетто = %f кг., Масса брутто = %f кг.]",
                this.Name, this.weight, this.Description, this.getMassNetto(), getMassBrutto());
    }



}
