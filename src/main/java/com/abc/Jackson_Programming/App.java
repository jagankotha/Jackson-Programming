package com.abc.Jackson_Programming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student student = new Student ( 1,"jagan","venkatampalli","pbp" );
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json= objectMapper.writeValueAsString ( student );
            System.out.println (json );
            String beutifulJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(beutifulJson);
            String jsonStr = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"school\":34,\"address\":\"India\"}";
            Student student1=(Student ) objectMapper.readValue ( jsonStr,Student.class );
            System.out.println (student1 );
        } catch ( JsonProcessingException e ) {
            e.printStackTrace ( );
        } catch ( IOException e ) {
            e.printStackTrace ( );
        }

    }
}
