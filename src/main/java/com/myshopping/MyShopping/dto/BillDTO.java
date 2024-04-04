package com.myshopping.MyShopping.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BillDTO {
    UUID billId;
    String buyerName;
    UUID buyerID;
    String emailId;
    int totalQuantity;
    int totalPrice;
    List<OrderProductDTO> orderProducts;
}
