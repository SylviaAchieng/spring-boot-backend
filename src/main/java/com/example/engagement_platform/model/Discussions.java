package com.example.engagement_platform.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "discussions")
public class Discussions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long discussionId;

    @NotNull(message = "title is mandatory")
    @NotBlank(message = "title field shld not be empty")
    private String title;

    @NotNull(message = "creation date is mandatory")
    @NotBlank(message = "createdAt field shld not be empty")
    private String createdAt;

    @NotNull(message = "description is mandatory")
    @NotBlank(message = "description field shld not be empty")
    private String description;

}