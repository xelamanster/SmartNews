package com.smartnews.rest.dto;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ClientDto extends NamedDto {
    private final List<FolderDto> folders;

    public ClientDto(long id, String name, List<FolderDto> folders) {
        super(id, name);
        this.folders = folders;
    }

    public List<FolderDto> getFolders() {
        return folders;
    }

}
