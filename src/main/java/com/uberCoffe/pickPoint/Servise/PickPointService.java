package com.uberCoffe.pickPoint.Servise;

import com.uberCoffe.pickPoint.Entity.PickPoint;
import com.uberCoffe.pickPoint.Repo.PickPointRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PickPointService {

    private final PickPointRepository repository;

    public PickPointService(PickPointRepository repository) {
        this.repository = repository;
    }

    public List<PickPoint> getListNearestPickPoint(Double width,Double longitude){
        List<PickPoint> list=repository.findAll();
        return list;
    }
}
