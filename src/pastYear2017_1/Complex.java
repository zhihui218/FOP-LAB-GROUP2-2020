package pastYear2017_1;

/**
 *
 * @author TING WEI JING
 */
public class Complex {

    private double real;
    private double imagine;

    public Complex() {
    }

    public Complex(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public void addComplexNumber(Complex complexB) {
        this.real += complexB.real;
        this.imagine += complexB.imagine;
    }

    public void subComplexNumber(Complex complexB) {
        this.real -= complexB.real;
        this.imagine -= complexB.imagine;
    }

    @Override
    public String toString() {
        return real + " + " + imagine + 'i';
    }

    public double getReal() {
        return real;
    }

    public double getImagine() {
        return imagine;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

}
