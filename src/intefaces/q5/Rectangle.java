package intefaces.q5;


class Rectangle implements Resizable {
    @Override
    public int resizeWidth(int width) {
        return (width - (width * 10 / 100));
    }

    @Override
    public int resizeHeight(int height) {
        return (height - (height * 10 / 100));
    }
}
