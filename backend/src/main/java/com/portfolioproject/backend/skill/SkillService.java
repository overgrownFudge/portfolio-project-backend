package com.portfolioproject.backend.skill;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    public List<Skill> getSkills() {
        return List.of(
                new Skill(
                        1,
                        "Spring Boot",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/springboot.png"                ),
                new Skill(
                        2,
                        "ReactJS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/react.png"
                ),
                new Skill(
                        3,
                        "JavaScript",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/javascript.png"
        )
        );
    }
}
