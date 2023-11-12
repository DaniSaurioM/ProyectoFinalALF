import java.io.*;
import java.util.*;

public class MT {
    public static void main(String[] args) {
      System.out.println(" \n\n\t\tMaquina  de  Turing ");
      int menuOpcion;
      do{
      System.out.println(" \nPuedes escoger entre dos MT para acceder a ellas ");
      System.out.println("Ingrese LongitudPar.txt o TerminaEnUno.txt ");
        Scanner archivo = new Scanner(System.in);
        String dir,alfabeto,c,c1,c2,menu;
        char[] cadena, cp1,cp2,NumOpcion;
        char opcion;
        dir = archivo.nextLine();
        alfabeto = LeerAlfabeto(dir);
        menu = LeerOpcion(dir);
        NumOpcion = menu.toCharArray();
        opcion=NumOpcion[0];
        int sali;

        if(opcion=='1'){
          System.out.println("\nEsta MT acepta las cadenas con longitud par.");
          System.out.println("Alfabeto: " + alfabeto);
          do{
            System.out.println("\nIngrese la cadena tratar: ");
            c1 = archivo.nextLine();
            c1=c1+"b";
            iniciarMT(c1,dir);
            System.out.println("\nPara ingresar otra cadena precione 1 en caso contrario 0");
            Scanner salir = new Scanner (System.in);
            sali = salir.nextInt ();
          }
          while(sali!=0);
        }
        else if(opcion=='2'){
          System.out.println("\nEsta MT acepta las cadenas que terminen con 1.");
          System.out.println("Alfabeto: " + alfabeto);
          do{
            System.out.println("\nIngrese la cadena tratar: ");
            c2 = archivo.nextLine();
            c2=c2+"b";
            iniciarMT2(c2,dir);
            System.out.println("\nPara ingresar otra cadena precione 1 en caso contrario 0");
            Scanner salir = new Scanner (System.in);
            sali = salir.nextInt ();
         }
         while(sali!=0);
      }
      System.out.println("\nPara ingresar otra MT precione 1 en caso contrario 0");
      Scanner menuop = new Scanner (System.in);
      menuOpcion = menuop.nextInt ();
    }
    while(menuOpcion!=0);
    }

    public static String LeerOpcion(String dir){
      String s = "";
      try {
          BufferedReader bf = new BufferedReader(new FileReader(dir));
          s = bf.readLine();
      } catch (Exception ex) {
          System.out.println("No se encontro el archivo");
      }
      return s;
    }

    public static String LeerAlfabeto(String dir){
      String s = "";
      try {
          BufferedReader bf = new BufferedReader(new FileReader(dir));
          s = bf.readLine();
          s = bf.readLine();
      } catch (Exception ex) {
          System.out.println("No se encontro el archivo");
      }
      return s;
    }

    public static String LeerFunTran(String dir){
      String s = "";
      try {
          BufferedReader bf = new BufferedReader(new FileReader(dir));
          String txt = "";
          for (int i=0; i<=3; i++)txt = bf.readLine();
          while((txt=bf.readLine())!=null){
            s = s + txt;
          }
      } catch (Exception ex) {
          System.out.println("No se encontro el archivo");
      }
      return s;
    }

    public static String LeerEstadoi(String dir){
      String s = "";
      try {
          BufferedReader bf = new BufferedReader(new FileReader(dir));
          for (int i=0; i<=2; i++)s = bf.readLine();
      } catch (Exception ex) {
          System.out.println("No se encontro el archivo");
      }
      return s;
    }

    public static String LeerEstadof(String dir){
      String s = "";
      try {
          BufferedReader bf = new BufferedReader(new FileReader(dir));
          for (int i=0; i<=3; i++)s = bf.readLine();
      } catch (Exception ex) {
          System.out.println("No se encontro el archivo");
      }
      return s;
    }

    public static void iniciarMT(String c, String dir){
      String funtrans,ed,nuevo="";
      funtrans = LeerFunTran(dir);
      String[] fpf = funtrans.split("k");
      int posicion=0,i=0,j=0;
      char[] aux, cp,c1,eaux;
      char estado,estadofinal;
      ed = LeerEstadoi(dir);
      eaux = ed.toCharArray();
      estado=eaux[0];

      ed = LeerEstadof(dir);
      eaux = ed.toCharArray();
      estadofinal=eaux[0];
      c1 = c.toCharArray();
      while(i<fpf.length){
        j=0;
        i=0;
        while((j==0)&&(i<fpf.length)){
          aux = fpf[i].toCharArray();
          if(estado==aux[0]&&c1[posicion]==aux[1]){
            j=1;
            estado=aux[2];
            if(aux[4]=='D') posicion++;
            else if(aux[4]=='I')  posicion--;
          }
          else i++;
        }
      }
      i=0;

      c="";
      while(c1[i]!='b'){
        c=c+c1[i];
        i++;
      }
      if(estado==estadofinal){
        System.out.println("\ncadena aceptada por la Maquina de Turing");
      }
      else System.out.println("\ncadena no aceptada por la Maquina de Turing");
    }

    public static void iniciarMT2(String c, String dir){
      String funtrans,ed,nuevo="";
      funtrans = LeerFunTran(dir);
      String[] fpf = funtrans.split("k");
      int posicion=0,i=0,j=0;
      char[] aux, cp,c2,eaux;
      char estado,estadofinal;
      ed = LeerEstadoi(dir);
      eaux = ed.toCharArray();
      estado=eaux[0];

      ed = LeerEstadof(dir);
      eaux = ed.toCharArray();
      estadofinal=eaux[0];
      c2 = c.toCharArray();
      while(i<fpf.length){
        j=0;
        i=0;
        while((j==0)&&(i<fpf.length)){
          aux = fpf[i].toCharArray();
          if(estado==aux[0]&&c2[posicion]==aux[1]){
            j=1;
            estado=aux[2];
            if(aux[4]=='D') posicion++;
            else if(aux[4]=='I')  posicion--;
          }
          else i++;
        }
      }
      i=0;
      c="";
      while(c2[i]!='b'){
        c=c+c2[i];
        i++;
      }
      if(estado==estadofinal){
        System.out.println("\ncadena aceptada por la Maquina de Turing");
      }
      else System.out.println("\ncadena no aceptada por la Maquina de Turing");
    }
}