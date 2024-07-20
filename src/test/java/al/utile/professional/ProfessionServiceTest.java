package al.utile.professional;

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

class ProfessionServiceTest {

//    @Mock
//    private ProfessionRepository professionRepository;
//
//    @InjectMocks
//    private ProfessionService professionService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testFindAll() {
//        Profession profession1 = new Profession();
//        profession1.setId(1L);
//        profession1.setName("Doctor");
//
//        Profession profession2 = new Profession();
//        profession2.setId(2L);
//        profession2.setName("Engineer");
//
//        when(professionRepository.findAll()).thenReturn(Arrays.asList(profession1, profession2));
//
//        List<Profession> professions = professionService.findAll();
//        assertEquals(2, professions.size());
//        assertEquals("Doctor", professions.get(0).getName());
//    }
//
//    @Test
//    void testFindById() {
//        Profession profession = new Profession();
//        profession.setId(1L);
//        profession.setName("Doctor");
//
//        when(professionRepository.findById(1L)).thenReturn(Optional.of(profession));
//
//        Optional<Profession> found = professionService.findById(1L);
//        assertTrue(found.isPresent());
//        assertEquals("Doctor", found.get().getName());
//    }
//
//    @Test
//    void testSave() {
//        Profession profession = new Profession();
//        profession.setName("Doctor");
//
//        when(professionRepository.save(profession)).thenReturn(profession);
//
//        Profession saved = professionService.save(profession);
//        assertEquals("Doctor", saved.getName());
//    }
//
//    @Test
//    void testDeleteById() {
//        doNothing().when(professionRepository).deleteById(1L);
//        professionService.deleteById(1L);
//        verify(professionRepository, times(1)).deleteById(1L);
//    }
}

