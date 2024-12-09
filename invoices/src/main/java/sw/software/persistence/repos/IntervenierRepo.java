package sw.software.persistence.repos;

import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.transaction.Transactional;
import sw.software.persistence.models.Address;
import sw.software.persistence.models.Intervener;

public class IntervenierRepo implements PanacheRepository<Intervener> {

    public Intervener findByIdExterno(String idExterno) {
        return find("idExterno", idExterno).firstResult();
    }

    public Intervener findByCpfCnpj(String cpfCnpj) {
        return find("cpfCnpj", cpfCnpj).firstResult();
    }

    public Intervener findByInscricaoEstadual(Integer stateRegistration) {
        return find("inscricaoEstadual", stateRegistration).firstResult();
    }

    @Transactional
    public void saveIntervenienteComEndereco(Intervener intervener, Address address) {
        persist(intervener); // Salva o Interveniente no banco
        address.setIdIntervener(intervener.getIdExterno()); // Associa o Endereco ao Interveniente
        Panache.getEntityManager().persist(address); // Salva o Endereco no banco
    }
}
