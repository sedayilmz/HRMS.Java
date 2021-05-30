package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service

public class EmployerManager implements EmployerService {
	private EmployerDao employerdao;
	
	@Autowired

	public EmployerManager(EmployerDao employerdao) {
		super();
		this.employerdao = employerdao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerdao.findAll();
	}

	@Override
	public Result registerEmployer(Employer employer, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
