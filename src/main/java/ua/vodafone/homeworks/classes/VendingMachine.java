package ua.vodafone.homeworks.classes;

public class VendingMachine {
    enum Drinks {
        COFFEE(1, "coffee", 40),
        TEA(2, "tea", 30),
        LEMONADE(3, "lemonade", 35),
        MOJITO(4, "mojito", 50.5),
        CARBONATED_WATER(5, "carbonated water", 25),
        COCA_COLA(6, "coca cola", 38);
        private final int order;
        private final String name;
        private final double price;

        Drinks(int order, String name, double price) {
            this.order = order;
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getOrder() {
            return order;
        }

        @Override
        public String toString() {
            return order + " " + name + " " + price;
        }
    }

    String chooseDrinks(Drinks drink) {
        switch (drink) {
            case COFFEE:
                return "Making " + drink.getName() + "...";
            case TEA:
                return "Making " + drink.getName() + "...";
            case LEMONADE:
                return drink.getName() + " dispensed...";
            case MOJITO:
                return "Making " + drink.getName() + "...";
            case CARBONATED_WATER:
                return drink.getName() + " dispensed...";
            case COCA_COLA:
                return drink.getName() + " dispensed...";
        }
        return null;
    }


}
