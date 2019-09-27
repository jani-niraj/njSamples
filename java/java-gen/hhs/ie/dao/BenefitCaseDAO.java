package hhs.ie.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import hhs.ie.BenefitCase;
import hhs.ie.identities.BenefitCaseIdentity;

@Repository
public class BenefitCaseDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<BenefitCase> getAllBenefitCase() {
		//Session session = this.primaryEntityManager.unwrap(Session.class);
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<BenefitCase> BenefitCaseList = session.createQuery("from BenefitCase").list();
		return BenefitCaseList;
	}

	public BenefitCase getBenefitCase(Integer amps_case_id) {
		 Session session = sessionFactory.getCurrentSession();
		BenefitCase BenefitCase = (BenefitCase) session.get(BenefitCase.class, amps_case_id);
		return BenefitCase;
	}
	

	public BenefitCase addBenefitCase(BenefitCase BenefitCase) {
		/*
		 * Session session = this.primaryEntityManager.unwrap(Session.class);
		 * session.persist(BenefitCase);
		 */
		return BenefitCase;
	}

	public BenefitCase updateBenefitCase(BenefitCase BenefitCase) {
		/*
		 * Session session = this.primaryEntityManager.unwrap(Session.class);
		 * session.update(BenefitCase);
		 */
		return BenefitCase;
	}

	public void deleteBenefitCase(Integer amps_case_id) {
		/*
		 * Session session = this.primaryEntityManager.unwrap(Session.class); final
		 * BenefitCaseIdentity benefitCaseIdentity = new BenefitCaseIdentity();
		 * benefitCaseIdentity.setAmps_case_id(amps_case_id); BenefitCase p =
		 * (BenefitCase) session.load(BenefitCase.class, benefitCaseIdentity); if (null
		 * != p) { session.delete(p); }
		 */
	}
}
