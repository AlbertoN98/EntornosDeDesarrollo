# Tasca 1.
##### Ejercicios
1. En la función1… Què fan aquestes línies de codi?

String string2 = "string2";
string2= string2.substring(0, string2.length()-1);
string2=string2+"1";

- Lo que hace es quitar la ultima palabra y despues añadirle el 1 quedaria en String1.

2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?

- String1 vale String1 y String2 ha cambiado a String1.

3. Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest?

- Habría que usar  if(string1.equals(string2)) 

- por que == compara por referencia y con el metodo .equals compara por valor.

4. . La función2() està declarada como lo siguiente:

public void funcion2() {

System.out.println("--------------------");

System.out.println("Aquesta és la funció 2");

System.out.println("Como hago la llamada para que funcione????");

}

- Para que funcione tenemos que insertar en el main lo siguiente:

ED_Debug metodo = new  ED_Debug();

metodo.funcion2();

