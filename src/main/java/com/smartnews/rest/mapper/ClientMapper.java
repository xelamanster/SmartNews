package com.smartnews.rest.mapper;

import com.smartnews.model.Client;
import com.smartnews.rest.dto.ClientDto;
import com.smartnews.rest.dto.FolderDto;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
@Component
public class ClientMapper implements RestMapper<ClientDto, Client> {

    private static final Logger LOG = LogManager.getLogger(ClientMapper.class.getName());

    @Autowired
    private FolderMapper folderMapper;

    @Override
    public ClientDto mapToDto(Client client) {
        LOG.info("mapToDto start");
        List<FolderDto> folderDtos = new ArrayList<FolderDto>();
        folderDtos.addAll(folderMapper.mapToDtos(client.getFolders()));
        LOG.info("mapToDto end");
        return new ClientDto(client.getId(), client.getName(), folderDtos);
    }

    @Override
    public List<ClientDto> mapToDtos(List<Client> clients) {
        List<ClientDto> clientDtos = new ArrayList<ClientDto>();
        for (Client client : clients) {
            clientDtos.add(mapToDto(client));
        }
        return clientDtos;
    }

    @Override
    public Client mapToEntity(ClientDto clientDto) {
        return null;
    }

    @Override
    public List<Client> mapToEntities(List<ClientDto> dtos) {
        return null;
    }
}
