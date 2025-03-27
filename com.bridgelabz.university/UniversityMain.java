package com.bridgelabz.university;

public class UniversityMain {
    public static void main(String[] args) {
        // Creating Different Course Types
        ExamCourse javaExam = new ExamCourse("Java Programming", "Computer Science", 100);
        AssignmentCourse dbmsAssignment = new AssignmentCourse("Database Systems", "Information Technology", 5);
        ResearchCourse aiResearch = new ResearchCourse("Artificial Intelligence", "Computer Science", "Deep Learning");

        // Creating Generic Course Instances
        Course<ExamCourse> course1 = new Course<>(javaExam, "Dr. Smith");
        Course<AssignmentCourse> course2 = new Course<>(dbmsAssignment, "Prof. Brown");
        Course<ResearchCourse> course3 = new Course<>(aiResearch, "Dr. Patel");

        // Managing Courses
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

        // Display All Courses
        courseManager.displayAllCourses();
    }
}
