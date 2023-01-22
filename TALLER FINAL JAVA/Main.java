import java.util.Scanner;
public class Main

{
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("bienvenido recuerde que puede hacer 5 operaciones suma(+), resta(-), multiplicacion(*), division(/) y modulo de la division(%) ");
System.out.println("recuerde separar las operaciones con espacios ejemplo: 5 + 5");
Double num=0.0,a,c,res=0.0,d=0.0;//definimos las variables y las inicializamos
a=x.nextDouble();//solicitamos el primer numero
String b=x.next();//solicitamos el signo
c=x.nextDouble();//solicitamos el segundo numero
if (b.equals("+")) {//si el signo es de suma a y b se van a sumar y su resultado se va a almacenar en d
    d=a+c;
    System.out.println(d);
}
else if (b.equals("-")) {//si el signo es de resta a y b se van a restar y su resultado se va a almacenar en d
    d=a-c;
    System.out.println(d);
}
else if (b.equals("*")) {//si el signo es de multiplicacion a y b se van a multiplicar y su resultado se va a almacenar en d
    d=a*c;
    System.out.println(d);
}
else if (b.equals("/")) {//si el signo es de division a y b se van a dividir y su resultado se va a almacenar en d
    if(c!=0){
    d=a/c;
    System.out.println(d);}
    else {
        System.out.println("no se puede dividir entre 0");
    }
}
else if (b.equals("%")) {//si el signo es de modulo a y b se van a dividir y el residuo de la division sera su resultado se va a almacenar en d
    d=a%c;
    System.out.println(d);
}
else{
    System.out.println("signo incorrecto");
}
for(int z=1;z<=100;z++){// de aqui en adelante solo se solicitaran 2 variables la del signo y el numero 2 ya que el numero 1 sera el resultado de la operacion anterior
    String signo= x.next();
    num= x.nextDouble();
    if(signo.equals("+")){
        res=d+num;
        System.out.println(res);
    }
    if(signo.equals("-")){
        res=d-num;
        System.out.println(res);
    }
    if(signo.equals("*")){
        res=d*num;
        System.out.println(res);
    }
    if(signo.equals("/")){
        if(num!=0){
        res=d/num;
        System.out.println(res);}
        else {
        System.out.println("no se puede dividir entre 0");
    }
    }
    if(signo.equals("%")){
        res=d%num;
        System.out.println(res);
    }
    d=res;
}
}
}

//stefany rojas
