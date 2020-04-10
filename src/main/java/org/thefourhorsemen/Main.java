package org.thefourhorsemen;

public class Main {
  public static void main(final String[] args) {
    System.out.println("Started");

    final CpuComsumption comsumption = new CpuComsumption(10_000_000, 0.1);
    comsumption.compute(Main::convert, Main::unconvert);

    System.out.println("Stopped");
  }

  private static Integer unconvert(final Double value) {
    return (int) Math.toDegrees(Math.asin(value));
  }

  private static Double convert(final Integer value) {
    return Math.sin(Math.toRadians(value));
  }

}