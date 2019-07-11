package repository;

import model.Product;

import java.util.Arrays;

public class ProductRepository implements GeneralRepository<Product> {

    Product[] listProduct = new Product[SIZE];

    {
        listProduct[0] = new Product("1", "Samsung", 1000000, "Hello");
        listProduct[1] = new Product("2", "Iphone", 1000000, "Hello");
        listProduct[2] = new Product("3", "OPPO", 1000000, "Hello");
    }

    @Override
    public Product[] showList() {
        return listProduct;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < SIZE; i++) {
            if (listProduct[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public void add(int index, Product product) {
        listProduct[index] = product;
        for (int i = index + 1; i < SIZE - 1; i++) {
            listProduct[i] = listProduct[i + 1];
        }
    }

    @Override
    public Product remove(int index) {
        Product temp = listProduct[index];
        for (int i = index; i < SIZE - 1; i++) {
            listProduct[i] = listProduct[i + 1];
        }
        return temp;
    }

    @Override
    public Product set(int index, Product product) {
        listProduct[index] = product;
        return listProduct[index];
    }

    @Override
    public int find(String productName) {
        int index = -1;
        for (int i = 0; i < listProduct.length; i++) {
            try {
                if (productName.equals(listProduct[i].getName())) {
                    index = i;
                    break;
                }
            } catch (NullPointerException e) {
                index = -1;
            }

        }
        return index;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                if (listProduct[i].getName().compareTo( listProduct[j].getName())>0){
                    Product product = new Product();
                    product = listProduct[i];
                    listProduct[i] = listProduct[j];
                    listProduct[j]= product;
                }
            }
        }
    }
}