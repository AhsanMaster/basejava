package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.exception.NotExistStorageException;
import com.github.ahsanmaster.basejava.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public abstract class AbstractArrayStorageTest {
    private  Storage storage;
    public AbstractArrayStorageTest(Storage storage){
        this.storage = storage;

    }
    @Before
    public void setUp() throws Exception{
        storage.clear();
        storage.save(new Resume("1"));
        storage.save(new Resume("2"));
        storage.save(new Resume("3"));

    }

    @Test
    public void clear() {
        assertSize(0);
    }

    @Test
    public void size() {
        assertSize(3);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void get() {
    }


    @Test
    public void update() {
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    void assertSize(int size){
        Assert.assertEquals(size,storage.size());
    }

    @Test(expected = NotExistStorageException.class)
    public void deleteNotExist() throws Exception{
        storage.delete("dfdf");
    }

}