package sw.software.persistence.repos;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;
import sw.software.persistence.models.Payee;

@RequestScoped
public class PayeeRepo implements PanacheRepository<Payee> {

    public Payee findByIdExterno(String idExterno) {
        return find("idExterno", idExterno).firstResult();
    }

    @Override
    public Payee findById(Long id){
        return find("id", id).firstResult();
    }
}
