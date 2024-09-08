package ngo.jmixprojectexample.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ExpenseCategory implements EnumClass<String> {

    EDUCATION("A"),
    FOOD("B"),
    HEALTH("C"),
    HOUSING("D"),
    TRANSPORTATION("E");

    private final String id;

    ExpenseCategory(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ExpenseCategory fromId(String id) {
        for (ExpenseCategory at : ExpenseCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}