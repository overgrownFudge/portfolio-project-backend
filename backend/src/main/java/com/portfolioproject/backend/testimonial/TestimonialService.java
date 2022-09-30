package com.portfolioproject.backend.testimonial;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {
    public List<Testimonial> getTestimonials() {
        return List.of(
                new Testimonial(
                            2,
                            "Sarah",
                            "Facebook",
                            "Infinix Inbook X1 Ci3 10th 8GB...",
                            "https://dummyjson.com/image/i/products/9/thumbnail.jpg"
                ),
                new Testimonial(
                            1,
                            "Jason",
                            "Google",
                            "Style and speed. Stand out on ...",
                            "https://dummyjson.com/image/i/products/8/thumbnail.jpg"
                )
        );
    }
}
