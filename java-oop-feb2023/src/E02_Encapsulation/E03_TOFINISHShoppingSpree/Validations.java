package E02_Encapsulation.E03_TOFINISHShoppingSpree;


public class Validations {

    public static void validateName(String name){
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void validateMoney(double money){
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
