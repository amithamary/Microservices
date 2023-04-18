package com.UST.interviewSchedule.repository;

import com.UST.interviewSchedule.entity.interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface interviewRepo extends JpaRepository<interview,Integer> {

    Optional<Object> findByemailid(String email);

    interview findByemail(String email);
}
