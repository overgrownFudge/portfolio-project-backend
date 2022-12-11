package com.portfolioproject.backend.testimonial;

public class Testimonial {
    private Integer id;
    private String name;
    private String company;
    private String feedback;
    private String image;

    public Testimonial() {
    }

    public Testimonial(Integer id, String name, String company, String feedback, String image) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.feedback = feedback;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Testimonial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", feedback='" + feedback + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

