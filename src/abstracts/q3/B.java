package abstracts.q3;

class B extends Marks {
    int[] marks;

    B(int[] marks) {
        this.marks = marks;
    }

    double getPercentage() {
        return (marks[0] + marks[1] + marks[2] + marks[3]) / 4.0;
    }
}
