package com.portfolioproject.backend.experience;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    public List<Experience> getExperiences() {
        return List.of(
                new Experience(
                            1,
                            "2022",
                            new Job (
                                "Software Engineering Internship",
                                "Malik Law Offices",
                                "Used HTML, CSS, JavaScript, Bootstrap, React to sustain various projects"
                                )
                ),
                new Experience(
                            2,
                            "2020",
                            new Job (
                                "Scanner Inspector",
                                "Vote NYC",
                                "Troubleshooting ballot scanning machines and software"
                            )
                ),
                new Experience(
                            3,
                            "2018",
                            new Job (
                                "Play/Laser Tag Attendant",
                                "Laser Bounce",
                                "Operating/supervising arcade machines and providing instructions before laser tag play"
                            )
                )
        );
    }
}
