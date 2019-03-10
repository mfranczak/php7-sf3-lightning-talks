# Coding Companion 

---

# Adding new projects (1)
Create an endpoint that will be used to add new projects to Repository. Send Project data as json.

- https://symfony.com/doc/3.4/components/http_foundation.html#accessing-request-data
- https://symfony.com/doc/3.4/validation.html
- 

---

# Repository for Projects (2)
Implement a new Repository for Projects. It should read projects from a json file that is stored locally and serialize the entire repository to the same file. Do not add the storage json file to repository.

:warning: It's not the best way to deal with it but for now pls use:
- http://php.net/manual/en/function.file-put-contents.php
- http://php.net/manual/en/function.file-get-contents.php

---

# Security (3)
Protect the "Add Project" endpoint with basic in_memory security by symfony security. Hard code credentials.

https://symfony.com/doc/3.4/security.html
https://symfonycasts.com/screencast/symfony3-security

--- 

# Dependency Injection Container (4) :bulb:
Move your controllers and repositories to dependency injection container.

---

# Docker (5) :bulb:
Use docker to run your project

---

# MySQL (6) :bulb:
Implement Doctrine repository to manage Projects.

---

# Joining projects (7) :bulb:
Hard code more users and allow them to join projects
