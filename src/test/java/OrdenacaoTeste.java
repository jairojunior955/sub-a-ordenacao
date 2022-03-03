
import br.cesupa.suba_ordenacao.Ordenacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTeste {

    public OrdenacaoTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testarNumerosIguaisSelectionSort() {
        int[] vetor = {1, 1, 1, 1, 1};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(vetor, retorno);
    }

    @Test
    public void testarNumerosPositivosSelectionSort() {
        int[] vetor = {7, 4, 8, 3, 9, 0, 2, 1, 5, 6};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, retorno);
    }

    @Test
    public void testarNumerosNegativosSelectionSort() {
        int[] vetor = {-9, -1, -4, -3, -7};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(new int[] {-9, -7, -4, -3, -1}, retorno);
    }

}