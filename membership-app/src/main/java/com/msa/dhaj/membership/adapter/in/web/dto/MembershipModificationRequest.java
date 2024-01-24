package com.msa.dhaj.membership.adapter.in.web.dto;

public record MembershipModificationRequest(
        String name,
        String address,
        String email,
        boolean isValid,
        boolean isCorp
) { }
