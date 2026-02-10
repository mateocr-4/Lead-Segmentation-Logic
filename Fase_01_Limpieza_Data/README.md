# 🚀 Lead Segmentation Logic: Fase 01 - Data Cleaning

## 📋 1. Contexto de Negocio
En el ecosistema del Marketing Digital, la entrada de datos (leads) suele presentar inconsistencias: mayúsculas arbitrarias, espacios en blanco innecesarios o dominios no deseados. Este script en Java actúa como una **capa de pre-procesamiento (Data Pipeline)** para garantizar que los datos que entran al CRM sean únicos, limpios y estén pre-clasificados.

## 🎯 2. Objetivos del Sistema
Este módulo de software resuelve tres retos operativos:
1. **Normalización:** Unificar el formato de los emails para evitar duplicados por errores de escritura.
2. **Validación de Calidad:** Identificar registros incompletos o mal formados (nombres demasiado cortos).
3. **Scoring Automático:** Diferenciar el origen del lead (Corporativo vs. Público) para priorizar el esfuerzo comercial.

## 🛠️ 3. Lógica Técnica Aplicada
Para esta fase de limpieza, el programa ejecuta los siguientes métodos de manipulación de cadenas (`Strings`):

* **`trim()`**: Eliminación de ruido (espacios) en los extremos del texto.
* **`toLowerCase()`**: Estandarización a minúsculas para comparaciones exactas.
* **`length()`**: Verificación de longitud mínima para asegurar la integridad del contacto.
* **`contains()` / `endsWith()`**: Análisis de patrones en el dominio para segmentación VIP.

## 📊 4. Matriz de Segmentación (Lead Scoring)
| Atributo | Condición | Categoría | Acción Comercial |
| :--- | :--- | :--- | :--- |
| **Dominio** | `@empresa.com` | **VIP (B2B)** | Asignar a Ejecutivo Senior |
| **Dominio** | `@gmail.com` | **Estándar (B2C)** | Iniciar secuencia de Email |
| **Longitud** | `< 3 caracteres` | **Inválido** | Descartar registro |

## 💻 5. Tecnologías
* **Lenguaje:** Java 17+
* **Paradigma:** Lógica procedimental para procesamiento de flujos.
* **Estructura:** Organizado en carpeta `src/` para estándares DAW.