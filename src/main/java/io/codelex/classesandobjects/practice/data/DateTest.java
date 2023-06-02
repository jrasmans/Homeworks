package io.codelex.classesandobjects.practice.data;

class DateTest {
    public static void main(String[] args) {
        Date date = new Date(5, 19, 2023);

        System.out.print("Initial date: ");
        date.displayDate();

        date.setMonth(12);
        date.setDay(31);
        date.setYear(2023);

        System.out.print("Updated date: ");
        date.displayDate();
    }
}
