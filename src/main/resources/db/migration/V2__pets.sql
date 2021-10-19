CREATE TABLE pet
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_pet PRIMARY KEY (id)
);

INSERT INTO pet (id, name) VALUES (1, 'Fido');
INSERT INTO pet (id, name) VALUES (2, 'Mimi');