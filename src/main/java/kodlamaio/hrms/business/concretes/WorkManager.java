package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.dataAccess.abstracts.WorkDao;
import kodlamaio.hrms.entities.concretes.Work;

@Service
public class WorkManager implements WorkService {
	
	private WorkDao workDao;

	@Autowired
	public WorkManager(WorkDao workDao) {
		super();
		this.workDao = workDao;
	}
	
	@Override
	public List<Work> getAll(){
		return this.workDao.findAll();
	}
}