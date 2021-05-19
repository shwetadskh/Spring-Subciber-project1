package com.tts.demogradleproj.service;

import com.tts.demogradleproj.model.Subscriber;
import com.tts.demogradleproj.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subRepo) {
        subscriberRepository = subRepo ;
    }
    public List<Subscriber> findAll() {
        var it = subscriberRepository.findAll();

        var subscribers = new ArrayList<Subscriber>();
        it.forEach(e -> subscribers.add(e));

        return subscribers;


    }
}
