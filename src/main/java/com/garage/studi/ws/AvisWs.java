package com.garage.studi.ws;



import com.garage.studi.pojo.Avis;
import com.garage.studi.pojo.state.Status;
import com.garage.studi.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "avis")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AvisWs {

    @Autowired
    private AvisService avisService;

    @GetMapping
    public List<Avis> getAllAvis(){
        return avisService.getAllAvis();
    }

    @GetMapping(value = "/status/{status}")
    public List<Avis> getAllAvisByStatus(@PathVariable Status status){
        return avisService.getAllAvisByStatus(status);
    }

    @PostMapping
    public void createAvis(@RequestBody Avis unAvis){
        this.avisService.createAvis(unAvis);
    }


    @PostMapping("/status/{status}")
    public void createAvisWithStatus(@RequestBody Avis unAvis, @PathVariable("status") Status status){
        this.avisService.createAvisWithStatus(unAvis,status);
    }

    @PutMapping("/status/{status}")
    public void updateStatusAvis(@RequestBody Avis unAvis,
                                 @PathVariable(name="status") Status status){
        this.avisService.updateStatusAvis(unAvis,status);
    }

    @DeleteMapping("/{id}")
    public void deleteAvisById(@PathVariable("id") Long id){
        this.avisService.deleteAvisById(id);
    }

}



