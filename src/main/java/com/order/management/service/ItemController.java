package com.order.management.service;

import com.order.management.models.Item;
import com.order.management.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("getItems")
    public String getAllItems() {
        return itemRepository.findAll().toString();
    }

    @PostMapping(value = "/addItem",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addItem(@RequestBody Item item){
        itemRepository.save(item);
        return item.toString() + " has been added.";
    }

    @GetMapping("/")
    public String root(){
        return "AmanBP";
    }
}
