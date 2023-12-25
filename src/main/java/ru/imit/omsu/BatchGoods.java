package ru.imit.omsu;

public class BatchGoods {
    private final Packable[] goods;
    private final String description;
    public BatchGoods(String description, Packable ... goods){
        this.goods = goods;
        this.description = description;
    }

    public Packable[] getGoods() {
        return goods;
    }

    public float getMassBatch() {
        float allMass = 0;
        for (Packable good : goods) {
            allMass += good.getMassBrutto();
        }
        return allMass;
    }

    @Override
    public String toString(){
        return String.format("Партия товара <%s> [Масса всей партии = %f кг.]",
                this.description, this.getMassBatch());
    }
}
