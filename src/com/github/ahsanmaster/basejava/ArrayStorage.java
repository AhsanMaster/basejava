package com.github.ahsanmaster.basejava;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size;

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size =0;
    }

    public void save(Resume r) {
        if (indexOf(r) == -1) {
            if (size == storage.length) {
                System.out.println("Array is full. Cannot add.");
            } else {
                storage[size] = r;
                size++;
            }
        }
    }

    public Resume get(String uuid) {
        int indexOfPosition = indexOf(uuid);
        if(indexOfPosition ==-1){
            System.out.println("Resume not found.");
            return null;
        }else{
            return storage[indexOfPosition];
        }
    }

    public void delete(String uuid) {
        int indexOfPosition = indexOf(uuid);
        if(indexOfPosition ==-1){
            System.out.println("Resume not found. Cannot delete.");
        }else{
            storage[indexOfPosition] = storage[size - 1] ;
            storage[size - 1] = null;
            size--;
        }
    }

    public Resume[] getAll() {
        Resume[] result = new Resume[size];
        System.arraycopy(storage, 0, result, 0, size);
        return result;
    }

    public int size() {
        return size;
    }

    public int indexOf(Resume r){
        for (int i = 0; i <size ; i++) {
            if (storage[i].equals(r)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(String uuid){
        for (int i = 0; i <size ; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }

    public void update(Resume r){
        int indexOfPosition = indexOf(r);
        if (indexOfPosition== -1) {
            System.out.println("Resume not found. Cannot update.");
        }else {
            storage[indexOfPosition] = r;
        }
    }
}
