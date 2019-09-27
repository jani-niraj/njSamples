package hhs.ie.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import hhs.ie.BenefitCase;
import hhs.ie.services.BenefitCaseService;


@RestController
public class BenefitCaseController {
	@Autowired
	private BenefitCaseService benefitCaseService;

	@RequestMapping(value = "/getAllBenefitCase", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<BenefitCase> getAllBenefitCase() {
		List<BenefitCase> BenefitCaseList = benefitCaseService.getAllBenefitCase();
		return BenefitCaseList;
	}

	@RequestMapping(value = "/getBenefitCase/{amps_case_id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public BenefitCase getBenefitCaseById(	@PathVariable("amps_case_id") Integer amps_case_id	) {
		return benefitCaseService.getBenefitCase(	amps_case_id);
	}
	

	@RequestMapping(value = "/addBenefitCase", method = RequestMethod.POST, headers = "Accept=application/json")
	public BenefitCase addBenefitCase(@RequestBody BenefitCase benefitCase) {
		return benefitCaseService.addBenefitCase(benefitCase);
	}

	@RequestMapping(value = "/updateBenefitCase", method = RequestMethod.PUT, headers = "Accept=application/json")
	public BenefitCase updateBenefitCase(@RequestBody BenefitCase benefitCase) {
		return benefitCaseService.updateBenefitCase(benefitCase);
	}


	@RequestMapping(value = "/deleteBenefitCase/{amps_case_id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteBenefitCase(	@PathVariable("amps_case_id") Integer amps_case_id	) {
		benefitCaseService.deleteBenefitCase(	amps_case_id);
	}
}

