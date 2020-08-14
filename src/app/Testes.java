package app;

import model.bd.Db;
import model.dao.CertificadoraDao;
import model.entidades.Certificadora;

/**
 *
 * @author maycon
 */
public class Testes {

    //Teste Db
    public static void main(String[] args) {
        try {
            //Cria a Certificadora:
            Certificadora Certificadora = new Certificadora();

            //Instacia o Dao e fazer a conexão
            CertificadoraDao CertificadoraDao = new CertificadoraDao(Db.getConection());
            
            //faz um insert:
            CertificadoraDao.insert(Certificadora);

            System.out.println("Teste de banco realizado com sucesso!!");
        } catch (Exception e) {
            System.out.println("Erro ao testar \nErro:");
            e.printStackTrace();
        }
    }
}
