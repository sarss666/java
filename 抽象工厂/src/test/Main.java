package test;

public class Main {
	public static void main(String[] args){
		System.out.println("��ʾ����:���----- ��Ʊ:�ൺ�����۸񲨶����ȳ���5% ----�¼۸���: 25. 0��");
	    System.out.println("��ʾ����:С��Ů-----��Ʊ:�ൺ�����۸񲨶����ȳ���5%-----�¼۸���: 25.0��");
	   
	    AbstractFactory mysqlFactory = new MysqlFactory();
	    Connection mysqlConnection = mysqlFactory.creatConnection();
	    Statement  mysqlStatement  = mysqlFactory.creatStatement();
	    mysqlConnection.getConnection();
	    mysqlStatement.getStatement();
	    
	    System.out.println("");
	    
	    AbstractFactory oracleFactory = new OracleFactory();
	    Connection oracleConnection = oracleFactory.creatConnection();
	    Statement  oracleStatement  = oracleFactory.creatStatement();
	    oracleConnection.getConnection();
	    oracleStatement.getStatement();
	}
	
}
