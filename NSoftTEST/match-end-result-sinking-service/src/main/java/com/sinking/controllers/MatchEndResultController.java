package com.sinking.controllers;

import com.sinking.repositories.MatchEndResultRepository;
import com.sinking.models.MatchEndResult;
import com.sinking.services.MatchEndResultService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class MatchEndResultController {

    private final MatchEndResultRepository repository;
    private final MatchEndResultService matchEndResultService;

    @Autowired
    public MatchEndResultController(MatchEndResultRepository repository, MatchEndResultService matchEndResultService) {
        this.repository = repository;
        this.matchEndResultService = matchEndResultService;
    }

    @PostMapping(path = "/v1/match-end-result", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MatchEndResult> insertMatchEndResult(@RequestBody MatchEndResult matchEndResult) {

            MatchEndResult savedMatchEndResult = repository.save(matchEndResult);

            return new ResponseEntity<>(savedMatchEndResult, HttpStatus.ACCEPTED);
    }

    @GetMapping("/home-team-with-most-goals")
    public Object getHomeTeamWithMostGoals() {
        return matchEndResultService.getHomeTeamWithMostGoals();
    }



//    @PostMapping(path = "/v2/match-end-result-event", consumes = MediaType.APPLICATION_JSON_VALUE)
}
