package com.portfolioproject.backend.work;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {
    public List<Work> getWorks() {
        return List.of(
                new Work(
                        1,
                        "Meme Generator",
                        "Create your very own meme using a random image",
                        "https://overgrownfudge.github.io/meme-generator-react/",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/meme-generator.png"
                ),
                new Work(
                        2,
                        "Speed typing Game",
                        "How many words can you type before the clock runs out?",
                        "https://overgrownfudge.github.io/speed-typing-game-react/",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/speed-typing-game.png"
                ),
                new Work(
                        1,
                        "Tenzies Game",
                        "Roll until all 10 dies read the same number!",
                        "https://overgrownfudge.github.io/tenzies-game-react/",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/tenzies-game.png"
                )
        );
    }
}
