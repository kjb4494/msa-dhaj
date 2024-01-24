package com.msa.dhaj.membership.application.service;

import com.msa.core.annotation.UseCase;
import com.msa.dhaj.membership.application.port.in.membership.MembershipModificationUseCase;
import com.msa.dhaj.membership.application.port.in.membership.dto.MembershipModificationCommand;
import com.msa.dhaj.membership.application.port.out.persistence.MembershipModificationPort;
import com.msa.dhaj.membership.domain.Membership;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@UseCase
@Transactional
@RequiredArgsConstructor
public class MembershipModificationService implements MembershipModificationUseCase {
    private final MembershipModificationPort membershipModificationPort;

    @Override
    public Membership modMembership(MembershipModificationCommand command) {
        return membershipModificationPort.modMembership(
                new Membership.MembershipId(command.getMembershipId()),
                new Membership.Name(command.getName()),
                new Membership.Address(command.getAddress()),
                new Membership.Email(command.getEmail()),
                new Membership.IsValid(command.isValid()),
                new Membership.IsCorp(command.isCorp())
        );
    }
}
