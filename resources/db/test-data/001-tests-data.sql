INSERT INTO transporter (car_model, load_capacity, name) VALUES
    ('Reno', '300', 'Petro'),
    ('Reno', '500', 'Oleg'),
    ('Reno', '2000', 'Alex');

INSERT INTO warehouse (title, city, street, lat, lng) VALUES
    ('McDonald', 'Lviv', 'Main', '123.321.543', '213.65.344'),
    ('Cucumbers world', 'Kyiv', 'Chreshchatyk', '678.345.9876', '345.65.234'),
    ('Tomatoes world', 'Lviv', 'Main', '123.321.543', '213.65.344');

INSERT INTO delivery (cargo_amount, cargo_name, status, transporter, warehouse_from, warehouse_to) VALUES
    ('500','tomatoes', '2', '2', '1', '0'),
    ('200','cucumbers', '1', '1', '2', '0'),
    ('1000','pork', '0', '2', '1', '0'),
    ('500','tomatoes', '3', '3', '2', '0');






