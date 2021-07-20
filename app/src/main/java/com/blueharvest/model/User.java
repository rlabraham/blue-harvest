package com.blueharvest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Long userID;

    @Column(name = "user_id_name")
    private String userIDName;

    private String familyName;

    private String givenName;

    private String gender;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String homeCity;

    private String profession;

    @Type(type = "text")
    private String summary;

    @Column(name = "billing_id")
    private Long billingID;
}
