package classesEmetodos;
// thiss
//usado para acessar a variavel de instancia
public class Data {
    String dia;
    String mes;
    String ano;


    Data (String dia,String mes,String ano){
        // dia =dia; // não esta fazendo nada poois esta passando valor vazio para vario e não chamando a classe
        this.dia = dia;
        this.mes = mes;
        this.ano= ano;
    }

    Data (){
       // dia ="01";
       // mes="01";
      //  ano="1970";
        this("01","01","1970");
    }


void Obterdata (){
    System.out.printf("%s/%s/%s\n",dia,mes,ano);

}
String Obterdata2 (){
        // apenas obter dados pode acessar e ela nao pode ser mudada
        final String formato = "%s/%s/%s\n";
       return String.format(formato,this.dia,mes,ano);

    }



}
