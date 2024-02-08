/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class JSON {
    
    JSON json = new JSON();
    File nickelodeonFile = new File("./src/JSON/Nickelodeon.json");
    File starFile = new File("./src/JSON/StarChannel.json");
    
    
    public Files GetFile(int company) throws IOException{
        try{
            File chooseFile = null;
            switch(company){
                case 0:
                    chooseFile = nickelodeonFile;
                    break;
                    
                case 1:
                    chooseFile = starFile;
                    
            }
           FileReader reader = new FileReader(chooseFile);
            Files file = json.fromJson(reader, Files.class);
            reader.close();
            return file;

        }
        catch(Exception e){
            return null;
        }
    }
    
    public void setFile(Files file, int company) throws IOException{
        
        try{
            
            //Escoje el tipo de compañia
            File chooseFile = null;
            switch(company){
                case 0:
                    chooseFile = nickelodeonFile;
                    break;
                case 1:
                    chooseFile = starFile;
                    break;
            }
    
            //Escribe el JSON
            FileWriter fileWriter = new FileWriter(chooseFile);
            json.toJson(file, fileWriter);
            fileWriter.close();
        }
        
        catch(IOException e){
        
        }
    }

    private Files fromJson(FileReader reader, Class<Files> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void toJson(Files file, FileWriter fileWriter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
