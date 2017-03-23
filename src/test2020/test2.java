/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2020;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author evawero
 */
public class test2 {
    static String studID, studName, studProgram, studAGE, studClass;

    public static String getStudID() {
        return studID;
    }

    public static void setStudID(String studID) {
        test2.studID = studID;
    }

    public static String getStudName() {
        return studName;
    }

    public static void setStudName(String studName) {
        test2.studName = studName;
    }

    public static String getStudProgram() {
        return studProgram;
    }

    public static void setStudProgram(String studProgram) {
        test2.studProgram = studProgram;
    }

    public static String getStudAGE() {
        return studAGE;
    }

    public static void setStudAGE(String studAGE) {
        test2.studAGE = studAGE;
    }

    public static String getStudClass() {
        return studClass;
    }

    public static void setStudClass(String studClass) {
        test2.studClass = studClass;
    }

    
    public static void testWrite() throws IOException
    {
        try(BufferedWriter myWriter = new BufferedWriter(new FileWriter("testrecord.txt",true)))
        {
        myWriter.write(getStudID() +" "+ getStudName()+" "+ getStudAGE()+" "+getStudClass()+" "+ getStudProgram());
        myWriter.newLine();
        }
    }
    
}

    

