package 跳棋;

public class Client {
    
	public static void main(String[] args) {
        Stock haier = new Stock("青岛海尔",20.00);

        Inverstor inverstor1 = new ConcreteInvestor("杨过");
        Inverstor inverstor2 = new ConcreteInvestor("小龙女");

        haier.attach(inverstor1);
        haier.attach(inverstor2);

        haier.setPrice(25.00);

    }
}