package al.utile.professional;

class ProfessionControllerTest {

//    @Mock
//    private ProfessionService professionService;
//
//    @Mock
//    private ProfessionConverter professionConverter;
//
//    @InjectMocks
//    private ProfessionController professionController;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        this.mockMvc = MockMvcBuilders.standaloneSetup(professionController).build();
//    }
//
//    @Test
//    void testGetAllProfessions() throws Exception {
//        Profession profession = new Profession();
//        profession.setId(1L);
//        profession.setName("Doctor");
//
//        ProfessionDTO professionDTO = new ProfessionDTO();
//        professionDTO.setId(1L);
//        professionDTO.setName("Doctor");
//
//        when(professionService.findAll()).thenReturn(Arrays.asList(profession));
//        when(professionConverter.toDto(profession)).thenReturn(professionDTO);
//
//        mockMvc.perform(get("/api/professions")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is("Doctor")));
//    }
//
//    @Test
//    void testGetProfessionById() throws Exception {
//        Profession profession = new Profession();
//        profession.setId(1L);
//        profession.setName("Doctor");
//
//        ProfessionDTO professionDTO = new ProfessionDTO();
//        professionDTO.setId(1L);
//        professionDTO.setName("Doctor");
//
//        when(professionService.findById(1L)).thenReturn(Optional.of(profession));
//        when(professionConverter.toDto(profession)).thenReturn(professionDTO);
//
//        mockMvc.perform(get("/api/professions/1")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is("Doctor")));
//    }
//
//    @Test
//    void testCreateProfession() throws Exception {
//        Profession profession = new Profession();
//        profession.setName("Doctor");
//
//        ProfessionDTO professionDTO = new ProfessionDTO();
//        professionDTO.setName("Doctor");
//
//        when(professionService.save(profession)).thenReturn(profession);
//        when(professionConverter.toEntity(professionDTO)).thenReturn(profession);
//        when(professionConverter.toDto(profession)).thenReturn(professionDTO);
//
//        mockMvc.perform(post("/api/professions")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"name\":\"Doctor\"}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is("Doctor")));
//    }
//
//    @Test
//    void testUpdateProfession() throws Exception {
//        Profession profession = new Profession();
//        profession.setId(1L);
//        profession.setName("Doctor");
//
//        ProfessionDTO professionDTO = new Profes

}

