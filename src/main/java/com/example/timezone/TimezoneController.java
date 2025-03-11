package com.example.timezone;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("selectedTimezones")
public class TimezoneController {

    @ModelAttribute("selectedTimezones")
    public List<String> selectedTimezones() {
        List<String> zones = new ArrayList<>();
        // Start with the server's default timezone
        zones.add(ZoneId.systemDefault().getId());
        return zones;
    }

    @GetMapping("/")
    public String getTime(Model model,
                          @ModelAttribute("selectedTimezones") List<String> selectedTimezones) {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        model.addAttribute("timezones", zones);
        return "index";
    }

    @PostMapping("/addTimezone")
    public String addTimezone(@RequestParam("timezone") String timezone,
                              @ModelAttribute("selectedTimezones") List<String> selectedTimezones,
                              Model model) {
        try {
            ZoneId zone = ZoneId.of(timezone);
            if (!selectedTimezones.contains(zone.getId())) {
                selectedTimezones.add(zone.getId());
            }
        } catch (DateTimeException e) {
            model.addAttribute("error", "Invalid timezone provided.");
        }
        return "redirect:/";
    }

    @PostMapping("/removeTimezone")
    public String removeTimezone(@RequestParam("timezone") String timezone,
                                 @ModelAttribute("selectedTimezones") List<String> selectedTimezones,
                                 Model model) {
        selectedTimezones.remove(timezone);
        return "redirect:/";
    }
}
