//package com.sinking.app.stores;
//
//import com.sinking.app.models.MatchEndResultEvent;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//@Component
//public class MatchEndResultMemoryStore {
//
//    private ConcurrentHashMap<String, MatchEndResultEvent> eventStore = new ConcurrentHashMap<>();
//    private CopyOnWriteArrayList<String> eventIds = new CopyOnWriteArrayList<>();
//
//
//    public void saveEvent(MatchEndResultEvent event) {
//        String matchId = event.getMatchId();
//        eventStore.put(matchId, event);
//        eventIds.add(matchId);
//    }
//
//    public MatchEndResultEvent getEvent(String matchId) {
//        return eventStore.get(matchId);
//    }
//
//    public MatchEndResultEvent removeEvent(String matchId) {
//        eventIds.remove(matchId);
//        return eventStore.remove(matchId);
//    }
//
//    public int getEventCount() {
//        return eventStore.size();
//    }
//
//    public CopyOnWriteArrayList<String> getEventIds() {
//        return eventIds;
//    }
//}
//
