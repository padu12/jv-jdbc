CREATE TABLE manufacturers (
    id BIGINT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) NULL,
    country VARCHAR(45) NULL,
    is_deleted VARCHAR(5) NULL DEFAULT 'FALSE' CHECK (is_deleted IN ('TRUE', 'FALSE')),
    PRIMARY KEY (id)
);