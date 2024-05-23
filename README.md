# Cassandra Spring Boot Application

## Introduction

L'objectif de ce projet est de manipuler une base de données Cassandra à partir d'une application Spring Boot, pour gérer un keystore nommé `ecommerce` qui contient une table `products`. Ce projet permet de comprendre comment intégrer Cassandra, une base de données NoSQL distribuée, avec Spring Boot, un framework Java moderne pour le développement d'applications.

## Prérequis

- Docker
- Docker Compose
- Java 8 ou supérieur
- Maven

## Configuration Docker

Vous pouvez trouver ici le fichier `docker-compose.yaml` pour configurer et démarrer un conteneur Cassandra.

```
version: '3'
services:
  cassandra:
    image: cassandra:latest
    container_name: cassandra
    ports:
     - "9042:9042"
```
