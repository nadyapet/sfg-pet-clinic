package com.spring5course.sfgpetclinic.services.map;

import com.spring5course.sfgpetclinic.model.Owner;
import com.spring5course.sfgpetclinic.model.Pet;
import com.spring5course.sfgpetclinic.services.OwnerService;
import com.spring5course.sfgpetclinic.services.PetService;
import com.spring5course.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) { return super.save(object.getId(), object); }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

//    @Override
//    public Owner findByLastName(String lastName) {
//        return null;
//    }
}