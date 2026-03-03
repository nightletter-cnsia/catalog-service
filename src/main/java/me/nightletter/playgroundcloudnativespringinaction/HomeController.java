package me.nightletter.playgroundcloudnativespringinaction;

import lombok.RequiredArgsConstructor;
import me.nightletter.playgroundcloudnativespringinaction.config.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final PolarProperties polarProperties;

    @GetMapping("/")
    public String getGreeting() {
        return polarProperties.getGreeting();
    }
}
