/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.autonoma.edu.game.files;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author izibr
 */
public class DocumentWriter extends JFrame{

    private File file;    
    
    public DocumentWriter() throws HeadlessException {
        this.file= file;
    }
    
    
    public String selectPath(){
        JFileChooser fileChooser= new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("TXT files", "txt");
        fileChooser.setFileFilter(txtFilter);
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            return fileChooser.getSelectedFile().getPath();
        }
        return null;
    }

    public void createFile(String fileName,ArrayList<String> Instructions) {
        String filePath= selectPath()+fileName+".txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            writeFile(Instructions, filePath);
            System.out.println("El archivo se ha creado con exito en: " + filePath);
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo" + e.getMessage());
        }
    }
    
    public void writeFile(ArrayList<String> instructions, String file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            for (String line : instructions) {
                writer.write(line + "\n");
            }
        }
    }
}
