package org.gfg.JBDL_71_MultiDB.studentDB;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
