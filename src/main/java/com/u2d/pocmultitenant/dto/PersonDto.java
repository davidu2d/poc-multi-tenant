package com.u2d.pocmultitenant.dto;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -1261602345458288505L;

    private String name;
}
