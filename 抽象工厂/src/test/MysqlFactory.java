package test;

class MysqlFactory implements AbstractFactory{
	@Override
    public Connection creatConnection(){
		// TODO Auto-generated method stub
        return (new MysqlConnection());
    }
	@Override
    public Statement creatStatement(){
		// TODO Auto-generated method stub
        return (new MysqlStatement());
    }

}

