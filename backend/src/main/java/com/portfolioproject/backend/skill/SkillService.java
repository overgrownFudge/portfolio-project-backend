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
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/springboot.png"
                ),
                new Skill(
                        2,
                        "NodeJS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/node.png"
                ),
                new Skill(
                        3,
                        "TypeScript",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/typescript.png"
                ),
                new Skill(
                        4,
                        "SASS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/sass.png"
                ),
                new Skill(
                        5,
                        "Figma",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
                ),
                new Skill(
                        6,
                        "Heroku",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/heroku.png"
                ),
                new Skill(
                        7,
                        "Railway",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/railwayapp.png"
                ),
                new Skill(
                        8,
                        "Render",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/render.png"
                ),
                new Skill(
                        9,
                        "Redux",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/redux.png"
                ),
                new Skill(
                        10,
                        "REST API",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/api.png"
                ),
                new Skill(
                        11,
                        "npm",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/npm.png"
                )
                );
    }
}
