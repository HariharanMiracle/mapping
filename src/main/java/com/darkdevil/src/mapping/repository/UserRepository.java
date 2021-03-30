package com.darkdevil.src.mapping.repository;

import com.darkdevil.src.mapping.model.OrderResponse;
import com.darkdevil.src.mapping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT new com.darkdevil.src.mapping.model.OrderResponse(u.name , p.productName) FROM User u JOIN u.products p")
    public List<OrderResponse> getJoinInformation();
}
