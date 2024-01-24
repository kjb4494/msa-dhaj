package com.msa.dhaj.membership.domain;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {
    private final long membershipId;

    private final String name;

    private final String email;

    private final String address;

    private final boolean isValid;

    private final boolean isCorp;

    public static Membership generateMember(
            MembershipId membershipId,
            Name name,
            Email email,
            Address address,
            IsValid isValid,
            IsCorp isCorp
    ) {
        return new Membership(
                membershipId.membershipId,
                name.name,
                email.email,
                address.address,
                isValid.isValid,
                isCorp.isCorp
        );
    }

    @Value
    public static class MembershipId {
        public MembershipId(long value) {
            membershipId = value;
        }

        long membershipId;
    }

    @Value
    public static class Name {
        public Name(String value) {
            name = value;
        }

        String name;
    }

    @Value
    public static class Email {
        public Email(String value) {
            email = value;
        }

        String email;
    }

    @Value
    public static class Address {
        public Address(String value) {
            address = value;
        }

        String address;
    }

    @Value
    public static class IsValid {
        public IsValid(boolean value) {
            isValid = value;
        }

        boolean isValid;
    }

    @Value
    public static class IsCorp {
        public IsCorp(boolean value) {
            isCorp = value;
        }

        boolean isCorp;
    }
}
