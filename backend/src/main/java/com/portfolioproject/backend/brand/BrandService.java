package com.portfolioproject.backend.brand;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    public List<Brand> getBrands() {
        return List.of(
                new Brand(
                        1,
                        "Amazon Web Services",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/aws.png"
                ),
                new Brand(
                        2,
                        "Youtube",
                        "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
                )
        );
    }
}
