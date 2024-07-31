CREATE TABLE profession
(
    id                 SERIAL PRIMARY KEY,
    name               VARCHAR(100)                        NOT NULL UNIQUE,
    category           VARCHAR(255)                        NOT NULL,
    status             VARCHAR(45)                         NOT NULL,
    created_date       TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    last_modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by         VARCHAR(50)                         NOT NULL,
    last_modified_by   VARCHAR(50)                         NOT NULL
);


