-- Anganwadi App: Full Schema and Sample Data

-- Table: children
CREATE TABLE children (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    age INTEGER NOT NULL
);

-- Insert sample data
INSERT INTO children (name, age) VALUES ('Aarav', 3);
INSERT INTO children (name, age) VALUES ('Meera', 4);
INSERT INTO children (name, age) VALUES ('Rohan', 2);
INSERT INTO children (name, age) VALUES ('Anaya', 5);
INSERT INTO children (name, age) VALUES ('Kabir', 3);
