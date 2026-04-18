package com.example.musicapispringboot.repositories;

import com.example.musicapispringboot.models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IGenderRepository extends JpaRepository<Gender, Long> {
    @Query("SELECT g FROM Gender g WHERE g.status = :status")
    List<Gender> getAllGendersByStatus(@Param("status") boolean status);

    @Query("SELECT g FROM Gender g WHERE g.nameGender = :nameGender")
    Optional<Gender> nameGenderInUse(@Param("nameGender") String nameGender);
}
