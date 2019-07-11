import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        int index;
        int size = productController.size();
        Product[] listProduct = productController.showList();
        do {
            menu();
            Scanner input = new Scanner(System.in);
            System.out.println("Ban chon so may:");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < listProduct.length; i++) {
                        if (listProduct[i] != null) {
                            System.out.println(listProduct[i].toString());
                        }
                    }
                    break;
                }
                case 2: {
                    Product product = new Product();
                    System.out.println("Nhap vi tri ban muon them:");
                    index = input.nextInt();
                    if (index < 0 && index >= size) {
                        System.out.println("Full");
                        break;
                    }
                    System.out.println("Nhap thong tin san pham can them:");
                    product.setProduct();
                    productController.add(index, product);
                    size++;
                    break;
                }
                case 3: {
                    System.out.println("Nhap vi tri ban muon xoa:");
                    index = input.nextInt();
                    if (index < 0 && index >= size) {
                        System.out.println("Vi tri xoa khong hop le");
                        break;
                    }
                    productController.remove(index);
                    size--;
                    break;
                }
                case 4: {
                    System.out.println("So luong san pham hien tai:" + size);
                    break;
                }
                case 5: {
                    System.out.println("Nhap vi tri ban muon thay doi noi dung:");
                    index = input.nextInt();
                    if (index < 0 && index >= size) {
                        System.out.println("Vi tri chinh sua khong hop le");
                        break;
                    }
                    Product product = new Product();
                    System.out.println("Nhap thong tin san pham can them:");
                    product.setProduct();
                    productController.set(index, product);
                }
                case 6: {
                    input.nextLine();
                    System.out.println("Nhap ten san pham ban can tim kiem:");
                    String productName = input.nextLine();
                    index = productController.find(productName);
                    if (index == -1) {
                        System.out.println("Khong tim thay san pham");
                    } else {
                        System.out.println("San pham can tim la:");
                        System.out.println(listProduct[index].toString());
                    }
                    break;
                }
                case 7: {
                    System.out.println("Danh sach san pham sau khi sap xep la:");
                    productController.sort();
                    listProduct = productController.showList();
                    for (int i = 0; i < listProduct.length; i++) {
                        if (listProduct[i] != null) {
                            System.out.println(listProduct[i].toString());
                        }
                    }
                    break;
                }
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("\n");
        System.out.println("-----Quan ly san pham-----");
        System.out.println("1. Danh sach san pham ");
        System.out.println("2. Them san pham");
        System.out.println("3. Xoa san pham");
        System.out.println("4. So luong san pham hien tai");
        System.out.println("5. Sua thong tin san pham");
        System.out.println("6. Tim kiem san pham");
        System.out.println("7. Sap xep san pham");
        System.out.println("0. Thoat");
    }
}

