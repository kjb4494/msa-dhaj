package com.msa.dhaj.membership.adapter.out.persistence.repository;

import com.msa.dhaj.membership.adapter.out.persistence.entity.MembershipEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<MembershipEntity, Long> {
}
