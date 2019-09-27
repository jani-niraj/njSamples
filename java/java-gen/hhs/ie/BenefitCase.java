package hhs.ie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "STGFAM_CASE")
public class BenefitCase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "CASE_ID")
	@TableGenerator(name = "CASE_ID", table = "STGFAM_CASE", pkColumnName = "ID_TYPE_CD", pkColumnValue = "CS", valueColumnName = "CURRENT_ID_VAL", allocationSize = 1)
	@Column(name = "AMPS_CASE_ID")
	private Integer amps_case_id;

	@Column(name = "AMPS_CASE_ID_REF")
	private Integer amps_case_id_ref;

	@Column(name = "APPL_SOURCE_CD")
	private String appl_source_cd;

	public Integer getAmps_case_id() {
		return this.amps_case_id;
	}

	public void setAmps_case_id(Integer amps_case_id) {
		this.amps_case_id = amps_case_id;
	}

	public Integer getAmps_case_id_ref() {
		return this.amps_case_id_ref;
	}

	public void setAmps_case_id_ref(Integer amps_case_id_ref) {
		this.amps_case_id_ref = amps_case_id_ref;
	}

	public String getAppl_source_cd() {
		return this.appl_source_cd;
	}

	public void setAppl_source_cd(String appl_source_cd) {
		this.appl_source_cd = appl_source_cd;
	}

}
