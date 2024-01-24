package com.msa.dhaj.membership.adapter.out.persistence.mapper;

import com.msa.dhaj.membership.adapter.out.persistence.entity.MembershipEntity;
import com.msa.dhaj.membership.domain.Membership;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {
    public static Membership mapToDomain(MembershipEntity membershipEntity) {
        return Membership.generateMember(
                new Membership.MembershipId(membershipEntity.getMembershipId()),
                new Membership.Name(membershipEntity.getName()),
                new Membership.Email(membershipEntity.getEmail()),
                new Membership.Address(membershipEntity.getAddress()),
                new Membership.IsValid(membershipEntity.isValid()),
                new Membership.IsCorp(membershipEntity.isCorp())
        );
    }
}
