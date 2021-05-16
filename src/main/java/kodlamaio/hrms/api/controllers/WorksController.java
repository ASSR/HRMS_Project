package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.entities.concretes.Work;

@RestController
@RequestMapping("/api/works")
public class WorksController {

private WorkService workService;
	
	@Autowired
	public WorksController(WorkService workService) {
		super();
		this.workService = workService;
	}

	@GetMapping("/getall")
	public List<Work> getAll() {
		return this.workService.getAll();
	}
}