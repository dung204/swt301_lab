import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.J1_S_P0007.Graph;

public class J1_S_P0007Test {

  private Graph graph;

  @BeforeEach
  public void setup() {
    graph = new Graph(6);
    graph.addEdge(1, 4);
    graph.addEdge(2, 4);
    graph.addEdge(2, 5);
    graph.addEdge(3, 5);
    graph.addEdge(4, 5);
  }

  @Test
  public void testIsEdge() {
    assertTrue(graph.isEdge(1, 4));
    assertTrue(graph.isEdge(4, 1));
    assertTrue(graph.isEdge(2, 4));
    assertTrue(graph.isEdge(4, 2));
    assertTrue(graph.isEdge(2, 5));
    assertTrue(graph.isEdge(5, 2));
    assertTrue(graph.isEdge(3, 5));
    assertTrue(graph.isEdge(5, 3));
    assertTrue(graph.isEdge(4, 5));
    assertTrue(graph.isEdge(5, 4));

    assertFalse(graph.isEdge(1, 2));
    assertFalse(graph.isEdge(2, 1));
    assertFalse(graph.isEdge(1, 3));
    assertFalse(graph.isEdge(3, 1));
    assertFalse(graph.isEdge(2, 3));
    assertFalse(graph.isEdge(3, 2));
    assertFalse(graph.isEdge(4, 3));
    assertFalse(graph.isEdge(3, 4));
    assertFalse(graph.isEdge(5, 1));
    assertFalse(graph.isEdge(1, 5));

    assertFalse(graph.isEdge(0, 6));
    assertFalse(graph.isEdge(4, 0));
    assertFalse(graph.isEdge(2, 8));
  }

  @Test
  public void testAddEdge() {
    graph.addEdge(1, 2);
    assertTrue(graph.isEdge(1, 2));
    assertTrue(graph.isEdge(2, 1));
  }

  @Test
  public void testRemoveEdge() {
    graph.removeEdge(2, 4);
    assertFalse(graph.isEdge(2, 4));
    assertFalse(graph.isEdge(4, 2));
  }
}