package org.thefourhorsemen;
import java.util.function.Function;

final class CpuComsumption {

  private final int count;
  private final int step;

  CpuComsumption(final int count, final double percentage) {
    this.count = count;
    step = (int) (count * percentage);
  }

  <T> void compute(final Function<Integer, T> convert, final Function<T, Integer> unconvert) {
    for (int index = 0; index < count; index++) {
      final T converted = convert.apply(index);
      final int value = unconvert.apply(converted);

      if (index % step == 0) {
        System.out.println(value);
      }
    }
  }

}
