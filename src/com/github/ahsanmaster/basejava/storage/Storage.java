package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public interface Storage {
    void clear();

    void update(Resume r);

    void save(Resume r);

    Resume get(String uuid) ;

    void delete(String uuid) ;

    Resume[] getAll();

    int size();

}
