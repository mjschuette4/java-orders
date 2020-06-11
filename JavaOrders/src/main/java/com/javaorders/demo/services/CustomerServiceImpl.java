package com.javaorders.demo.services;

import com.javaorders.demo.models.Customers;
import com.javaorders.demo.repositories.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerservice")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomersRepo custrepos;


    @Override
    public List<Customers> findAllCustomers()
    {
        List<Customers> rtnlList = new ArrayList<>();

        custrepos.findAll()
                .iterator()
                .forEachRemaining(rtnlList::add);

        return rtnlList;
    }


    @Override
    public Customers findCustomerById(long id)
    {
        return custrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not found"));
        //        return null;
    }

    @Override
    public List<Customers> findByNameLike(String cname)
    {
        return custrepos.findByCustnameContainingIgnoreCase(cname);
        //        return null;
    }
}
