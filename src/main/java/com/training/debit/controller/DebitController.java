package com.training.debit.controller;
import com.training.debit.model.Debit;
import com.training.debit.service.DebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class DebitController {
    @Autowired
    private DebitService debitService;
    @GetMapping("getAllDebitData")
    public List<Debit>getall(){
        return debitService.getall();
    }
    @PostMapping("/saveDebitData")
    public Debit saveDebit(@RequestBody Debit debit){
        return debitService.addDebit(debit);
    }
    @DeleteMapping("/deleteDebit/{id}")
    public String getDelete(@PathVariable int id){
        return debitService.deleteDebit(id);
    }
    @PutMapping("/updateDebit")
    public Debit updateDebit(@RequestBody Debit debit){
        return debitService.updateDebit(debit);
    }
    
}
