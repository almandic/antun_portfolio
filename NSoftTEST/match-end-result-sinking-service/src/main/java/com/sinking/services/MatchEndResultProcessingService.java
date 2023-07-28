//package com.sinking.app.services;
//import com.sinking.app.stores.MatchEndResultMemoryStore;
//import com.sinking.app.models.MatchEndResult;
//import com.sinking.app.repositories.MatchEndResultRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//@Service
//public class MatchEndResultProcessingService {
//
//    private final MatchEndResultMemoryStore memoryStore;
//    private final MatchEndResultRepository repository;
//    private final ExecutorService executorService;
//
//    @Autowired
//    public MatchEndResultProcessingService(
//            MatchEndResultMemoryStore memoryStore,
//            MatchEndResultRepository repository
//    ) {
//        this.memoryStore = memoryStore;
//        this.repository = repository;
//        this.executorService = Executors.newSingleThreadExecutor();
//    }
//
//    public void processEvents() {
//        executorService.execute(() -> {
//            while (true) {
//                try {
//                    // Sleep for 1 second
//                    Thread.sleep(1000);
//
//                    // Check for events in memory and process them
//                    for (String matchId : memoryStore.getEventIds()) {
//                        MatchEndResult event = memoryStore.getEvent(matchId);
//                        if (event != null) {
//                            // Insert event into the database
//                            repository.save(event.toMatchEndResult());
//
//                            // Remove event from memory after insertion
//                            memoryStore.removeEvent(matchId);
//                        }
//                    }
//                } catch (InterruptedException e) {
//                    // Handle interrupted exception if needed
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//}
