/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        int size = size();
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        if (get(r.uuid) == null) {
            int size = size();
            if (size == 10_000) {
                System.out.println("Массив полон. Добавление невозмжно!");
            } else {
                storage[size] = r;
            }
        }
    }

    Resume get(String uuid) {
        short i = 0;
        while (storage[i] != null && i < 10_000) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
            i++;
        }
        return null;
    }

    void delete(String uuid) {
        short i = 0;
        int size = size();
        while (storage[i] != null && i < 10_000) {
            if (storage[i].uuid.equals(uuid)) {
                System.arraycopy(storage, i + 1, storage, i, size - i);
                storage[size - 1] = null;
                return;
            }
            i++;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int size = size();
        Resume[] result = new Resume[size];
        System.arraycopy(storage, 0, result, 0, size);
        return result;
    }

    int size() {
        int i = 0;
        while (storage[i] != null) {
            i++;
        }
        return i;
    }
}
