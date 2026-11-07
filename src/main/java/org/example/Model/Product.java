package org.example.Model;


import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@ToString
public class Product {
    private String productName;
    private String productDescription;
    private String productOfferPresentage;
    private String productPrice;
    private Integer productItemStock;
}
