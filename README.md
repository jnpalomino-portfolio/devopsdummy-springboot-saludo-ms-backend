# **DEVOPS DUMMY - SALUDO**
# **SPRINGBOOT - MAVEN**

## Descripción del proyecto
Este proyecto dummy consiste en un BackEnd contenerizado desarrollado en `Java` usando las herramientas `Springboot` y `Maven`, sus pruebas unitarias fueron desarrolladas utilizando `JUnit 5`, `Mockito` y `Spring Boot Test`.

## Funcionamiento
Este proyecto funciona como Backend del proyecto `subpage` de Springboot, devolviendo un saludo personalizado si ingresan el nombre o un hola mundo si llega vacío.

## Objetivo
El objetivo principal de este proyecto es proporcionar un proyecto de prueba para el equipo DevOps. Se utiliza para realizar pruebas de los pipelines de CI/CD desarrollados en el repositorio `devops-pipeline-cicd`. 

Los pasos del pipeline incluyen:

- Compilación de código.
- Ejecución de pruebas unitarias.
- Despliegue de imágenes a Azure Container Registry.
- Despliegue de la aplicación en OpenShift preproductivo y productivo en el namespace `devopsdummy`.

---

## **Implementación en local de la aplicación Dummy**
Para desplegar localmente la aplicación Dummy, se pueden seguir dos métodos: sin Docker o con Docker.

### **Opción 1: Instalación sin Docker**
#### **Tecnologías necesarias**
- JDK (Java 8 o superior)
- Maven
- git

#### **Pasos de instalación y ejecución**
1. Clonar el repositorio:
   ```sh
   git clone https://AlcaldiaMedellin@dev.azure.com/AlcaldiaMedellin/DevOps%20Dummy/_git/devopsdummy-springboot-saludo-ms-backend
   ```
2. Ingresar a la carpeta raíz del proyecto:
   ```sh
   cd devopsdummy-springboot-saludo-ms-backend
   ```
3. Compilar y empaquetar el proyecto:
   ```sh
   mvn clean install
   ```
4. Ejecutar la aplicación:
   ```sh
   java -jar target/springbootms1-0.0.1-SNAPSHOT.jar
   ```
5. La API estará disponible en: 
- [http://localhost:8081/saludo](http://localhost:8081/saludo)
- [http://localhost:8081/saludo?nombre=prueba](http://localhost:8081/saludo?nombre=prueba)

6. (Opcional) Ejecutar pruebas unitarias:
   ```sh
   mvn test
   ```
7. (Opcional) Ejecutar pruebas unitarias con cobertura:
   ```sh
   mvn test jacoco:report
   ```
---

### **Opción 2: Instalación con Docker**
#### **Tecnologías necesarias**
- Docker Desktop
- git

#### **Pasos de instalación y ejecución**

1. Clonar el repositorio:
   ```sh
   git clone https://AlcaldiaMedellin@dev.azure.com/AlcaldiaMedellin/DevOps%20Dummy/_git/devopsdummy-springboot-saludo-ms-backend
   ```
2. Ingresar a la carpeta raíz del proyecto:
   ```sh
   cd devopsdummy-springboot-saludo-ms-backend
   ```
4. Construir la imagen Docker:
   ```sh
   docker build -t devopsdummyspringbootsaludo:1 .
   ```
5. Ejecutar el contenedor:
   ```sh
   docker run -p 8081:8081 devopsdummyspringbootsaludo:1
   ```
6. La API estará disponible en: 
- [http://localhost:8081/saludo](http://localhost:8081/saludo)
- [http://localhost:8081/saludo?nombre=prueba](http://localhost:8081/saludo?nombre=prueba)

---