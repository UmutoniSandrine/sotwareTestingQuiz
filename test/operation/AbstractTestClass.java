/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

/**
 *
 * @author bitwayiki
 */
public class AbstractTestClass {
    
    public static void execute(Operation operation){
        DbSetup dbSetup = new DbSetup(new DriverManagerDestination("jdbc:postgresql://localhost:5432/software-testing", "postgres","postgres"), operation);
        dbSetup.launch();
    }
    
}
