# Sausage Store

![image](https://user-images.githubusercontent.com/9394918/121517767-69db8a80-c9f8-11eb-835a-e98ca07fd995.png)


## Technologies used

* Frontend – TypeScript, Angular.
* Backend  – Java 16, Spring Boot, Spring Data.
* Database – H2.

## Installation guide
### Backend

Install Java 16 and maven and run:

```bash
cd backend
mvn package
cd target
java -jar demo-0.0.1-SNAPSHOT.jar
```

### Frontend

Install NodeJS and npm on your computer and run:

```bash
npm install -g @angular/cli
cd frontend
npm install
ng serve --proxy-config proxy-conf.json
```

Then open your browser and go to [http://localhost:4200/#](http://localhost:4200/#)
