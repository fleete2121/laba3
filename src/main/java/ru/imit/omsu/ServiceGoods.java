package ru.imit.omsu;

public class ServiceGoods {
    public int countByFilter(BatchGoods batch, Filterable filter){
        int count = 0;
        for (Packable good : batch.getGoods()) {
            if (filter.apply(good.getName())) {
                count++;
            }
        }
        return count;
    }

    public boolean countByFilterDeep(BatchGoods batch, Filterable filter){

        for (Packable good : batch.getGoods()) {
            if (good instanceof PackedSetGoods){
                Packable[] goodsInSet = ((PackedSetGoods) good).getGoods();
                for (Packable goodInSet: goodsInSet) {
                    if (filter.apply(goodInSet.getName())) return true;
                }
            }
        }

       return false;
    }

    public boolean checkAllWeighted(BatchGoods batch){
        int countGoodsInBatch = batch.getGoods().length;
        int countWeightGood = 0;
        for (Packable good : batch.getGoods()) {
            if (good instanceof PackedWeightGood) countWeightGood++;
        }
        return countWeightGood == countGoodsInBatch;
    }
}
