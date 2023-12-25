package ru.imit.omsu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Good apple = new Good("Яблоко", "Зеленое, спелое, вкусное");
        System.out.println(apple.toString());

        PackageGood packageApple = new PackageGood(0.3f, "Упаковка для яблок");
        System.out.println(packageApple.toString());

        UnitGood orange = new UnitGood("Апельсин", "Оранжевый, твердый, немного кислый", 0.3f, 13);
        System.out.println(orange.toString());

        WeightGood grape = new WeightGood("Виноград", "Зеленый, сладкий, маленький", 12.5f);
        System.out.println(grape.toString());


        PackedUnitGood onion = new PackedUnitGood
                ("Лук репчатый",
                        "Ядреный, круглый, большой",
                        0.15f,
                        120,
                        new PackageGood(.2f, "Упаковка для лука")
                );
        System.out.println(onion.toString());

        PackedWeightGood raisin = new PackedWeightGood(
                "Изюм",
                "Маленький, мягкий, сладкий",
                2f,
                new PackageGood(.3f, "Упаковка для изюма"));

        System.out.println(raisin.toString());

        PackedSetGoods setGoods = new PackedSetGoods(
                new PackageGood(2f, "Упаковка для овощей и фруктов"),
                raisin,
                onion
        );

        System.out.println(setGoods.toString());

        PackedSetGoods setGoods2 = new PackedSetGoods(
                new PackageGood(2f, "Упаковка для овощей и фруктов"),
                raisin,
                onion,
                setGoods
        );

        BatchGoods batchOfSets = new BatchGoods(
                "Наборы из овощей и фруктов",
                setGoods,
                setGoods2
        );
        System.out.println(batchOfSets.toString());


        //   2.2
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        System.out.println(res1);
        System.out.println(res2);

        System.out.println("=============");

        EndStringFilter filter3 = new EndStringFilter("раму");
        EndStringFilter filter4 = new EndStringFilter("мыла");
        boolean res3 = filter3.apply(str);
        boolean res4 = filter4.apply(str);
        System.out.println(res3);
        System.out.println(res4);

        System.out.println("=============");

        ContainsStringFilter filter5 = new ContainsStringFilter("раму");
        ContainsStringFilter filter6 = new ContainsStringFilter("Утюг");
        boolean res5 = filter5.apply(str);
        boolean res6 = filter6.apply(str);
        System.out.println(res5);
        System.out.println(res6);

        System.out.println("=============");

        // 3.1
        ServiceGoods sg = new ServiceGoods();
        ContainsStringFilter filter7 = new ContainsStringFilter("Упаковка");
        int countOfFilteredGoods = sg.countByFilter(batchOfSets, filter7);
        System.out.println(countOfFilteredGoods);

        // 3.2

        ContainsStringFilter filter8 = new ContainsStringFilter("Лук");
        boolean isCompleteFilter = sg.countByFilterDeep(batchOfSets, filter8);
        System.out.println(isCompleteFilter);

        // 3.3



    }

}
