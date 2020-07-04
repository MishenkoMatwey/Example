package com.uberCoffe.pickPoint.Repo;

import com.uberCoffe.pickPoint.Entity.PickPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PickPointRepository extends JpaRepository<PickPoint,Long> {

}
