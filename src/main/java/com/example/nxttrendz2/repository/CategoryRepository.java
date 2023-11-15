/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz2.repository;

import com.example.nxttrendz2.model.Category;
import java.util.*;

public interface CategoryRepository {
    ArrayList<Category> getCategories();

    Category addCategory(Category category);

    Category getCategoryById(int categoryId);

    Category updateCategory(int categoryId, Category category);

    void deleteCategory(int categoryId);
}