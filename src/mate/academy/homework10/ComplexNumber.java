package mate.academy.homework10;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber number = (ComplexNumber) o;
        return (this.re == number.getRe() &&
                this.im == number.getIm());
    }
    @Override
    public int hashCode(){
        double result = 17;
        result = 31 * result + re;
        result = 31 * result + im;
        return (int) result;
    }
}
