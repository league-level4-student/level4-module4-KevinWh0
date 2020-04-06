package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> pList = new ArrayList<Patient>();
	Boolean canDoSurgery = false;

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	void canDoSurgery(Boolean s) {
		canDoSurgery = s;
	}

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		if (this.getClass().getTypeName().equals("_04_hospital.Surgeon"))
			return true;
		else
			return false;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pList;
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		pList.add(patient);
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).feelsCaredFor = true;
		}
	}

}
