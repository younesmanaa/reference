package ma.cst.ym.reference.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cst.ym.reference.dao.Employe;
import ma.cst.ym.reference.dao.EmployeDao;

@Service("employeService")
public class EmployeService {

	private EmployeDao employeDao;

	@Autowired
	public void setOffersDao(EmployeDao employeDao) {
		this.employeDao = employeDao;
	}

	public List<Employe> getCurrent() {

		return employeDao.getEmployes();

	}

	public void create(@Valid Employe employe) {
		employeDao.create(employe);

	}
}
