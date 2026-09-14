package dmit2015.model;

// import the packages for Java Unit Test
import org.junit.jupiter.api.Test;

// import the packages for Java Assertions
import static org.assertj.core.api.AssertionsForClassTypes.*;

public class CircleTest {

    @Test
        void area_whenRadiusIs5_shouldReturnCorrectArray(){
        Circle circle = new Circle();
        circle.setRadius(5);

        assertThat(circle.Area()).isCloseTo(78.54, within(0.01));

    }
}
