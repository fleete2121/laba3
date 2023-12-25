package ru.imit.omsu;

public class PackageGood {

    public float getWeight() {
        return weight;
    }

    private final float weight;
    public String PackageName;

    public PackageGood(float weight, String packageName){
        this.weight = weight;
        this.PackageName = packageName;
    }


    @Override
    public String toString() {
        return String.format("<%s> %f кг.", this.PackageName, this.weight);
    }
}
