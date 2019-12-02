package com.ustglobal.retailerspringmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Order")
public class Order {
@Id
@Column
@GeneratedValue
private int order_id;
@Column
private String product_name;
@Column
private int price_per_unit;
@Column
private int quantity;
@Column
private int amount_payable;
@Column
private int retailer_id;
/*@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="retailer_id",nullable=false)
private RetailerBean RetailerBean;*/

}
