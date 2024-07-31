CREATE TABLE professional.user_professions
(
    professional_id BIGINT NOT NULL,
    profession_id   BIGINT NOT NULL,
    FOREIGN KEY (professional_id) REFERENCES professional (id),
    FOREIGN KEY (profession_id) REFERENCES profession (id),
    PRIMARY KEY (professional_id, profession_id)
);