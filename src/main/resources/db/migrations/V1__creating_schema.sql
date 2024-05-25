--liquibase formatted sql

-- changeset aymane:1
create table "books" (
    "isbn" text NOT NULL,
    "title" text,
    constraint "book_pkey" primary key ("isbn")
)