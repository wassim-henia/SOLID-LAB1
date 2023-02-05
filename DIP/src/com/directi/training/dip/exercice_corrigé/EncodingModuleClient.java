package com.directi.training.dip.exercice_corrigé;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new ReaderFile(
                "DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt");
        IWriter writer = new WriterFile(
                "DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt");
        encodingModule.encode(reader, writer);

        reader = new ReaderNetwork("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new WriterDatabase();
        encodingModule.encode(reader, writer);
    }
}
