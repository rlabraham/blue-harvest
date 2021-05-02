package com.blueharvest.model;

import com.blueharvest.model.gender.Gender;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "givenname")
    private String givenName;

    @Column(name="familyname")
    private String familyName;

    @Column(name="middlename")
    private String middleName;

    private String salutations;

    @Temporal(TemporalType.DATE)
    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    @Type(type="text")
    private String description;

    @Column(columnDefinition = "ENUM('male', 'female', 'transfemale', 'transmale', 'nonbinary')")
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
