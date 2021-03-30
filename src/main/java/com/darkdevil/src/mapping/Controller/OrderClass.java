package com.darkdevil.src.mapping.Controller;

import com.darkdevil.src.mapping.model.OrderResponse;
import com.darkdevil.src.mapping.model.Product;
import com.darkdevil.src.mapping.model.User;
import com.darkdevil.src.mapping.repository.ProductRepository;
import com.darkdevil.src.mapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Order")
public class OrderClass {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("PlaceOrder")
    public User placeOrder(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("ListOrder")
    public List<User> listOrder(){
        return userRepository.findAll();
    }

    @GetMapping("/GetInfo")
    public List<OrderResponse> getJoinInformation(){
        return userRepository.getJoinInformation();
    }
}
