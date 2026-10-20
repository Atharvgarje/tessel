package com.tessel.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="price_tiers")
@Getter
@Setter
public class PriceTier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Long productId;
	
	@Column(nullable=false)
	private Integer minQty;
	
	@Column(nullable=false)
	private BigDecimal pricePerUnit;

}
