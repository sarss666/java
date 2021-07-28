package test;

class OracleFactory implements AbstractFactory{
    public Connection creatConnection(){
        return (new OracleConnection());
    }
    public Statement creatStatement(){
        return (new OracleStatement());
    }
}

