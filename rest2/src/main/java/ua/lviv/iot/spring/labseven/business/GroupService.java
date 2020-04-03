package ua.lviv.iot.spring.labseven.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.labseven.data.GroupRepository;
import ua.lviv.iot.spring.labseven.data.StudentRepository;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Group;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Student;


@Service
public class GroupService {
	@Autowired
	private GroupRepository groupRepository;

	public List<Group> findAll(){
		return groupRepository.findAll();
	}
	

}
