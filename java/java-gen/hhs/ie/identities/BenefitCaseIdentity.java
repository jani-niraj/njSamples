package hhs.ie.identities;


import javax.persistence.Embeddable;
import java.io.Serializable;
import javax.persistence.Column;

@Embeddable
public class BenefitCaseIdentity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column (name="CASE_ID" )
	private Integer amps_case_id;
	
	// Getters
	public Integer getAmps_case_id() {
		return this.amps_case_id;
	}
	
	// Setters
	public void setAmps_case_id(Integer amps_case_id) {
		this.amps_case_id=amps_case_id;
	}
}
