package com.order.management.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    private long id;
    private String name;
    private double price;
    private String description;

    @Override
    public String toString(){
        return String.format(
                "Item[id=%s, name='%s', price='%f', description='%s']", id, name, price, description);
    }
}
