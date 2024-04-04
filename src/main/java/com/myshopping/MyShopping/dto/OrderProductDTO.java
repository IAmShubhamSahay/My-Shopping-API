package com.myshopping.MyShopping.dto;

import lombok.*;

import java.util.UUID;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderProductDTO {
    UUID productID;
    String productName;
    int quantity;

}
