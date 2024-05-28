package com.J1_S_P0007;

import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class Graph {

    private boolean adjacencyMatrix[][];
    private int vertexCount;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjacencyMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjacencyMatrix[i][j] = true;
            adjacencyMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjacencyMatrix[i][j] = false;
            adjacencyMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            return adjacencyMatrix[i][j] || adjacencyMatrix[j][i];
        } else {
            return false;
        }
    }
}

