package com.directi.training.dip.exercice_corrigé;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements IWriter
{
    private String _fileName;

    public WriterFile(String fileName)
    {
        _fileName = fileName;
    }

    @Override
    public void write(String encodedLine) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.write(encodedLine);
        writer.close();
    }
}
