package stack1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class DfsTest {
	public static int V; // 정점의 갯수
	public static int E; // 간선의 갯수
	public static int [] stack;
	public static int top = -1;
	public static int [][]graph; // 간선 연결여부 (그래프)
	public static boolean [] visit; // 방문여부 확인
	
	public static int pop() {
		if(top == -1) return -1;
		else {
			return stack[top--];
		}
	}
	
	public static void main(String [] args) throws Exception{
		System.setIn(new FileInputStream("res/DfsInput"));
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		graph = new int[V][V];
		visit = new boolean[V];
		stack = new int[100];
		top = -1;
		
		for(int i = 0; i < E; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			graph[v1][v2] = graph[v2][v1] = 1;
		}
		System.out.print("#1 ");
//		dfsr(0);
		dfs(0);
	}

	private static void dfs(int node) {
		stack[++top] = node; // push();
		while( top != -1) {
			int curr = stack[top--];
			if(visit[curr] == false) {
				visit[curr] = true;
				System.out.print(curr+ " ");
				
				for(int next = V-1; next > 0; next--) {
					if(visit[next] == false && graph[curr][next] == 1) {
						stack[++top] = next; // push();
					}
				}
			}
		}
	}

	public static void dfsr(int node) {
		visit[node] = true;
		System.out.print(node+ " ");
		for(int next = 0; next < V; next++) {
			if(visit[next] == false && graph[node][next] == 1) {
				dfsr(next);
			}
		}		
	}
}
