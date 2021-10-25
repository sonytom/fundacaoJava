package classesEmetodos;
// icrementar com aula 107;
public class ValorVsReferencia {

    public static void main(String[] args) {
        double a=5;
        // b recebe a

        double b=a; // atribuição por valor;
        // trabalhando com tipo primitivo

        a++;

        //a++ não altera por os dois valores ser idependentes
        //b inicializa recebendo 5 -- fica com 4
        // esta passando uma copia
        // os dois pode ter valores idependtendes mesmo um referenciado outro.

        b--;

        System.out.println(a+ "\n" +b);
//-----------------------------------------------------------------


        Data d1 = new Data("1","6","2022");

        Data d2 =d1; // atribuição por referencia
        // (trabalhando com objeto )
        d1.dia = "10";
        d2.mes="20";
        // diferente do de valor , ele ira impactar nos dois
        // por causa os dois estão referenciando o mesmo objeto em memoria
        // não esta passando uma copia mas sim o objeto em si
        System.out.println(d1.Obterdata2());
        System.out.println(d2.Obterdata2());
// alterando os dados com base na referencia do objeto
        voltarparapadrao(d1);
        System.out.println(d1.Obterdata2());

        // primitivo
// é gerado uma copia no memtno que foi passado
        // ou seja é passado por valor/ copia

int c=5;
alterarprimitivo(c);
        System.out.println(c);
    }
static void voltarparapadrao (Data d){
        d.dia="1";
        d.mes="1";
        d.ano="1970";
}

static void alterarprimitivo(int c){

        c++;
}


}
