package com.uberCoffe.pickPoint.Controller;

import com.uberCoffe.pickPoint.Entity.PickPoint;
import com.uberCoffe.pickPoint.Servise.PickPointService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(
        value = "This controller edit and update information about pickPoint"
)
@RestController

public class PickPointController {


    private final PickPointService pickPointService;

    public PickPointController(PickPointService pickPointService) {
        this.pickPointService = pickPointService;
    }


    @ApiOperation(value = "Get nearest pickPoint")
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "List pickPoints",
                    response = List.class),
            @ApiResponse(
                    code = 400,
                    message = "Input failed validation",
                    response = String.class),
            @ApiResponse(
                    code = 500,
                    message = "Error in process get pickPoints",
                    response = String.class)
    })
    @GetMapping("/m/pickPoint/nearest")
    public ResponseEntity<Object> getNearestPickPoint(@RequestParam Double width,@RequestParam Double longitude ) {
        if (width == null || longitude == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
     List<PickPoint> pickPoints=pickPointService.getListNearestPickPoint(width,longitude);
        return new ResponseEntity<>(pickPointService.getListNearestPickPoint(width,longitude), HttpStatus.OK);
    }

}
