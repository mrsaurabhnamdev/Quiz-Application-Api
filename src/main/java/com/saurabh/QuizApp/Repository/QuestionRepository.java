package com.saurabh.QuizApp.Repository;

import com.saurabh.QuizApp.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);
    List<Question> findByDifficultyLevel(String difficultyLevel);
    List<Question> findByCategoryAndDifficultyLevel(String category, String difficultyLevel);
}
