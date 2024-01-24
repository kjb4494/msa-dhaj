package com.msa.dhaj.membership.application.port.in.membership;

import com.msa.dhaj.membership.application.port.in.membership.dto.MembershipModificationCommand;
import com.msa.dhaj.membership.domain.Membership;

public interface MembershipModificationUseCase {
    Membership modMembership(MembershipModificationCommand command);
}
