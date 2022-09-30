package com.portfolioproject.backend.work;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {
    public List<Work> getWorks() {
        return List.of(
                new Work(
                        1,
                        "Infinix INBOOK",
                        "Infinix Inbook X1 Ci3 10th 8GB...",
                        "https://github.com/adrianhajdin/project_professional_portfolio/blob/master/src/container/Work/Work.jsx",
                        "UI/UX",
                        "https://dummyjson.com/image/i/products/9/thumbnail.jpg"
                )
        );
    }
}
