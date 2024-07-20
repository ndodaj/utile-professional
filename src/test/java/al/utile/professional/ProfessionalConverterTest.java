package al.utile.professional;


import al.utile.professional.converter.ProfessionalConverter;
import al.utile.professional.dto.ProfessionalDto;
import al.utile.professional.entity.Professional;
import al.utile.professional.repository.ProfessionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProfessionalConverterTest {

    @Autowired
    private ProfessionRepository repository;

    private final ProfessionalConverter professionalConverter = new ProfessionalConverter(repository);

    @Test
    void testToEntity() {
//        ProfessionalDto dto = new ProfessionalDto();
//        dto.setEntryId(1L);
//        dto.setUserId(1L);
//        dto.setProfessionId(1L);
//        dto.setDescription("Test Description");
//        dto.setReason("Test Reason");
//        dto.setProfile("Test Profile");
//        dto.setFee(100.0);

//        Professional entity = professionalConverter.toEntity(dto);

//        assertEquals(dto.getEntryId(), entity.getEntryId());
//        assertEquals(dto.getUserId(), entity.getUserId());
//        assertEquals(dto.getProfessionId(), entity.getProfessionId());
//        assertEquals(dto.getDescription(), entity.getDescription());
//        assertEquals(dto.getReason(), entity.getReason());
//        assertEquals(dto.getProfile(), entity.getProfile());
//        assertEquals(dto.getFee(), entity.getFee());
    }

    @Test
    void testToDto() {
//        Professional entity = new Professional();
//        entity.setEntryId(1L);
//        entity.setUserId(1L);
//        entity.setProfessionId(1L);
//        entity.setDescription("Test Description");
//        entity.setReason("Test Reason");
//        entity.setProfile("Test Profile");
//        entity.setFee(100.0);
//
//        ProfessionalDTO dto = professionalConverter.toDto(entity);
//
//        assertEquals(entity.getEntryId(), dto.getEntryId());
//        assertEquals(entity.getUserId(), dto.getUserId());
//        assertEquals(entity.getProfessionId(), dto.getProfessionId());
//        assertEquals(entity.getDescription(), dto.getDescription());
//        assertEquals(entity.getReason(), dto.getReason());
//        assertEquals(entity.getProfile(), dto.getProfile());
//        assertEquals(entity.getFee(), dto.getFee());
    }
}

