ALTER TABLE pet
    ADD owner_id BIGINT;

ALTER TABLE pet
    ADD CONSTRAINT FK_PET_ON_OWNER FOREIGN KEY (owner_id) REFERENCES owner (id);

UPDATE pet
SET owner_id = 1
where id = 1;

update pet
set owner_id = 2
where id = 2;