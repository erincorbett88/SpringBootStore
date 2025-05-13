create table categories
(
    id tinyint auto_increment primary key,
    name varchar(255) null
);

create table products
(
    id bigint auto_increment primary key,
    name  varchar(255)   null,
    price decimal(10, 2) null,
    category_id tinyint,
    constraint fk_category
        foreign key (category_id) references categories (id)
            on delete restrict
);