package myGame.personajes;

import java.io.Serializable;

public abstract class personaje implements Serializable {

    private static final long serialVersionUID = -5278053839075039777L;
    private String nombre;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////VARIABLES

    public personaje(String nombre){
        this.nombre = nombre;
    }
    public personaje(){}

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////CONSTRUCTORES

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////GETTER Y SETTER

}
