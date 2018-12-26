package home;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JUnit5JavaTests {
    @Test
    public void rxjava2() {
        List<Integer> list = new LinkedList<>();
        Flowable.range(1, 64)
                .observeOn(Schedulers.computation())
                .flatMap(i -> )
    }
}
