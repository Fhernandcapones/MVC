package com.company.service;


import com.company.model.Model;
import com.company.repository.Repository;

public class PersonImplService implements PersonService{

@Override
public void prelim(Model model){
        Repository repository = new Repository();
        repository.average(model);

}

}
