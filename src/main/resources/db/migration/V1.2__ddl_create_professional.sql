
CREATE TABLE professional
(
    id                 SERIAL PRIMARY KEY,
    description        TEXT,
    travel_distance    INT,
    fee                DECIMAL,
    status             VARCHAR(45)                         NOT NULL,
    created_date       TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    last_modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by         VARCHAR(50)                         NOT NULL,
    last_modified_by   VARCHAR(50)                         NOT NULL
);