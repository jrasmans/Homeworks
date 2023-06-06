package io.codelex.dateandtime.practice.datePeriod;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        DatePeriod result = null;
        if (overlap(secondPeriod)) {
            if (this.includes(secondPeriod)) {
                result = new DatePeriod(secondPeriod.start, secondPeriod.end);
            } else if (secondPeriod.includes(this)) {
                result = new DatePeriod(this.start, this.end);
            } else if (secondPeriod.start.isBefore(this.start)) {
                result = new DatePeriod(this.start, secondPeriod.end);
            } else {
                result = new DatePeriod(secondPeriod.start, this.end);
            }
        }
        return result;
    }

    private boolean includes(DatePeriod second) {
        return (this.start.equals(second.start) || this.start.isBefore(second.start)) &&
                (this.end.equals(second.end) || this.end.isAfter(second.end));
    }

    private boolean overlap(DatePeriod second) {
        return second.start.isBefore(this.end) && second.end.isAfter(this.start);
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}


