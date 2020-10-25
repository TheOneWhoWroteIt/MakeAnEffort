--changeset author:id1

CREATE TABLE IF NOT EXISTS app.user_app(
    id bigserial primary key,
    name varchar(128) not null,
    login varchar(128) not null unique,
    password varchar(256) not null,
    email varchar(128) not null,
    active boolean not null default(false),
    user_role serial
);