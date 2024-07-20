package al.utile.professional;


import al.utile.professional.controller.ProfessionalController;
import al.utile.professional.converter.ProfessionalConverter;
import al.utile.professional.dto.ProfessionalDto;
import al.utile.professional.entity.Professional;
import al.utile.professional.service.ProfessionalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class ProfessionalControllerTest {

    @Mock
    private ProfessionalService professionalService;

    @Mock
    private ProfessionalConverter professionalConverter;

    @InjectMocks
    private ProfessionalController professionalController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(professionalController).build();
    }

    @Test
    void testGetAllProfessionals() throws Exception {
        Professional professional = new Professional();
        professional.setEntryId(1L);
        professional.setUserId(1L);
//        professional.setProfession(1L);

//        ProfessionalDto ProfessionalDto = new ProfessionalDto();
//        ProfessionalDto.setEntryId(1L);
//        ProfessionalDto.setUserId(1L);
//        ProfessionalDto.setProfessionId(1L);

//        when(professionalService.findAll()).thenReturn(Arrays.asList(professional));
//        when(professionalConverter.toDto(professional)).thenReturn(ProfessionalDto);

        mockMvc.perform(get("/api/professionals")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].userId", is(1)));
    }

    @Test
    void testGetProfessionalById() throws Exception {
        Professional professional = new Professional();
        professional.setEntryId(1L);
        professional.setUserId(1L);
//        professional.setProfessionId(1L);

//        ProfessionalDto ProfessionalDto = new ProfessionalDto();
//        ProfessionalDto.setEntryId(1L);
//        ProfessionalDto.setUserId(1L);
//        ProfessionalDto.setProfessionId(1L);
//
//        when(professionalService.findById(1L)).thenReturn(Optional.of(professional));
//        when(professionalConverter.toDto(professional)).thenReturn(ProfessionalDto);

        mockMvc.perform(get("/api/professionals/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId", is(1)));
    }

    @Test
    void testCreateProfessional() throws Exception {
        Professional professional = new Professional();
        professional.setUserId(1L);
//        professional.setProfessionId(1L);

//        ProfessionalDto ProfessionalDto = new ProfessionalDto();
//        ProfessionalDto.setUserId(1L);
//        ProfessionalDto.setProfessionId(1L);
//
//        when(professionalService.save(professional)).thenReturn(professional);
//        when(professionalConverter.toEntity(ProfessionalDto)).thenReturn(professional);
//        when(professionalConverter.toDto(professional)).thenReturn(ProfessionalDto);

        mockMvc.perform(post("/api/professionals")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"userId\":1,\"professionId\":1}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId", is(1)));
    }

    @Test
    void testUpdateProfessional() throws Exception {
        Professional professional = new Professional();
        professional.setEntryId(1L);
        professional.setUserId(1L);
//        professional.setProfessionId(1L);
//
//        ProfessionalDto ProfessionalDto = new ProfessionalDto();
//        ProfessionalDto.setEntryId(1L);
//        ProfessionalDto.setUserId(1L);
//        ProfessionalDto.setProfessionId(1L);
//
//        when(professionalService.findById(1L)).thenReturn(Optional.of(professional));
//        when(professionalService.save(professional)).thenReturn(professional);
//        when(professionalConverter.toEntity(ProfessionalDto)).thenReturn(professional);
//        when(professionalConverter.toDto(professional)).thenReturn(ProfessionalDto);

        mockMvc.perform(put("/api/professionals/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"userId\":1,\"professionId\":1}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userId", is(1)));
    }

    @Test
    void testDeleteProfessional() throws Exception {
        mockMvc.perform(delete("/api/professionals/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}

