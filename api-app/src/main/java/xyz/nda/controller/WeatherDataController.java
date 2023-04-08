package xyz.nda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import xyz.nda.model.Weatherdata;
import xyz.nda.repository.ReactiveWeatherdataRepository;

import java.util.List;

@RestController
public class WeatherDataController {

    @Autowired
    private ReactiveWeatherdataRepository weatherdataRepository;

    @GetMapping("/weatherdata")
    public Flux<Weatherdata> hello(@DefaultValue("1") @RequestParam(required = false) int page,
                                   @DefaultValue("1") @RequestParam(required = false) int hits) {
        Pageable pageable = PageRequest.of(page, hits);

        List<Weatherdata> result = weatherdataRepository.findAllByOrderByLogDateAsc(pageable);
        return Flux.fromIterable(result);
    }

}
