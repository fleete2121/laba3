package ru.imit.omsu;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ServiceGoodsTest extends TestCase {

    public void testCheckAllWeighted() {
        ServiceGoods sg = new ServiceGoods();
        PackedWeightGood grape2 = new PackedWeightGood("Виноград",
                "Зеленый",
                12.5f,
                new PackageGood(.3f, "для винограда")
        );

        PackedWeightGood grape3 = new PackedWeightGood("Виноград",
                "Красный",
                5.55f,
                new PackageGood(.5f, "для винограда красного")
        );

        BatchGoods batchOfWeightGoods = new BatchGoods(
                "Партия только весового товара",
                grape3,
                grape2
        );

        boolean expected = true;
        boolean actual = sg.checkAllWeighted(batchOfWeightGoods);
        assertEquals(expected, actual);
    }
}