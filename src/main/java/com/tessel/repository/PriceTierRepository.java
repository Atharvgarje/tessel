package com.tessel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessel.entity.PriceTier;

public interface PriceTierRepository extends JpaRepository<PriceTier, Long>{
	List<PriceTier> findAllByProductId(Long productId);
}
