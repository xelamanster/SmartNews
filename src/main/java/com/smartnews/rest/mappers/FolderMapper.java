package com.smartnews.rest.mappers;

import com.smartnews.model.Folder;
import com.smartnews.rest.dto.FolderDto;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
@Component
public class FolderMapper implements RestMapper<FolderDto, Folder> {

    private static final Logger LOG = LogManager.getLogger(FolderMapper.class.getName());

    @Override
    public FolderDto mapToDto(Folder folder) {
        LOG.info("mapToDto start");
        FolderDto parentFolderDto = folder.getParentFolder() != null
                ? mapToDto(folder.getParentFolder())
                : null;
        FolderDto folderDto = new FolderDto(folder.getId(), folder.getName(), parentFolderDto, null);
        LOG.info("mapToDto finish");
        return folderDto;
    }

    @Override
    //TODO try to use java 8 stream api
    public List<FolderDto> mapToDtos(List<Folder> folders) {
        List<FolderDto> folderDtos = new ArrayList<FolderDto>();
        for (Folder folder : folders) {
            folderDtos.add(mapToDto(folder));
        }
        return folderDtos;
    }

    @Override
    public Folder mapToEntity(FolderDto folderDto) {
        return null;
    }

    @Override
    public List<Folder> mapToEntities(List<FolderDto> dtos) {
        return null;
    }
}
