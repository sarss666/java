package ����;

public class Client {
    
	public static void main(String[] args) {
        Stock haier = new Stock("�ൺ����",20.00);

        Inverstor inverstor1 = new ConcreteInvestor("���");
        Inverstor inverstor2 = new ConcreteInvestor("С��Ů");

        haier.attach(inverstor1);
        haier.attach(inverstor2);

        haier.setPrice(25.00);

    }
}