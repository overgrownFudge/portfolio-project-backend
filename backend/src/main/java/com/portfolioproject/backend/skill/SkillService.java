package com.portfolioproject.backend.skill;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    public List<Skill> getSkills() {
        return List.of(
                new Skill(
                        "Spring Boot",
                        "#edf2f8",
                        "https://github.com/overgrownFudge/portfolio-project/blob/main/frontend_react/src/assets/springboot.png"
                ),
                new Skill(
                        "ReactJS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/react.png"
                ),
                new Skill(
                "JavaScript",
                "#edf2f8",
                "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/javascript.png"
        )
        );
    }
}
