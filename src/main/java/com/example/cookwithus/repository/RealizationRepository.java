package com.example.cookwithus.repository;

import com.example.cookwithus.pojo.entity.Realization;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealizationRepository extends CrudRepository<Realization, String> {
    List<Realization> findAll();

    Realization findRealizationByDateAndTime(Date date, Time time);

    @Query(
            "SELECT r.lesson.name, r.date, r.time " +
                    "FROM Realization r JOIN FETCH Lesson l ON r.lesson.name=l.name " +
                    "WHERE r.lesson.name=:name"//named parameter(sidoqoft emri, nfund e kthen date and time)
    )
    List<Realization> findRealizationByLessonName(@Param("name") String name);//single argument, kthen list te objekteve realization
}
