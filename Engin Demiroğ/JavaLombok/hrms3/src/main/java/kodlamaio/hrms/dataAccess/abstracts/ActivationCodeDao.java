package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {
	List<ActivationCode> getByIsActivated(boolean isActivated);
	List<ActivationCode>getByIsCodeConfirmed(boolean confirmedCode);
}
