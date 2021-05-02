package com.blueharvest.model.gender;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE ("male"),
    FEMALE ("female"),
    TRANSFEMALE ("trans-female"),
    TRANSMALE ("trans-male"),
    NONBINBARY ("non-binary");

    private final String genderName;
}
