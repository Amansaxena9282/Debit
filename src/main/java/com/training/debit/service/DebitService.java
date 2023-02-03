package com.training.debit.service;
import com.training.debit.model.Debit;

import java.util.List;
public interface DebitService {
    //get   for get the data
    public List<Debit>getall();
    //post  FOR data insertion
    public Debit addDebit(Debit debit);
    //put for data updation
    public  Debit updateDebit(Debit debit);
    //delete for delete data
    public Debit deleteData(int id);
    public String deleteDebit(int id);
}
