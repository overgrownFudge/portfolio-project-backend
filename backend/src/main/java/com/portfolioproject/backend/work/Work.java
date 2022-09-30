package com.portfolioproject.backend.work;

public class Work {
    private Integer id;
    private String title;
    private String description;
    private String project_link;
    private String tag;
    private String image;

    public Work() {
    }

    public Work(Integer id,
                String title,
                String description,
                String project_link,
                String tag,
                String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.project_link = project_link;
        this.tag = tag;
        this.image = image;
    }

    public Work(String title,
                String description,
                String project_link,
                String tag,
                String image) {
        this.title = title;
        this.description = description;
        this.project_link = project_link;
        this.tag = tag;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject_link() {
        return project_link;
    }

    public void setProject_link(String project_link) {
        this.project_link = project_link;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", project_link='" + project_link + '\'' +
                ", tag='" + tag + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

