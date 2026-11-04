package com.tessel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessel.entity.DemandGroup;
import com.tessel.entity.GroupStatus;

public interface DemandGroupRepository extends JpaRepository<DemandGroup, Long>{
	List<DemandGroup> findAllByStatus(GroupStatus status);
}
