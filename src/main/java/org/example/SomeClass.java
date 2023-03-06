package org.example;

import java.util.Objects;

public class SomeClass {
    private Integer fieldOne;
    private Integer fieldTwo;

    public SomeClass(Integer fieldOne, Integer fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

    public Integer getFieldOne() {
        return fieldOne;
    }

    public Integer getFieldTwo() {
        return fieldTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SomeClass someClass = (SomeClass) o;
        return Objects.equals(fieldOne, someClass.fieldOne) && Objects.equals(fieldTwo, someClass.fieldTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldOne, fieldTwo);
    }
}
