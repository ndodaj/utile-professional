package al.utile.professional.controller;

import al.utile.professional.service.ProfessionalService;
import al.utile.utile_common.utile.ProfessionalDto;
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
@RequestMapping("/api/professionals")
public class ProfessionalController {

    private final ProfessionalService professionalService;

    public ProfessionalController(ProfessionalService professionalService) {
        this.professionalService = professionalService;
    }

    @GetMapping
    public List<ProfessionalDto> getAllProfessionals() {
        return new ArrayList<>(professionalService.getAllProfessionals());
    }

    @GetMapping("/{id}")
    public ProfessionalDto getProfessionalById(@PathVariable Long id) {
        return professionalService.getProfessionalById(id);
    }

    @PostMapping
    public ProfessionalDto createProfessional(@RequestBody ProfessionalDto professionalDto) {
        return professionalService.createProfessional(professionalDto);
    }

    @PutMapping("/{id}")
    public ProfessionalDto updateProfessional(@PathVariable Long id, @RequestBody ProfessionalDto professionalDto) {
        return professionalService.updateProfessional(id, professionalDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessional(@PathVariable Long id) {
        professionalService.deleteProfessional(id);
    }
}
