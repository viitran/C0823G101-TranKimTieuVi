package com.example.repository;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
   public static List<Customer> list = new ArrayList<>();
   static {
       list.add(new Customer(1,"Nguyen Khac Nhat","nhat@codegym.vn","Ha Noi"));
       list.add(new Customer(2,"Dang Huy Hoa","hoa.dang@codegym.vn","Da Nang"));
       list.add(new Customer(3,"Le Thi Chau","chau.le@codegym.vn","Ha Noi"));
       list.add(new Customer(4,"Nguyen Thuy Duong","duong.nguyen@codegym.vn","Sai Gon"));
       list.add(new Customer(5,"CodeGym","codegym@codegym.vn","Viet Nam"));
   }

    @Override
    public List<Customer> showList() {
        return list;
    }

}
