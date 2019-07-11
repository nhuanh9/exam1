package controller;

import model.Product;
import service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public Product[] showList() {
        return productService.showList();
    }

    public int size() {
        return productService.size();
    }

    public void add(int index, Product product) {
        productService.add(index, product);
    }

    public Product remove(int index) {
        return productService.remove(index);
    }

    public Product set(int index, Product product) {
        return productService.set(index, product);
    }

    public int find(String productName) {
        return productService.find(productName);
    }
    public void sort(){
        productService.sort();
    }
}
