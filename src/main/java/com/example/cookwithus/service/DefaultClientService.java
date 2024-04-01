package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Client;
import com.example.cookwithus.pojo.input.ClientInput;
import java.util.List;

import com.example.cookwithus.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultClientService implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public DefaultClientService() {
    }

    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }

    public Client findClientByName(String name) {
        return this.clientRepository.findClientByName(name);
    }

    public Client save(ClientInput clientInput) {
        String name = clientInput.getName();
        String surname = clientInput.getSurname();
        String email = clientInput.getEmail();
        Client client = new Client();
        client.setName(name);
        client.setSurname(surname);
        client.setEmail(email);
        return (Client)this.clientRepository.save(client);
    }

    public Client update(String name, ClientInput clientInput) {
        Client client = this.clientRepository.findClientByName(name);
        if (client == null) {
            return null;
        } else {
            String updatedName = clientInput.getName();
            String updatedSurname = clientInput.getSurname();
            String updatedEmail = clientInput.getEmail();
            client.setName(updatedName);
            client.setSurname(updatedSurname);
            client.setEmail(updatedEmail);
            return (Client)this.clientRepository.save(client);
        }
    }

    public void delete(String name) {
        Client client = this.clientRepository.findClientByName(name);
        if (client != null) {
            this.clientRepository.delete(client);
        }

        this.clientRepository.delete(client);
    }

    @Override
    public List<Client> findClientWithBookings() {
        return this.clientRepository.findClientWithBookings();
    }
}
