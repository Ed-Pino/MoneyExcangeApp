# 💱 Conversor de Divisas CLI

---

## 📁 Índice

* [💱 Título e imagen de portada](#-currency-converter-cli)
* [🏅 Insignias](#-insignias)
* [📁 Índice](#-indice)
* [💾 Descripción del proyecto](#-descripción-del-proyecto)
* [🟢 Estado del proyecto](#-estado-del-proyecto)
* [✨ Características de la aplicación y demostración](#-características-de-la-aplicación-y-demostración)
* [🚀 Acceso al proyecto](#-acceso-al-proyecto)
* [💪 Tecnologías utilizadas](#-tecnologías-utilizadas)
* [👨🏾‍🤝‍👨🏼 Personas Contribuyentes](#-personas-contribuyentes)
* [👨‍💻 Personas Desarrolladoras del Proyecto](#-personas-desarrolladoras-del-proyecto)
* [📄 Licencia](#-licencia)
* [✅ Conclusión](#-conclusión)

---

## 💾 Descripción del Proyecto

**Conversor de Divisas CLI** es una herramienta de línea de comandos desarrollada en Java que permite convertir montos entre distintas monedas latinoamericanas y el dólar estadounidense en tiempo real. El objetivo principal es proporcionar una utilidad ligera, rápida y funcional para quienes necesiten realizar conversiones de divisas sin utilizar interfaces gráficas o aplicaciones complejas.

---

## 🟢 Estado del Proyecto

Actualmente, el proyecto está en fase de desarrollo activo. Se encuentra funcional para conversiones básicas, con planes de incorporar más monedas y una interfaz gráfica futura.

---

## ✨ Características de la Aplicación y Demostración

* 🔁 Conversión bidireccional entre:

  * USD ⇄ ARS (Peso argentino)
  * USD ⇄ BRL (Real brasileño)
  * USD ⇄ COP (Peso colombiano)
* 📡 Tasas de cambio en tiempo real desde una API pública
* 🧠 Interfaz CLI intuitiva
* 🛡️ Validación de entradas y manejo de errores

Ejemplo de uso:

```bash
============================
   Conversor de Divisas CLI
============================
Seleccione una opción:
1. USD → ARS
2. ARS → USD
3. USD → BRL
4. BRL → USD
5. USD → COP
6. COP → USD
Ingrese su elección: 1
Ingrese el monto en USD: 100
Tasa actual: 1 USD = 850 ARS
Resultado: 100 USD = 85,000 ARS
```

---

## 🚀 Acceso al Proyecto

1. Clona este repositorio:

```bash
git clone git@github.com:Ed-Pino/MoneyExcangeApp.git
cd MoneyExcangeApp
```

2. Asegúrate de tener Java 17 o superior instalado.

3. Obtén una clave de API en [exchangerate-api.com](https://www.exchangerate-api.com/).

4. Ejecuta el proyecto desde la terminal:

```bash
javac Main.java
java Main
```

---

## 💪 Tecnologías utilizadas

* **Java 17+**
* **API REST (ExchangeRate API)**
* **CLI interactivo (Scanner + lógica condicional)**
* **Manejo de errores en tiempo de ejecución**

---

## 👥 Personas Contribuyentes

Aún no se han registrado colaboradores externos. ¡Las contribuciones son bienvenidas!

---

## 👨‍💻 Personas Desarrolladoras del Proyecto

* **Ed Pino** - [GitHub](https://github.com/Ed-Pino) | Desarrollador principal

---

## 📄 Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

## ✅ Conclusión

**Conversor de Divisas CLI** es una herramienta práctica y ligera para usuarios que buscan convertir divisas rápidamente desde la terminal. En futuras versiones se añadirán más monedas, historial de conversiones y una interfaz web.

¿Tienes sugerencias o deseas contribuir? ¡Abre un *issue* o *pull request* en el repositorio!

---
