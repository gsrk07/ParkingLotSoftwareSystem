package ParkingLot.repository;

import ParkingLot.exceptions.OperatorNotFoundException;
import ParkingLot.models.Operator;

import java.util.HashMap;

import java.util.Map;
public class OperatorRepository {

    private Map<Integer, Operator> operatorMap;

    public OperatorRepository() {
        operatorMap = new HashMap<>();
    }

    public Operator get(int operatorid){

        Operator operator = operatorMap.get(operatorid);
        if(operator == null) {
            throw new OperatorNotFoundException(" Operator not found with this id: "+ operatorid);
        }

        return operator;
    }

    public void set(Operator operator){
        operatorMap.put(operator.getId(), operator);
        System.out.println("Operator added successfully");
    }

}
