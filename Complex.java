public class Complex {
  private double real;
  private double imag;

  public Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public double getImag() {
    return imag;
  }

  public void add(Complex cvalue) {
    real += cvalue.real;
    imag += cvalue.imag;
  }

  public static Complex add(Complex cvalue1, Complex cvalue2) {
    double real = cvalue1.real + cvalue2.real;
    double imag = cvalue1.imag + cvalue2.imag;
    return new Complex(real, imag);
  }

  public void subtract(Complex cvalue) {
    real -= cvalue.real;
    imag -= cvalue.imag;
  }

  public void display() {
    System.out.println(real + " + " + imag + "i");
  }

  public static void main(String[] args) {
    Complex c1 = new Complex(4.1, 3.9);
    Complex c2 = new Complex(1.2, 2.5);
    Complex c3 = Complex.add(c1, c2);
    c1.add(c2);
    c2.subtract(c1);
    c1.display();
    c2.display();
    c3.display();
  }
}

