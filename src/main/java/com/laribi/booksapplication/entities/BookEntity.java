package com.laribi.booksapplication.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class BookEntity {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id ;

  @ManyToOne(targetEntity = CategoryEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private CategoryEntity categoryEntity;

  private String name ;

  /**
   **/
  public BookEntity id(Long id) {
    this.id = id;
    return this;
  }


  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public BookEntity category(CategoryEntity categoryEntity) {
    this.categoryEntity = categoryEntity;
    return this;
  }


  public CategoryEntity getCategory() {
    return categoryEntity;
  }
  public void setCategory(CategoryEntity categoryEntity) {
    this.categoryEntity = categoryEntity;
  }

  /**
   **/
  public BookEntity name(String name) {
    this.name = name;
    return this;
  }


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookEntity book = (BookEntity) o;
    return Objects.equals(id, book.id) &&
        Objects.equals(categoryEntity, book.categoryEntity) &&
        Objects.equals(name, book.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryEntity, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(categoryEntity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

