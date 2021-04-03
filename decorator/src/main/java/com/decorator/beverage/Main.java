package com.decorator.beverage;

public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getFullDescription());

        espresso.setSize(Beverage.Size.LARGE);

        Beverage espressoWithMocha = new Mocha(espresso);
        System.out.println(espressoWithMocha.getFullDescription());

        Beverage espressoDoubleMocha = new Mocha(espressoWithMocha);
        System.out.println(espressoDoubleMocha.getFullDescription());

        Beverage espressoDoubleMochaSoy = new Soy(espressoDoubleMocha);
        System.out.println(espressoDoubleMochaSoy.getFullDescription());
    }

}
