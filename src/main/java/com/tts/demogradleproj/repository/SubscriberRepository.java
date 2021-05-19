package com.tts.demogradleproj.repository;

import com.tts.demogradleproj.model.Subscriber;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tts.demogradleproj.model.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

    List<Subscriber> findAll();





}