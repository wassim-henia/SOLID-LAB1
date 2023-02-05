package com.directi.training.dip.exercice_corrigé;

import java.io.IOException;

public interface IWriter {
    void write(String encodedLine) throws IOException;
}
