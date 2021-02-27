/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import com.ninja_squad.dbsetup.operation.Operation;
import static com.ninja_squad.dbsetup.Operations.*;

/**
 *
 * @author bitwayiki
 */
public class CommonOperation {

    public static final Operation DELETE_ALL_ROW = sequenceOf(
            deleteAllFrom("course_student"),
            deleteAllFrom("STUDENT"),
            deleteAllFrom("COURSE")
    );

    public static final Operation POPULATE_ALL_TABLE = sequenceOf(
            
            //id | dateofbirth  | gender | name  | studentid |  
            insertInto("STUDENT")
                    .withDefaultValue("version", 1)
                    .columns("id", "gender", "name", "studentid", "dateOfBirth")
                    .build(),
            // id | code | credits | name | department_id 
            insertInto("COURSE")
                    .withDefaultValue("version", 1)
                    .build(),
            // id | course_id | student_id 
            insertInto("course_student")
                    .columns("courses_id", "students_id")
                    .build()
    );

}
