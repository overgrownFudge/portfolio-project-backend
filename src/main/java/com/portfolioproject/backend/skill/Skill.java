package com.portfolioproject.backend.skill;

public class Skill {
    private Integer id;
    private String name;
    private String bgColor;
    private String icon;

    public Skill() {
    }

    public Skill(Integer id, String name, String bgColor, String icon) {
        this.id = id;
        this.name = name;
        this.bgColor = bgColor;
        this.icon = icon;
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

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}

