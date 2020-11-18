package com.laribi.booksapplication.converters;

import com.laribi.booksapplication.entities.CategoryEntity;
import com.laribi.booksapplication.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryConverter {

    public Category toModel(CategoryEntity categoryEntity){
        final Category category = new Category();

        category.setName(categoryEntity.getName());
        category.setId(categoryEntity.getId());

        return category;

    }

    public CategoryEntity toEntity (Category category){
        final CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setName(category.getName());

        return categoryEntity;
    }

    public List<Category> toModelList(List<CategoryEntity> categoryEntityList){

        List<Category> returnedCategoryList = new ArrayList<Category>();

        Category category;
        for (final CategoryEntity categoryEntity : categoryEntityList) {
            category = this.toModel(categoryEntity);
            returnedCategoryList.add(category);
        }
        return returnedCategoryList;
    }

    public List<CategoryEntity> toEntitylList(List<Category> categoryList){

        List<CategoryEntity> returnedCategoryEntityList = new ArrayList<CategoryEntity>();

        CategoryEntity categoryEntity;
        for (final Category category : categoryList) {
            categoryEntity = this.toEntity(category);
            returnedCategoryEntityList.add(categoryEntity);
        }

        return returnedCategoryEntityList;
    }
}
