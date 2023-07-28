//package com.sinking.app.services;
//import jakarta.annotation.PostConstruct;
//
//import com.sinking.app.stores.MatchEndResultMemoryStore;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MatchEndResultSinkService {
//
//    private final MatchEndResultMemoryStore memoryStore;
//    private final MatchEndResultProcessingService processingService;
//
//    @Autowired
//    public MatchEndResultSinkService(
//            MatchEndResultMemoryStore memoryStore,
//            MatchEndResultProcessingService processingService
//    ) {
//        this.memoryStore = memoryStore;
//        this.processingService = processingService;
//    }
//
//    // Add method to save events to the memory store
//
//    @PostConstruct
//    public void startEventProcessing() {
//        processingService.processEvents();
//    }
//}
//
