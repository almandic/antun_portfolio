package com.sinking.services;

import com.sinking.repositories.MatchEndResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchEndResultService {

    private final MatchEndResultRepository repo;

    @Autowired
    public MatchEndResultService(MatchEndResultRepository matchEndResultRepository) {
        this.repo = matchEndResultRepository;
    }

    public Object getHomeTeamWithMostGoals() {
        return repo.findHomeTeamWithMostGoals();
    }
}
