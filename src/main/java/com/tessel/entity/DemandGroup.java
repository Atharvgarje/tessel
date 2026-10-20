package com.tessel.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="demand_groups")
@Getter
@Setter
public class DemandGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Long productId;
	
	@Column(nullable = false)
	private String area;
	
	@Column(nullable = false)
	private Integer targetQty;
	
	@Column(nullable = false)
	private Integer currentQty=0;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private GroupStatus status=GroupStatus.OPEN;
	
	@Column(insertable = false,updatable = false)
	private LocalDateTime createdAt;
}
