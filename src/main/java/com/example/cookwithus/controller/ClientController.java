package com.example.cookwithus.controller;
import com.example.cookwithus.pojo.entity.Client;
import com.example.cookwithus.pojo.input.ClientInput;
import com.example.cookwithus.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/client")
    public List<Client> getClients() {
        return clientService.findAll();
    }

    @GetMapping("/client/{name}")
    public Client getClientbyName(@PathVariable String name) {
        return clientService.findClientByName(name);
    }

    @PostMapping("/client")
    public Client insertNewClient(@RequestBody ClientInput clientInput) {

        return clientService.save(clientInput);
    }

    @PutMapping("client/{name}")
    public Client updateClient(@PathVariable String name,
                               @RequestBody ClientInput clientInput) {

        return clientService.save(clientInput);
    }

    @DeleteMapping("client/{name}")
    public Boolean deleteClient(@PathVariable String name) {
        clientService.delete(name);
        return true;
    }

    @GetMapping("client/bookings")
    public List<Client>getClientWithBookings(){
        return clientService.findClientWithBookings();
    }
}
