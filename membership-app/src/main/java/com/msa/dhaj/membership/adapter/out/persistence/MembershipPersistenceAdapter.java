package com.msa.dhaj.membership.adapter.out.persistence;

import com.msa.core.annotation.PersistenceAdapter;
import com.msa.dhaj.membership.adapter.out.persistence.entity.MembershipEntity;
import com.msa.dhaj.membership.adapter.out.persistence.mapper.MembershipMapper;
import com.msa.dhaj.membership.adapter.out.persistence.repository.MembershipRepository;
import com.msa.dhaj.membership.application.port.out.persistence.MembershipModificationPort;
import com.msa.dhaj.membership.domain.Membership;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements MembershipModificationPort {
    private final MembershipRepository membershipRepository;

    @Override
    public Membership modMembership(Membership.MembershipId membershipId, Membership.Name name, Membership.Address address, Membership.Email email, Membership.IsValid isValid, Membership.IsCorp isCorp) {
        MembershipEntity entity = membershipRepository.findById(membershipId.getMembershipId()).orElseThrow();
        entity.updateMembership(name, address, email, isValid, isCorp);
        return MembershipMapper.mapToDomain(entity);
    }
}
