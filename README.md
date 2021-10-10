# TAREA APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES
## AREP 2021-2 / 09 Octubre del 2021

Se debe construir una aplicacion con acceso segur desde un navegador y el acceso de servicios 
remotos  el cual debe garantizar autenticación, autorización e integridad entre los servicios.

## Prerrequisitos 
  Para este laboratorio se requiere tener instalado los siguientes programas: 
  
   + **Git:** Sistema de control de versiones que almacena cambios sobre un archivo o un 
  conjunto de archivos, permite recuperar versiones previas de esos archivos.
  
  + **Maven:** Maven es una herramienta open-source, que se creó con el objetivo 
  de simplificar los procesos de build (compilar y generar ejecutables a partir del código
  fuente).
  
  + **Docker:** Programa encargado de crear contenedores ligeros y portables para las aplicaciones 
  software que puedan ejecutarse en cualquier máquina con Docker instalado, independientemente 
  del sistema operativo que la máquina tenga por debajo, facilitando así también los despliegues.
  
  + **Java:** Java es un lenguaje de programación y una plataforma informática, con Java pueden realizarse
  programas en cualquier contexto y ambiente , siendo la portabilidad uno de sus principales logros.
  
  
  Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    + java --version
    
    
   ## Instalacion 
   
   Para descargar el proyecto de GitHub, primero debemos clonar el  repositorio con el siguiente comando
    
    git clone https://github.com/camilaFetecua/Arep-AppSecure.git
    
  Para ejecutar el rpoyecto con la herramienta Maven debemos ejecutar el siguiente comando.
     
     mvn package
     
     
  ## Arquitectura 
  
   Se tiene un login con un acceso encriptado de la contraseña para obtener el ingreso al servicio web.
   
   
   
  Se crearon las llaves y el certificado, lo cual hace que tengamos un servicio web seguro.
  
  
  
  Se crea el MyTrueStore 
  
  
  Se sube la imagen a docker y se corrre la imagen 
  
  
  Se prueba que los certificados y las llaves esten funcionando 
  
  
  En la instancia de AWS se instala docker y se corre la imagen.
  
  
  
  
  
  
     
     
     
     
     
     
     
     
     
     
     
  
  
