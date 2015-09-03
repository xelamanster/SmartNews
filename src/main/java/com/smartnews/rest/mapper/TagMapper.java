package com.smartnews.rest.mapper;

import com.google.common.collect.Lists;
import com.smartnews.model.Tag;
import com.smartnews.rest.dto.TagDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fein on 8/29/2015.
 */
@Component
public class TagMapper implements RestMapper<TagDto, Tag> {
    @Override
    public TagDto mapToDto(Tag tag) {
        return new TagDto(tag.getId(), tag.getName());
    }

    @Override
    public List<TagDto> mapToDtos(List<Tag> tags) {
        List<TagDto> tagDtos = Lists.newArrayListWithCapacity(tags.size());
        for (Tag tag : tags) {
            tagDtos.add(mapToDto(tag));
        }
        return tagDtos;
    }

    @Override
    public Tag mapToEntity(TagDto dto) {
        return null;
    }

    @Override
    public List<Tag> mapToEntities(List<TagDto> dtos) {
        return null;
    }
}
