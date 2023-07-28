package com.sinking.repositories;

import com.sinking.models.MatchEndResult;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchEndResultRepository extends JpaRepository<MatchEndResult, Long> {
    @Query(value = "SELECT SPLIT_PART(match_name, ' - ', 1) AS home_team, " +
            "SUM(CAST(SPLIT_PART(end_result, ' : ', 1) AS INTEGER)) AS total_goals_scored " +
            "FROM match_end_result " +
            "GROUP BY home_team " +
            "ORDER BY total_goals_scored DESC " +
            "LIMIT 1", nativeQuery = true)
    Object[] findHomeTeamWithMostGoals();
}