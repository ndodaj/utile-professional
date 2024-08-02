package al.utile.professional.controller;


import al.utile.professional.service.ProfessionService;
import al.utile.utile_common.utile.dto.ProfessionDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/professions")
public class ProfessionController {

    private final ProfessionService professionService;

    public ProfessionController(ProfessionService professionService) {
        this.professionService = professionService;
    }


    @GetMapping
    public List<ProfessionDto> getAllProfessions() {
        return new ArrayList<>(professionService.getAllProfessions());
    }

    @GetMapping("/{id}")
    public ProfessionDto getProfessionById(@PathVariable Long id) {
        return professionService.getProfessionById(id);
    }

    @PostMapping
    public ProfessionDto createProfession(@RequestBody ProfessionDto professionDto) {
        return professionService.createProfession(professionDto);
    }

    @PutMapping("/{id}")
    public ProfessionDto updateProfession(@PathVariable Long id, @RequestBody ProfessionDto professionDto) {
        return professionService.updateProfession(id, professionDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProfession(@PathVariable Long id) {
        professionService.deleteProfession(id);
    }
}
