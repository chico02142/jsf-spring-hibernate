package com.app.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.dto.BaseDTO;
import com.app.entity.BaseEntity;

/**
 * 
 * @author Seetharama Krishna
 *
 * @param <D>
 * @param <E>
 */
public interface BaseMapper<D extends BaseDTO, E extends BaseEntity> {
	
	D mapEntityToDto(E entity);
	
	E mapDtoToEntity(D dto);
	
	default List<D> mapEntityListToDtoList(List<E> entities) {
		if (entities == null) {
			return Collections.emptyList();
		}
		List<D> dtos = new ArrayList<>();
		entities.forEach(e -> dtos.add(mapEntityToDto(e)));
		return dtos;
	}
	
	default List<E> mapDtoListToEntityList(List<D> dtos) {
		if (dtos == null) {
			return Collections.emptyList();
		}
		List<E> entities = new ArrayList<>();
		dtos.forEach(d -> entities.add(mapDtoToEntity(d)));
		return entities;
	}

}
