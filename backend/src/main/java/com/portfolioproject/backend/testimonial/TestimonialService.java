package com.portfolioproject.backend.testimonial;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {
    public List<Testimonial> getTestimonials() {
        return List.of(
                new Testimonial(
                            2,
                            "Hasan",
                            "Malik Law Offices",
                            "Style and speed. Stand out on ...",
                            "https://i.pinimg.com/474x/52/53/dd/5253dd4c75b8791c1f5e1a7e1bbd5285.jpg"
                )
        );
    }
}
