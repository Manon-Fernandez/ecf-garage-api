
# Garage back-end

Ce repository est le back-end de l'ECF garage, application pour Vincent Parrot.


## Pré-requis
Il vous faudra sur votre poste :
- [Maven](https://dlcdn.apache.org/maven/maven-3/3.9.3/binaries/apache-maven-3.9.3-bin.zip)
- [Java 17](https://www.graalvm.org/downloads/#)

ou 

- [Docker](https://www.docker.com/products/docker-desktop)

N'oubliez pas egalement un IDE, vous aidant de manière considérable.
- [Visual Studio code](https://code.visualstudio.com/)
- [IntelliJ](https://www.jetbrains.com/fr-fr/pycharm/download/)

## Utilisation

### Sans Docker
Afin de pouvoir lancer le projet, vous devez lancer à la racine :
```bash
mvn install 
 ```
Cela permettera d'obtenir sur votre poste toutes les dependances du projet, puis, lancez :
```bash
./mvnw spring-boot:run
```
L'application va demarrer et un jeu de données est automatiquement mis en base. Vous pourrez via votre port 8081 interargir avec celle-ci.
Chaque requête que vous effectuerez, devra être après un '/api', par exemple : http://localhost:8081/api/voiture.

PS : le back-end utilise une base de données en ligne, pas besoin de modifier la configuration.

### Avec Docker
Afin de pouvoir lancer le projet, vous devez lancer à la racine :
```bash
docker-compose up -d
 ```

## Identifiant

L'application possède par defaut un utilisateur, l'identifiant est : vparrot@garageparrot.fr et le mot de passe : &1AOJLKO&!98a

## Création d'un utilisateur

Vous pouvez créer un utilisateur via la requête suivante : 
```bash
POST http://localhost:8081/api/auth/signup
{
    "username": "username",
    "password": "password",
    "roles": [
        "admin" // ou "employe"
    ]
}
```
A noter que le mot de passe doit contenir au moins 10 caractères, une majuscule, une minuscule, un chiffre et un caractère spécial.
Il sera par la suite hashé en BCrypt.

### Connexion

Vous pouvez vous connecter via la requête suivante : 
```bash
POST http://localhost:8081/api/auth/signin
{
    "email": "email",
    "password": "password"
}
```
Vous obtiendrez un token, qui vous permettra d'effectuer des requêtes sur l'application.

## Auteur
Manon FERNANDEZ.



