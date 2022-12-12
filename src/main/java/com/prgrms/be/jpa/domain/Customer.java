package com.prgrms.be.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @NotNull
    private Long id;

    @NotNull
    @Size(min = 1, max = 5, message = "이름을 1 ~ 5자 이내로 입력해주세요.")
    @NotBlank(message = "이름을 입력해주세요.")
    private String firstName;

    @NotNull
    @Size(min = 1, max = 2, message = "성을 1 ~ 2자 이내로 입력해주세요.")
    @NotBlank(message = "성을 입력해주세요.")
    private String lastName;
}
