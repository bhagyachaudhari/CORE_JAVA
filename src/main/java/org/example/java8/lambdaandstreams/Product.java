package org.example.java8.lambdaandstreams;

public class Product {
    int prodId;
    String prodName;

    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
