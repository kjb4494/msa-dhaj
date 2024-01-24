package com.msa.dhaj.membership.adapter.out.persistence.entity;

import com.msa.dhaj.membership.domain.Membership;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "membership")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class MembershipEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long membershipId;

    private String name;

    private String address;

    private String email;

    private boolean isValid;

    private boolean isCorp;

    public void updateMembership(
            Membership.Name name,
            Membership.Address address,
            Membership.Email email,
            Membership.IsValid isValid,
            Membership.IsCorp isCorp
    ) {
        this.name = name.getName();
        this.address = address.getAddress();
        this.email = email.getEmail();
        this.isValid = isValid.isValid();
        this.isCorp = isCorp.isCorp();
    }
}
