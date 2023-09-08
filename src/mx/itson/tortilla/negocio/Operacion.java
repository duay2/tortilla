package mx.itson.tortilla.negocio;
//contiene metodos para trabajar con cadenas de texto.
//@author Diego Preciado
public class Operacion {
   
//      separa una cadena de texto en donde encuentre el caracter guion madio
//      @param oracion es la oracion que sera separada en fracciones
//      @return Array de String cada componenete sera una fraccion de la cadena otorgada.

    public String[] separar(String oracion){
      String[] resultado = oracion.split("-");
      return resultado;
}
}
