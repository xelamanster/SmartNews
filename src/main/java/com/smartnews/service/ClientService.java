package com.smartnews.service;

import com.smartnews.rest.dto.ClientDto;

import java.util.List;

/**
 * Created by fein on 8/13/2015.
 */
public interface ClientService {
    ClientDto findClient(long clientId);

    List<ClientDto> findAllClients();
}
