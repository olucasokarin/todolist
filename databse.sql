create table task (
    id serial primary key,
    title varchar(255),
    done boolean default false,
    description varchar(255),
    created_at timestamp default now(),
    updated_at timestamp default now()
)

insert into task (title, description) values
('task 1', 'description 1'),
('task 2', 'description 2'),
('task 3', 'description 3')