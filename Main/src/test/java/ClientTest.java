import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void solution() {
        int[] A = {3,1,2,4,3};
        Client client = new Client();
        assertEquals(1, client.solution(A));
    }

}