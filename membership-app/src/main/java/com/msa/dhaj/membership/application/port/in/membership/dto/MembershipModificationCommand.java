package com.msa.dhaj.membership.application.port.in.membership.dto;

import com.msa.core.util.SelfValidating;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MembershipModificationCommand extends SelfValidating<MembershipModificationCommand> {
    @NotNull
    private final long membershipId;

    @NotBlank
    private final String name;

    @NotBlank
    private final String email;

    @NotBlank
    private final String address;

    private final boolean isValid;

    private final boolean isCorp;

    @Builder
    public MembershipModificationCommand(long membershipId, String name, String email, String address, boolean isValid, boolean isCorp) {
        this.membershipId = membershipId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
        this.isCorp = isCorp;

        this.validateSelf();
    }
}
