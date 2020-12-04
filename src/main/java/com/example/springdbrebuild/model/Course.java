package com.example.springdbrebuild.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    Long id;

    String title;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;
}
