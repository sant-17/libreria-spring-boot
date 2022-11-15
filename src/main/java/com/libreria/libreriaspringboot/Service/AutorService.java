package com.libreria.libreriaspringboot.Service;

import java.util.List;

import com.libreria.libreriaspringboot.Model.Autor;

public interface AutorService {
    
    public List<Autor> listarAutores();

    public Autor guardarAutor(Autor autor);
}
