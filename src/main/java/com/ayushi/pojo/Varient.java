package com.ayushi.pojo;

import javax.persistence.Table;

@Table(name = "varient")
public class Varient {
 private int id;
 private String color;
 private String size;
 private String product_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String product_id) {
	this.product_id = product_id;
}

@Override
public String toString() {	return "Product [id=" + id + ", color=" + color + ", size=" + size + ", prodbbuct_id=" + product_id + "]";

}


}
