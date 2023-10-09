package com.example.Natwest.cashwavebackend.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Document(collection = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id

    private String id;
    private String name;
    private String mobilenumber;
    private String emailid;
    private String dateofbirth;
    private String aadharcardnumber;
    private String security_PIN;
    private String  salt;
    private String upi_ID;
    private String block;
    private String resetToken;
    private Date resetTokenExpiryDate;


}
