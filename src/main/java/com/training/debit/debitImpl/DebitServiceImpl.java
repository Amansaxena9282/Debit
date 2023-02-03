package com.training.debit.debitImpl;
import com.training.debit.model.Debit;
import com.training.debit.service.DebitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class DebitServiceImpl implements DebitService {
    @Override
    public List<Debit> getall() {
        List<Debit>getall=new ArrayList<>();
        Debit d1=new Debit(1,"aman",22);
        Debit d2=new Debit(2,"poorvi",21);
        Debit d3=new Debit(3,"kajal",23);
        getall.add(d1);
        getall.add(d2);
        getall.add(d3);
        return getall;
    }

    @Override
    public Debit addDebit(Debit debit) {
        return debit;
    }

    @Override
    public Debit updateDebit(Debit debit) {
        return debit;
    }

    @Override
    public Debit deleteData(int id) {
        return null;
    }

    @Override
    public String deleteDebit(int id) {
        return "delete id:"+id;
    }
}
