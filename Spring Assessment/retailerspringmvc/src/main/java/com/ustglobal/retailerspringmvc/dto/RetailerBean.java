package com.ustglobal.retailerspringmvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RetailerBean")
public class RetailerBean {
@GeneratedValue
@Column
@Id
private int retailer_id;
@Column
private String name;
@Column
private String email;
@Column
private String password;
/*@OneToMany(mappedBy="RetailerBean")
private List<Order> Order;*/

}
