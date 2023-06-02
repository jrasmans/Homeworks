package io.codelex.classesandobjects.practice.dogs;

class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Dog getMother() {
        return mother;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father.getName();
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother == null || otherDog.getMother() == null) {
            return false;
        } else {
            return mother.getName().equals(otherDog.getMother().getName());
        }
    }

    @Override
    public String toString() {
        return name + ", " + sex;
    }
}

