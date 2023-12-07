package com.uexcel;

import com.uexcel.entity.Course;
import com.uexcel.persistence.CustomEntityManager;

import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = CustomEntityManager.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Course course = new Course();
            course.setCourseName("sql");
            course.setCourseName("pythone");

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

    }
}
