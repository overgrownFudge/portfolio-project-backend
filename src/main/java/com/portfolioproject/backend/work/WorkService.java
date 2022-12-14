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
                        "https://github.com/overgrownFudge/meme-generator-react",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/meme-generator.png"
                ),
                new Work(
                        2,
                        "Speed typing Game",
                        "How many words can you type before the clock runs out?",
                        "https://overgrownfudge.github.io/speed-typing-game-react/",
                        "https://github.com/overgrownFudge/speed-typing-game-react",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/speed-typing-game.png"
                ),
                new Work(
                        3,
                        "Tenzies Game",
                        "Roll until all 10 dies read the same number!",
                        "https://overgrownfudge.github.io/tenzies-game-react/",
                        "https://github.com/overgrownFudge/tenzies-game-react",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/tenzies-game.png"
                ),
                new Work(
                        4,
                        "Movie Watchlist",
                        "Add movies and shows to a personalized watchlist!",
                        "https://overgrownfudge.github.io/movie-watchlist/",
                        "https://github.com/overgrownFudge/movie-watchlist",
                        "React JS",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/movie-watchlist.png"
                )
        );
    }
}
