package com.msa.dhaj.membership.application.port.out.persistence;

import com.msa.dhaj.membership.domain.Membership;

public interface MembershipModificationPort {
    Membership modMembership(
            Membership.MembershipId membershipId,
            Membership.Name name,
            Membership.Address address,
            Membership.Email email,
            Membership.IsValid isValid,
            Membership.IsCorp isCorp
    );
}
