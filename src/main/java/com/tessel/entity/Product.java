package com.tessel.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private String category;
	
	@Column(nullable = false)
	private String unit="METER";
	
	@Column
	private String description;
	
	@Column
	private String imageUrl;
	
	@Column(insertable = false,updatable = false)
	private LocalDateTime createdAt;

}
