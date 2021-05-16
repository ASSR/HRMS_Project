package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Work;

public interface WorkService {
	List<Work> getAll();
}