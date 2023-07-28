package com.sinking.models;

import jakarta.persistence.*;

@Entity
@Table(name = "match_end_result")
public class MatchEndResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "match_id")
    private String matchId;
    @Column(name = "match_name")
    private String matchName;
    @Column(name = "end_result")
    private String endResult;

    public MatchEndResult() {
        // Empty constructor required by JPA
    }

    public MatchEndResult(String matchId, String matchName, String endResult) {
        this.matchId = matchId;
        this.matchName = matchName;
        this.endResult = endResult;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getEndResult() {
        return endResult;
    }

    public void setEndResult(String endResult) {
        this.endResult = endResult;
    }

}
