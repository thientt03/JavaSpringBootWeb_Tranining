package hus.cisk62.demo.repositories;

import hus.cisk62.demo.entities.ApplicationEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ApplicationRepositoryImp {
    @PersistenceContext
    private EntityManager entityManager;

    public List<ApplicationEntity> findByElementID(int emp_id) {

        //"login" this is the name of your procedure
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("findApplicationByEmployeeID");

        //Declare the parameters in the same order
        query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);

        //Pass the parameter values
        query.setParameter(1, emp_id);

        //Execute query
        query.execute();

        List<Object[]> list = query.getResultList();

        List<ApplicationEntity> result = new LinkedList<>();

        list.stream().forEach(record -> {
            ApplicationEntity entity = new ApplicationEntity();

            entity.setId(Integer.parseInt(record[0].toString()));
            entity.setTimeStart(convertString2Timestamp(record[2].toString()));
            entity.setTimeEnd(convertString2Timestamp(record[3].toString()));
            entity.setReason(record[6].toString());
            entity.setDescription(record[7].toString());
            entity.setCreateAt(convertString2Timestamp(record[8].toString()));

            result.add(entity);
        });

        return result; //enter your condition
    }

    private Timestamp convertString2Timestamp(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date parsedDate = dateFormat.parse(date);
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            return timestamp;
        } catch (Exception e) { //this generic but you can control another types of exception
            // look the origin of excption
            return null;
        }
    }
}
