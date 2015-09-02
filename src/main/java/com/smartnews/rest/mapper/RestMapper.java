package com.smartnews.rest.mapper;

import com.smartnews.model.ModelEntity;
import com.smartnews.rest.dto.NamedDto;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public interface RestMapper<T extends NamedDto, E extends ModelEntity> {
    public T mapToDto(E entity);

    public List<T> mapToDtos(List<E> entities);

    public E mapToEntity(T dto);

    public List<E> mapToEntities(List<T> dtos);
}
