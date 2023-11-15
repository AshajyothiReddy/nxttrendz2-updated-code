/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz2.repository;

import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.model.Category;
import java.util.*;

public interface ProductRepository {
    ArrayList<Product> getProducts();

    Product addProduct(Product product);

    Product getProductById(int productId);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);

    Category getProductCategory(int productId);
}