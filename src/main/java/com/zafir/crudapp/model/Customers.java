package com.zafir.crudapp.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers extends Auditable{
    @Getter
    @Setter
    @NotNull
    private String username;

    @Getter
    @Setter
    @NotNull
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    @Getter
    @Setter
    @NotNull
    private String email;

    @Getter
    @Setter
    @NotNull
    private String password;

    @Override
    public String toString() {
        return "User: \n Username: " + username + " \nFirstName: " + firstname + "\nEmail: " + email + "\nPassword: " + password;
    }
}
