-- Insertar categorías
INSERT INTO categories (id, name) VALUES (1, 'Electronics');
INSERT INTO categories (id, name) VALUES (2, 'Books');
INSERT INTO categories (id, name) VALUES (3, 'Clothing');

-- Insertar productos asociados a categorías
INSERT INTO products (id, name, description, price, stock, category_id) VALUES
(1, 'ASUS TUF Gaming Laptop', 'Ryzen 7, RTX 4060, 16GB RAM', 23999.99, 10, 1),
(2, 'Apple AirPods Pro', 'Wireless noise-canceling earbuds', 4999.00, 25, 1),
(3, 'Atomic Habits', 'Book by James Clear', 299.00, 50, 2),
(4, 'Denim Jacket', 'Classic blue denim jacket', 799.00, 18, 3);
