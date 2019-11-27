package Aviacao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author VictorBudal
 */

public class Voo{

    public static void main(String[] args) {


        int contador=1;
        List<Passageiro> lista = new ArrayList<>();
        Documento doc = new Documento();
        int idade[]= {15,30,55,68,72};
        List<Passageiro> MenorIdade = new LinkedList<>();
        List<Passageiro> MaiorIdade = new LinkedList<>();
        List<Passageiro> MeiaIdade = new LinkedList<>();
        

        for(int i = 0 ; i<5;i++){
            Passageiro cliente = new Passageiro();
            cliente.nome="Victor"+i;
            cliente.assento=i;
            cliente.idade=idade[i];
            doc.tipo=TipoDocumento.rg;
            doc.numero= "193.555.153.10";
            cliente.doc=doc;

            lista.add(cliente);

        }

        for(Passageiro i : lista){
            if(i.idade<18){
                MenorIdade.add(i);
            }else if(i.idade>65){
                MaiorIdade.add(i);
            }else if(i.idade>18 && i.idade<65){
                MeiaIdade.add(i);
            }
            
        }

        System.out.println("Fila dos Meia Idade");

        for(Passageiro j : MeiaIdade){
            System.out.println("Lugar na Fila "+contador);
            System.out.println("----------------------");
            
            System.out.println(j.nome);
            System.out.println(j.idade);
            System.out.println(j.assento);
            System.out.println(j.doc.tipo);
            System.out.println(j.doc.numero);

            System.out.println("----------------------");
            contador++;
        }

        System.out.println("Fila dos Menores de Idade");
        contador= 1;

        for(Passageiro j : MenorIdade){
            System.out.println("Lugar na Fila "+contador);
            System.out.println("----------------------");
            
            System.out.println(j.nome);
            System.out.println(j.idade);
            System.out.println(j.assento);
            System.out.println(j.doc.tipo);
            System.out.println(j.doc.numero);

            System.out.println("----------------------");
            contador++;
        }

        System.out.println("Fila dos Maiores de Idade");
        contador= 1;
        for(Passageiro j : MaiorIdade){
            System.out.println("Lugar na Fila "+contador);
            System.out.println("----------------------");
            
            System.out.println("Nome:"+j.nome);
            System.out.println("Idade:"+j.idade);
            System.out.println("Assento:"+j.assento);
            System.out.println("Tipo do Documento:"+j.doc.tipo);
            System.out.println("Numero do Documento:"+j.doc.numero);

            System.out.println("----------------------");
            contador++;
        }
    }
}