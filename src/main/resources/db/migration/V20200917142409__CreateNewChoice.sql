CREATE TABLE choices
(
    id INT(11) NOT NULL AUTO_INCREMENT,
    user TEXT(64),
    chosen TEXT (64),
    date_selected TIMESTAMP,
    PRIMARY KEY (id)
);
