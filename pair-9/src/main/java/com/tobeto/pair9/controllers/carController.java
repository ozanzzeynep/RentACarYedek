package com.tobeto.pair9.controllers;

import com.tobeto.pair9.entities.Car;
import com.tobeto.pair9.services.abstracts.BrandService;
import com.tobeto.pair9.services.abstracts.CarService;
import com.tobeto.pair9.services.dtos.car.requests.AddCarRequest;
import com.tobeto.pair9.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.pair9.services.dtos.car.responses.GetByIdCarResponse;
import com.tobeto.pair9.services.dtos.car.responses.GetListCarResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cars")
public class carController {

    private CarService carService;

    @GetMapping("/getAll")
    public List<GetListCarResponse> getAll(){
        return carService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdCarResponse getById(@PathVariable int id){
        return carService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid AddCarRequest request){
        carService.add(request);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateCarRequest request){
        this.carService.update(request);
    }

}
