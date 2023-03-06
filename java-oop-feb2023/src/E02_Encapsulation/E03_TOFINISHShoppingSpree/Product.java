package E02_Encapsulation.E03_TOFINISHShoppingSpree;

public class Product {
    //-	name: String
    //-	cost: double
    //+ 	Product (String,  double)
    //-	setCost (double): void
    //-	setName (String): void
    //+	getName(): String
    //+	getCost (): double

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);

    }

    private void setCost(double cost) {
        Validations.validateMoney(cost);
        this.cost = cost;
    }

    private void setName(String name) {
        Validations.validateName(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

}
