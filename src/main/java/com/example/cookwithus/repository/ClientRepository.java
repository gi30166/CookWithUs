package com.example.cookwithus.repository;

import com.example.cookwithus.pojo.entity.Client;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
    List<Client> findAll();

    Client findClientByName(String name);

    @Query("select c from Client c join fetch Booking b on c.name=b.client.name")
    List<Client> findClientWithBookings();
}
