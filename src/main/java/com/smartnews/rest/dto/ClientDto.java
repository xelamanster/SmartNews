package com.smartnews.rest.dto;

import com.smartnews.model.Folder;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ClientDto extends NamedDto {
    private List<FolderDto> folders;

    public ClientDto(long id, String name, List<FolderDto> folders) {
        super(id, name);
        this.folders = folders;
    }

    public List<FolderDto> getFolders() {
        return folders;
    }

    public void setFolders(List<FolderDto> folders) {
        this.folders = folders;
    }
}
