package com.msa.dhaj.membership.adapter.in.web.controller;

import com.msa.dhaj.membership.adapter.in.web.dto.MembershipModificationRequest;
import com.msa.dhaj.membership.application.port.in.membership.MembershipModificationUseCase;
import com.msa.dhaj.membership.application.port.in.membership.dto.MembershipModificationCommand;
import com.msa.dhaj.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class MembershipController {
    private final MembershipModificationUseCase membershipModificationUseCase;

    @PutMapping("/{membershipId}")
    public ResponseEntity<Membership> modMembership(@PathVariable long membershipId, @RequestBody MembershipModificationRequest req) {
        MembershipModificationCommand command = MembershipModificationCommand.builder()
                .membershipId(membershipId)
                .name(req.name())
                .address(req.address())
                .email(req.email())
                .isValid(req.isValid())
                .isCorp(req.isCorp())
                .build();

        return ResponseEntity.ok(membershipModificationUseCase.modMembership(command));
    }
}
