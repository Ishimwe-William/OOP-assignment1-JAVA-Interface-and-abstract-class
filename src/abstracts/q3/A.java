package abstracts.q3;

class A extends Marks {
    int[] marks;

    A(int[] marks) {
        this.marks = marks;
    }

    double getPercentage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }
}

