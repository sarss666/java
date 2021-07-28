package ÌøÆå;

import java.util.ArrayList;

public class Stock {
    protected ArrayList investors;
    private String stockName;
    private double price;

    public Stock(String stockName , double price){
        this.stockName = stockName;
        this.price = price;
        investors = new ArrayList<Inverstor>();
    }
    public void attach(Inverstor inverstor){
        investors.add(inverstor);
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double range = Math.abs(price - this.price) / this.price;
        this.price = price;
        if (range >= 0.05) {
            this.notifyInverstor();
        }
    }

    public void detach(Inverstor inverstor) {
        investors.remove(inverstor);
    }

    public void notifyInverstor(){
        for (Object obj : investors) {
            ((Inverstor)obj).Update(this);
        }
    }
}
