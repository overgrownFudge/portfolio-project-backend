package com.portfolioproject.backend.experience;

public class Experience {
    private Integer id;
    private String year;
    private Job job;

    public Experience() {
    }

    public Experience(Integer id, String year, Job job) {
        this.id = id;
        this.year = year;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", job=" + job +
                '}';
    }
}

