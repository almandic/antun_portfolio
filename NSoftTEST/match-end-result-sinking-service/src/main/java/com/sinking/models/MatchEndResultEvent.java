//package com.sinking.app.models;
//
//import javax.persistence.Entity;
//
//@Entity
//public class MatchEndResultEvent {
//    private String matchId;
//    private String matchName;
//    private String endResult;
//
//    // Constructor
//    public MatchEndResultEvent() {
//    }
//
//    public MatchEndResultEvent(String matchId, String matchName, String endResult) {
//        this.matchId = matchId;
//        this.matchName = matchName;
//        this.endResult = endResult;
//    }
//
//    // Getters and Setters
//    public String getMatchId() {
//        return matchId;
//    }
//
//    public void setMatchId(String matchId) {
//        this.matchId = matchId;
//    }
//
//    public String getMatchName() {
//        return matchName;
//    }
//
//    public void setMatchName(String matchName) {
//        this.matchName = matchName;
//    }
//
//    public String getEndResult() {
//        return endResult;
//    }
//
//    public void setEndResult(String endResult) {
//        this.endResult = endResult;
//    }
//
//    // Other methods
//    public MatchEndResult toMatchEndResult() {
//        MatchEndResult matchEndResult = new MatchEndResult();
//        matchEndResult.setMatchName(this.matchName);
//        matchEndResult.setEndResult(this.endResult);
//
//        return matchEndResult;
//    }
//}

