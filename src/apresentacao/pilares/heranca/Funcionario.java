package apresentacao.pilares.heranca;

import java.util.Date;


public class Funcionario extends Pessoa {

    public Funcionario(String _nome, String _cpf, Date _data,String _estadocivil) {
        super(_nome, _cpf, _data,_estadocivil);
    }

    public double salario;
    public Date data_admissao;
    public String cargo;
}