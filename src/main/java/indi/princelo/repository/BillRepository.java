package indi.princelo.repository;

import indi.princelo.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, String> {

    Bill findById(String id);

}
