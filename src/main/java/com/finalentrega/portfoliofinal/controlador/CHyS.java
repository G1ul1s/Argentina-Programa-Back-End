package com.finalentrega.portfoliofinal.controlador;

import com.finalentrega.portfoliofinal.Dto.DtoHyS;
import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.security.controller.Mensaje;
import com.finalentrega.portfoliofinal.servicio.SHyS;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/hys")
public class CHyS {

    @Autowired
    SHyS sHyS;

    @GetMapping("/lista")
    public ResponseEntity<List<HyS>> list() {
        List<HyS> list = sHyS.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HyS> getById(@PathVariable("id") int id) {
        if (!sHyS.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        HyS hys = sHyS.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoHyS dtohys) {
        if (StringUtils.isBlank(dtohys.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHyS.existsByNombre(dtohys.getNombre())) {
            return new ResponseEntity(new Mensaje("Esa HyS existe"), HttpStatus.BAD_REQUEST);
        }

        HyS hys = new HyS(dtohys.getNombre(), dtohys.getPorcentaje());
        sHyS.save(hys);
        return new ResponseEntity(new Mensaje("HyS agregada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoHyS dtohys) {
        if (!sHyS.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }

        if (sHyS.existsByNombre(dtohys.getNombre()) && sHyS
                .getByNombre(dtohys.getNombre()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa HyS existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(dtohys.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        HyS hys = sHyS.getOne(id).get();
        hys.setNombre(dtohys.getNombre());
        hys.setPorcentaje(dtohys.getPorcentaje());

        sHyS.save(hys);
        return new ResponseEntity(new Mensaje("HyS actualizada"), HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHyS.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        sHyS.delete(id);
        return new ResponseEntity(new Mensaje("HyS eliminada"), HttpStatus.OK);

    }

}
