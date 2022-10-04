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
                ),
                new Skill(
                        4,
                        "CSS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/css.png"
                ),
                new Skill(
                        5,
                        "figma",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
                ),
                new Skill(
                        6,
                        "heroku",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/heroku.png"
                ),
                new Skill(
                        7,
                        "HTML",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/html.png"
                ),
                new Skill(
                        8,
                        "NodeJS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/node.png"
                ),
                new Skill(
                        9,
                        "Redux",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/redux.png"
                ),
                new Skill(
                        10,
                        "SASS",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/sass.png"
                ),
                new Skill(
                        11,
                        "typeScript",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/typescript.png"
                ),
                new Skill(
                        12,
                        "Flutter",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/flutter.png"
                ),
                new Skill(
                        13,
                        "api",
                        "#edf2f8",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/api.png"
                )
                );
    }
}
