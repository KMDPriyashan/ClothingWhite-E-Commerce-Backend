package org.example.Model;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String customerName;
    private String customerAddress;
    private int customerAge;
    private String customerEmail;
}
