package al.utile.professional;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProfessionalServiceTest {

//    @Mock
//    private ProfessionalRepository professionalRepository;
//
//    @InjectMocks
//    private ProfessionalService professionalService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testFindAll() {
//        Professional professional1 = new Professional();
//        professional1.setEntryId(1L);
//        professional1.setUserId(1L);
//        professional1.setProfessionId(1L);
//
//        Professional professional2 = new Professional();
//        professional2.setEntryId(2L);
//        professional2.setUserId(2L);
//        professional2.setProfessionId(2L);
//
//        when(professionalRepository.findAll()).thenReturn(Arrays.asList(professional1, professional2));
//
//        List<Professional> professionals = professionalService.findAll();
//        assertEquals(2, professionals.size());
//        assertEquals(1L, professionals.get(0).getUserId());
//    }
//
//    @Test
//    void testFindById() {
//        Professional professional = new Professional();
//        professional.setEntryId(1L);
//        professional.setUserId(1L);
//        professional.setProfessionId(1L);
//
//        when(professionalRepository.findById(1L)).thenReturn(Optional.of(professional));
//
//        Optional<Professional> found = professionalService.findById(1L);
//        assertTrue(found.isPresent());
//        assertEquals(1L, found.get().getUserId());
//    }
//
//    @Test
//    void testSave() {
//        Professional professional = new Professional();
//        professional.setUserId(1L);
//        professional.setProfessionId(1L);
//
//        when(professionalRepository.save(professional)).thenReturn(professional);
//
//        Professional saved = professionalService.save(professional);
//        assertEquals(1L, saved.getUserId());
//    }
//
//    @Test
//    void testDeleteById() {
//        doNothing().when(professionalRepository).deleteById(1L);
//        professionalService.deleteById(1L);
//        verify(professionalRepository, times(1)).deleteById(1L);
//    }
}

