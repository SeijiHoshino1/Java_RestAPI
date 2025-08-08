package com.example.demo.service;

import com.example.demo.entity.Party;
import com.example.demo.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    @Autowired
    private PartyRepository partyRepository;

    public List<Party> findAll(){
        return partyRepository.findAll();
    }

    public Party createParty(Party party){
        return partyRepository.save(party);
    }
}
