package Inheritance;

import java.time.LocalDate;

public class BaseClass<T>{
    private T id;

    private LocalDate createdDate;
    private LocalDate updatedDate;
    private LocalDate deletedDate;

    public BaseClass() {

    }
    public BaseClass(T id) {
        this.id = id;
    }
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDate getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDate deletedDate) {
        this.deletedDate = deletedDate;
    }
}
