/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.files;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ASUS
 */
public class DocumentReader extends JFrame{
    private File file;

    public DocumentReader(){
        this.file = file;
    }
    
    public String searchFile() {
        File fileName= null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("TXT files", "txt");    
        fileChooser.setFileFilter(imgFilter);
        int result = fileChooser.showOpenDialog(this);
        if (result != JFileChooser.CANCEL_OPTION) {
            fileName = fileChooser.getSelectedFile();
            return fileName.getPath();
        }
        return null;
    }
    
    public void createFile(String fileName, ArrayList<String> Instructions){
        File file = new File(fileName);
        try{
            file.createNewFile();
            writeFile(Instructions, fileName);
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo" + e.getMessage());
        }
        
    }
    
    public ArrayList readFile(String file){
        ArrayList<String> content= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                content.add(line);
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer el archivo" + e.getMessage());
        }
        return content;
    }
    
    public void writeFile(ArrayList<String> instructions, String file) throws IOException{
        try (FileWriter writer = new FileWriter(file)) {
            for(String line: instructions){
                writer.write(line + "\n");
            }
        }
    }
}
