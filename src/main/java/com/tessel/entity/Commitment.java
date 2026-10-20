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
@Table(name="commitments")
@Getter
@Setter
public class Commitment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Long groupId;
	
	@Column(nullable = false)
	private Long userId;
	
	@Column(nullable = false)
	private Integer qty;
	
	@Column(insertable = false, updatable = false)
	private LocalDateTime createdAt;
}
