package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> p = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		docs.add((Doctor) d);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		p.add(patient);

	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int index = 0;
		for (int i = 0; i < docs.size(); i++) {
			try {
				for (int j = 0 + index; j < 3 + index; j++) {
					docs.get(i).assignPatient(p.get(j));
					 //System.out.println("Doc " + i + " gets patient " + j);
				}
				index += 3;
			} catch (Exception e) {
				break;
			}
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

}
