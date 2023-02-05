package com.directi.training.dip.exercice_corrigé;

public class WriterDatabase implements IWriter {
  
    public void write(String encodedString){
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
    
}
