package com.tessel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessel.entity.Commitment;

public interface CommitmentRepository extends JpaRepository<Commitment, Long> {
	List<Commitment>findAllByGroupId(Long groupId);
}
