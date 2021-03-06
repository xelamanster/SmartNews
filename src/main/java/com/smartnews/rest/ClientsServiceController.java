package com.smartnews.rest;

import com.smartnews.rest.dto.ClientDto;
import com.smartnews.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fein on 8/13/2015.
 */
@RestController
@RequestMapping
public class ClientsServiceController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/client/{id}", method = RequestMethod.GET, produces="application/json")
    public ClientDto findClient(@PathVariable("id") long clientId) {
        return clientService.findClient(clientId);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET, produces="application/json")
    public List<ClientDto> findAllClients() {
        return clientService.findAllClients();
    }
}
