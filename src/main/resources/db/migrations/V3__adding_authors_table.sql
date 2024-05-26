--liquibase formatted sql

-- changeset aymane:1
create table "authors" (
    "id" int NOT NULL,
    "isbn" text NOT NULL,
    "title" text,
    constraint "author_pkey" primary key ("id")
);