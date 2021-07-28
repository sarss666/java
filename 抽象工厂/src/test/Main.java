package test;

public class Main {
	public static void main(String[] args){
		System.out.println("提示股民:杨过----- 股票:青岛海尔价格波动幅度超过5% ----新价格是: 25. 0。");
	    System.out.println("提示股民:小龙女-----股票:青岛海尔价格波动幅度超过5%-----新价格是: 25.0。");
	   
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
