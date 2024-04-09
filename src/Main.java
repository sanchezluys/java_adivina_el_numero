import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // definimos las variables
        int maximo=100, intentos=4, aleatorio=new Random().nextInt(100), numero=0, maximosIntentos=intentos;
        int usados=0;
        String revisar="";
        int[] extraterrestre = {0xD83D, 0xDC7D};
        int[] caritaFeliz = {0xD83D, 0xDE00};
        int[] llorando = {0xD83D, 0xDE2D};
        boolean adivina=false;
        //***
        String emoticon_extraterrestre = new String(extraterrestre, 0, extraterrestre.length);
        String emoticon_feliz = new String(caritaFeliz, 0, caritaFeliz.length);
        String emoticon_llorando = new String(llorando, 0, llorando.length);
        //***
        Scanner teclado = new Scanner(System.in);
        //***
        System.out.println("************************");
        System.out.println("Reto: Adivina el número");
        System.out.println("************************");
        System.out.println("Escribe un número del 1 al "+ maximo + " cuentas con " + intentos + " intentos " + aleatorio + " maxIntentos="+maximosIntentos);
        //***
        while(intentos > 0) {
            numero = teclado.nextInt();
            usados++;
            if(numero > aleatorio){
                revisar=" menor ";
            }
            else{
                if(numero == aleatorio){
                    revisar=" Felicidades!!";
                    adivina=true;
                    intentos=0;
                    break;
                }
                else{
                    revisar=" mayor ";
                }
            }
            intentos--;
            if(intentos > 0){
                System.out.println("Casi!! el número secreto es " + revisar + " que tu numero " + numero);
                System.out.print(emoticon_extraterrestre + "Intentalo de nuevo, te quedan " + usados + " intentos ");
            }
        }
        teclado.close();
        if(adivina){
                System.out.println( emoticon_feliz + "Muy Bien!! Felicitaciones!! adivinaste el número en  " + usados + " intentos");
        }
        else{
            System.out.println(emoticon_llorando + "Que mal!! no adivinaste!! el número secreto era:  " + aleatorio);
        }

    }
}