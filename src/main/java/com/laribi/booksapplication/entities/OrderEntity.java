package com.laribi.booksapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
public class OrderEntity {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private  Long id ;

  private  Long bookId ;
  private  Integer quantity ;
  private  OffsetDateTime shipDate ;
  private  Boolean complete = false;

  /**
   **/
  public OrderEntity id(Long id) {
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
  public OrderEntity bookId(Long bookId) {
    this.bookId = bookId;
    return this;
  }

  

  public Long getBookId() {
    return bookId;
  }
  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

  /**
   **/
  public OrderEntity quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  

  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  public OrderEntity shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  

  public OffsetDateTime getShipDate() {
    return shipDate;
  }
  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  /**
   **/
  public OrderEntity complete(Boolean complete) {
    this.complete = complete;
    return this;
  }


  public Boolean isComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEntity orderEntity = (OrderEntity) o;
    return Objects.equals(id, orderEntity.id) &&
        Objects.equals(bookId, orderEntity.bookId) &&
        Objects.equals(quantity, orderEntity.quantity) &&
        Objects.equals(shipDate, orderEntity.shipDate) &&
        Objects.equals(complete, orderEntity.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bookId, quantity, shipDate, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

