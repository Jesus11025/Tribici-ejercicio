-- Insertar Estaciones
INSERT INTO estacion (id_estacion, numero, nombre, coordenadas, capacidad) VALUES (1, 101, 'Estación Plaza Mayor', '37.3891,-5.9845', 20);
INSERT INTO estacion (id_estacion, numero, nombre, coordenadas, capacidad) VALUES (2, 102, 'Estación Parque María Luisa', '37.3772,-5.9869', 15);
INSERT INTO estacion (id_estacion, numero, nombre, coordenadas, capacidad) VALUES (3, 103, 'Estación Triana', '37.3886,-5.9976', 25);
INSERT INTO estacion (id_estacion, numero, nombre, coordenadas, capacidad) VALUES (4, 104, 'Estación Nervión', '37.3758,-5.9732', 18);
INSERT INTO estacion (id_estacion, numero, nombre, coordenadas, capacidad) VALUES (5, 105, 'Estación Macarena', '37.4028,-5.9941', 12);

-- Insertar Bicicletas
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (1, 'Orbea', 'Urban 20', 0, 1);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (2, 'BH', 'City Wave', 1, 1);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (3, 'Giant', 'Escape 3', 1, 1);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (4, 'Trek', 'FX 2', 1, 2);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (5, 'Specialized', 'Sirrus', 2, 2);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (6, 'Cannondale', 'Quick 4', 1, 3);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (7, 'Scott', 'Sub Cross 20', 3, 3);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (8, 'Cube', 'Town Hybrid', 1, 4);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (9, 'Merida', 'Crossway 100', 1, 4);
INSERT INTO bicicleta (id_bici, marca, modelo, estado_bicis, estacion_id_estacion) VALUES (10, 'Orbea', 'Comfort 30', 1, 5);

-- Insertar Usuarios
INSERT INTO usuario (id_usuario, nombre, num_tarjeta, pin, saldo) VALUES (1, 'Juan Pérez', '1234567890123456', '1234', 50.00);
INSERT INTO usuario (id_usuario, nombre, num_tarjeta, pin, saldo) VALUES (2, 'María García', '2345678901234567', '5678', 75.50);
INSERT INTO usuario (id_usuario, nombre, num_tarjeta, pin, saldo) VALUES (3, 'Carlos López', '3456789012345678', '9012', 30.25);
INSERT INTO usuario (id_usuario, nombre, num_tarjeta, pin, saldo) VALUES (4, 'Ana Martínez', '4567890123456789', '3456', 100.00);
INSERT INTO usuario (id_usuario, nombre, num_tarjeta, pin, saldo) VALUES (5, 'Pedro Sánchez', '5678901234567890', '7890', 45.75);

-- Insertar Usos
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (1, '2026-01-01 10:00:00', '2026-01-01 10:30:00', 2.50, 2, 1, 2, 1);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (2, '2026-01-02 12:15:00', '2026-01-02 13:00:00', 3.75, 4, 2, 3, 2);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (3, '2026-01-03 09:30:00', '2026-01-03 10:15:00', 2.25, 6, 3, 4, 3);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (4, '2026-01-04 16:45:00', '2026-01-04 17:30:00', 2.75, 8, 4, 5, 4);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (5, '2026-01-05 08:00:00', '2026-01-05 08:45:00', 2.50, 10, 5, 1, 5);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (6, '2026-01-06 14:20:00', '2026-01-06 15:10:00', 3.00, 3, 1, 3, 1);
INSERT INTO uso (id_uso, fecha_inicio, fecha_fin, coste, bicicleta_id_bici, inicio_id_estacion, fin_id_estacion, usuario_id_usuario) VALUES (7, '2026-01-07 11:00:00', '2026-01-07 11:50:00', 3.25, 9, 4, 2, 2);

