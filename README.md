# polymorphism
Repositorio para realizar prácticas de poliformismo para identificar la capacidad que tienen los objetos de una clase en ofrecer respuestas distintas  e indepentdientes  en función de los parámetros.

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

