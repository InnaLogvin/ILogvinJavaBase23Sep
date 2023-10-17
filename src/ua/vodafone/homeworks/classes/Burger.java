package ua.vodafone.homeworks.classes;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String mayo;
    private String greens;

    public Burger(String bun, String meat, String cheese, String mayo, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.mayo = mayo;
        this.greens = greens;
        System.out.println("Your general burger contains: " + bun + ", " + meat + ", " +
                cheese + ", " + mayo + ", " +
                greens);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Your diet burger contains: " + bun + ", " + meat + ", " +
                cheese + ", " +
                greens);
    }

    public Burger(String bun, String meat, String additionalMeet, String cheese, String mayo, String greens) {
        this.bun = bun;
        this.meat = meat + " and " + additionalMeet;
        this.cheese = cheese;
        this.mayo = mayo;
        this.greens = greens;
        System.out.println("Your double burger contains: " + bun + ", " + meat + ", " + additionalMeet + ", " +
                cheese + ", " + mayo + ", " +
                greens);
    }

    public static class BurgerMain {
        public static void main(String[] args) {
            Burger generalBurger = new Burger("milk bread", "beef", "cheddar", "garlic mayo", "lettuce");
            Burger dietBurger = new Burger("sesame bun", "chicken", "swiss cheese", "salad");
            Burger doubleBurger = new Burger("milk bun", "pork", "bacon", "emmental", "traditional mayo", "salad");

        }

    }
}



