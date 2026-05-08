# Proyecto de Automatización de Pruebas - Examen Iplacex

Este proyecto implementa un ecosistema completo de **Integración Continua (CI) y Despliegue Continuo (CD)** utilizando Java 21, Maven, Selenium y GitHub Actions.

## 🚀 Características del Proyecto

- **Gestión de Dependencias:** Configuración robusta en Maven (`pom.xml`).
- **Suite de Pruebas:** \* Pruebas Unitarias (Lógica de cálculos).
  - Pruebas de Integración (Selenium).
  - Pruebas de Aceptación (Validación de reglas de negocio).
- **Pipeline de CI/CD:** Automatización mediante GitHub Actions con etapas de construcción, testeo y despliegue.
- **Mecanismos de Seguridad:** Implementación de **Rollback automático** en caso de fallo en las pruebas.

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 21
- **Build Tool:** Maven 3.9+
- **Testing:** JUnit 5 & Selenium WebDriver
- **CI/CD:** GitHub Actions
- **Control de Versiones:** Git (Flujo GitFlow con ramas master y develop)

## 📋 Cómo ejecutar las pruebas localmente

Para ejecutar la suite completa de pruebas en su máquina local, utilice el comando:

```bash
mvn test
```
