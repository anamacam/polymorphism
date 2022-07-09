# polymorphism
Repositorio para realizar prácticas de poliformismo a fin de identificar la capacidad que tienen los objetos de una clase en ofrecer respuestas distintas  e indepentdientes  en función de los parámetros.

## Diagrama UML

```mermaid
        classDiagram
        
        class Articulo{
                    # identificador
                    # nombre
                    # costo
                    # fechaVencimiento
                    # canastaBasica
                    + obtenerPrecio()
                    
                    }
                    
        class Arroz{
                 + tipo
                 + obtenerPrecio()
        
        }
        
        Articulo <|-- Arroz
        
        class Leche{
                 + esEntera
                 + obtenerPrecio()
                
                 
        }
        
        Articulo <|-- Leche
        
        class Vino{
                + añejamiento
                + obtenerPrecio()
        
        }
        
        Articulo <|-- Vino
        
                    
 ```
 
 ## ¿Cómo se valida la definición semántica de una herencia?
 
La herencia expresa una relación “ES UN/UNA” entre la subclase y la superclase.
Esto significa que un objeto de una subclase es también un objeto de la superclase.
Al contrario NO es necesariamente cierto. Un objeto de la superclase no necesariamente es un objeto de la subclase.






