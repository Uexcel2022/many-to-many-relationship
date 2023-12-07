package com.uexcel;

import java.util.List;

import org.checkerframework.checker.units.qual.s;

import com.uexcel.entity.Course;
import com.uexcel.entity.Student;
import com.uexcel.persistence.CustomEntityManager;

import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = CustomEntityManager.getEntityManager();
        try {
            entityManager.getTransaction().begin();

            // Student student1 = new Student();
            // student1.setStudentName("Uexcel");

            // Student student2 = new Student();
            // student2.setStudentName("Kelven");

            // Course course1 = new Course();
            // course1.setCourseName("python");

            // Course course2 = new Course();
            // course2.setCourseName("sql");

            // student1.setCourse(List.of(course1, course2));
            // student2.setCourse(List.of(course1));

            // entityManager.persist(student1);
            // entityManager.persist(student2);

            Student student = entityManager.find(Student.class, 2);
            System.out.println(student);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }
}
