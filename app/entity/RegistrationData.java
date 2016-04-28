package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class RegistrationData extends Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6748946369795828468L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	public String firstName;

	public String lastName;

	@Column(unique = true)
	public String emailId;

	public String password;

	public static Model.Finder<Long, RegistrationData> find = new Finder<>(
			RegistrationData.class);

	@Override
	public String toString() {
		return "RegistrationData [firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}

}
