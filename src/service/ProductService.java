package service;

import model.Product;
import repository.ProductRepository;

public class ProductService implements GeneralService<Product> {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] showList() {
        return productRepository.showList();
    }

    @Override
    public int size() {
        return productRepository.size();
    }

    @Override
    public void add(int index, Product product) {
        productRepository.add(index, product);
    }

    @Override
    public Product remove(int index) {
        return productRepository.remove(index);
    }

    @Override
    public Product set(int index, Product product) {
        return productRepository.set(index, product);
    }

    @Override
    public int find(String productName) {
        return productRepository.find(productName);
    }
    @Override
    public void sort() {
       productRepository.sort();
    }
}
