package hhs.ie.services;

import java.util.List;
import hhs.ie.BenefitCase;
import hhs.ie.dao.BenefitCaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("BenefitCaseService")
public class BenefitCaseService {
	
	@Autowired
	private BenefitCaseDAO BenefitCaseDao;
	

	@Transactional
	public List<BenefitCase> getAllBenefitCase() {
		return BenefitCaseDao.getAllBenefitCase();
	}

	@Transactional
	public BenefitCase getBenefitCase(Integer amps_case_id) {
		return BenefitCaseDao.getBenefitCase(	amps_case_id);
	}
	

	@Transactional
	public BenefitCase addBenefitCase(BenefitCase benefitCase) {
		return BenefitCaseDao.addBenefitCase(benefitCase);
	}

	@Transactional
	public BenefitCase updateBenefitCase(BenefitCase benefitCase) {
		return BenefitCaseDao.updateBenefitCase(benefitCase);
	}

	@Transactional
	public void deleteBenefitCase(Integer amps_case_id) {
		BenefitCaseDao.deleteBenefitCase(	amps_case_id);
	}
}
