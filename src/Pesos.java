import java.io.Console;



 class Person{

private    String name;
private    int weight, height;


//constructor

    public Person(String name, int weight, int height){

        this.name=name;
        this.weight=weight;
        this.height=height;

    }

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

            System.out.printf("No hay una consola disponible");
            return;
        }




        try{
        name1 = c.readLine("Introduzca el nombre de la persona 1:");
        
        
        }catch(Exception e){
            System.out.println("Error al leer el nombre de la persona 1: " + e.getMessage());
        }




        try{

        weight1=Integer.parseInt(c.readLine("Introduzca el peso de la persona 1:"));

        }catch(Exception e){
            System.out.println("Error al leer el peso de la persona 1: " + e.getMessage());
        }




        try{

        height1=Integer.parseInt(c.readLine("Introduzca la altura de la persona 1:"));
        
        }catch(Exception e){
            System.out.println("Error al leer la altura de la persona 1: " + e.getMessage());
        }

        
        person1= new Person(name1, weight1, height1);
        



    }
}
