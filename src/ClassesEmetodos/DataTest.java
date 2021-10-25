package ClassesEmetodos;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data();

        d1.dia="09";
        d1.mes="agosto";
        d1.ano="2009";
        //com sys
        System.out.println(d1.Obterdata2());
        // sem sys
        d1.Obterdata();


        //System.out.printf("%s/%s/%s\n",d1.dia,d1.mes,d1.ano);

        d2.dia="30";
        d2.mes="abril";
        d2.ano="1995";
        //String data = d1.dia+"/"+d1.mes+"/"+d1.ano;
        //System.out.println(data);

        Data d3 = new Data();
       d3.Obterdata();
        Data d4 = new Data("04","04","1995");
d4.Obterdata();
    }
}
