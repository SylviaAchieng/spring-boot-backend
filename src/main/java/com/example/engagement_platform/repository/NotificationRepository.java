package com.example.engagement_platform.repository;

import com.example.engagement_platform.model.Issues;
import com.example.engagement_platform.model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notifications, Long> {
}