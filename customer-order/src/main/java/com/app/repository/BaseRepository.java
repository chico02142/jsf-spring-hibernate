package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.BaseEntity;

public interface BaseRepository<E extends BaseEntity, ID extends Number> extends JpaRepository<E, Long> {

}
