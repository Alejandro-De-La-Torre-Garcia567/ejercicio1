import java.io.Console;



 class Person{

private    String name;
private    int weight, height;

//getters y setters

public String getName(){
    return name;
}

public void setName(String name){

    this.name=name;
}


public int getWeight(){

    return weight;
}


public void setWeight(int weight){

    this.weight=weight;
}



public int getHeight(){

    return height;
}


public void setHeight(int height){

    this.height=height;
}



}







public class Pesos {
    public static void main(String[] args) throws Exception {
        

    Console c = System.console();        

        if(c==null){

            System.err.println("No console.");
            return;
        }
    
       Person p1=new Person();

       try{
        p1.setName(c.readLine("Ingrese su nombre: "));

       }catch(Exception e){
        System.out.println("Error al ingresar el nombre");
       }

       try{
        p1.setWeight(Integer.parseInt(c.readLine("Ingrese su peso: ")));
       }catch(Exception e){
        System.out.println("Error al ingresar el peso");
       }

       try{
        p1.setHeight(Integer.parseInt(c.readLine("Ingrese su altura: ")));
       }catch(Exception e){
        System.out.println("Error al ingresar la altura");
       }

       try{}

    }
}
