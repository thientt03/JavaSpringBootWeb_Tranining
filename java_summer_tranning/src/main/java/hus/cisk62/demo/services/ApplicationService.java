package hus.cisk62.demo.services;

import hus.cisk62.demo.entities.ApplicationEntity;
import hus.cisk62.demo.repositories.ApplicationRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepositoryImp applicationRepositoryImp;

    public List<ApplicationEntity> findByElementID(int emp_id){
        return applicationRepositoryImp.findByElementID(emp_id);
    }

    public void displayApplication(Model model, int emp_id){
        model.addAttribute("applications", findByElementID(emp_id));
    }
}
