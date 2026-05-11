interface animal{
void sound();

}
class dog implements animal{
public void sound(){
System.out.println("Dog Barks");
}

}

class cat implements animal{
public void sound(){
System.out.println("Cat Meowsss");
}

}
class cow implements animal{
public void sound(){
System.out.println("Cow MOOSSS");
}

}
class Inhrt{
public static void main(String [] args){
animal a1=new dog();
animal a2=new cat();
animal a3=new cow();
a1.sound();
a2.sound();
a3.sound();

}

}