package ����;

public class ConcreteInvestor implements Inverstor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }
    public void response(Stock stock) {
        System.out.print("��ʾ����" + name);
        System.out.print("-----��Ʊ��" + stock.getStockName());
        System.out.print("�۸񲨶����ȳ���5% ------");
        System.out.println("�¼۸��ǣ�" + stock.getPrice() + "��");
    }
	@Override
	public void Update(Stock stock) {
		// TODO Auto-generated method stub
		
	}
}
