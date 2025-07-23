-- SQLite Dump for Anganwadi App with Realistic Data
PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;

-- Table: children
DROP TABLE IF EXISTS children;
CREATE TABLE children (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    age INTEGER NOT NULL,
    gender TEXT NOT NULL,
    guardian_name TEXT NOT NULL,
    village TEXT NOT NULL
);

INSERT INTO children (id, name, age, gender, guardian_name, village) VALUES
(1, 'Aarav', 3, 'M', 'Suresh Kumar', 'Rampur'),
(2, 'Meera', 4, 'F', 'Rekha Devi', 'Bhagalpur'),
(3, 'Rohan', 2, 'M', 'Ramesh Yadav', 'Sitamarhi'),
(4, 'Anaya', 5, 'F', 'Kiran Kumari', 'Madhubani'),
(5, 'Kabir', 3, 'M', 'Anjali Verma', 'Muzaffarpur');

-- Table: attendance
DROP TABLE IF EXISTS attendance;
CREATE TABLE attendance (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    child_id INTEGER NOT NULL,
    date TEXT NOT NULL,
    status TEXT NOT NULL,
    FOREIGN KEY(child_id) REFERENCES children(id)
);

INSERT INTO attendance (id, child_id, date, status) VALUES
(1, 1, '2025-07-01', 'Present'),
(2, 2, '2025-07-01', 'Absent'),
(3, 3, '2025-07-01', 'Present'),
(4, 4, '2025-07-01', 'Present'),
(5, 5, '2025-07-01', 'Absent');

-- Table: health_checkups
DROP TABLE IF EXISTS health_checkups;
CREATE TABLE health_checkups (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    child_id INTEGER NOT NULL,
    checkup_date TEXT NOT NULL,
    weight_kg REAL NOT NULL,
    height_cm REAL NOT NULL,
    notes TEXT,
    FOREIGN KEY(child_id) REFERENCES children(id)
);

INSERT INTO health_checkups (id, child_id, checkup_date, weight_kg, height_cm, notes) VALUES
(1, 1, '2025-06-15', 11.5, 92, 'Healthy'),
(2, 2, '2025-06-16', 13.2, 98, 'Slight anemia observed'),
(3, 3, '2025-06-17', 10.0, 89, 'Below average weight'),
(4, 4, '2025-06-18', 14.0, 104, 'Good growth'),
(5, 5, '2025-06-19', 11.0, 91, 'Vitamin D deficiency');

COMMIT;
