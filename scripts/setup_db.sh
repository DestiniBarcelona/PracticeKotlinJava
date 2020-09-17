#!/usr/bin/env bash
mysql -u root -e "create database kotlindev;"
mysql -u root -e "create user 'kotlin'@'localhost';"
mysql -u root -e "GRANT ALL PRIVILEGES ON kotlindev.* TO 'kotlin'@'localhost';"
