package io.cloudmobility.codefocus.silverarrow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "silver-arrow")
public class SilverArrowController {

    @Value("silverarrow.txt")
    private ClassPathResource resource;

    @GetMapping
    public String getSilverArrow() throws IOException {
        var content = new String(resource.getInputStream().readAllBytes());

        return "<pre>" + content + "</pre>";
    }

}
