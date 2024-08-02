package com.example.Jobnotification.Repository;
import com.example.Jobnotification.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
