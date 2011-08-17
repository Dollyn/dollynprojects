package dollyn.algorithms.idealstring;

import java.util.ArrayList;
import java.util.List;

public class CodingTest4 {

	public static class Line {
		int x1;
		int y1;
		int x2;
		int y2;
		
		public Line(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
		public boolean equals(Object o) {
			if(o == this) return true;
			
			if(!(o instanceof Line)) return false;
			
			Line other = (Line)o;
			return other.x1 == x1 && other.y1 == y1 && other.x2 == x2 && other.y2 == y2;
		}
	}
	
	private static List<Line> lines = new ArrayList<Line>();
	private static List<Line> current = new ArrayList<Line>();
	private static List<Line> empty = new ArrayList<Line>();
	private static int num;
	
	private static int[][] horizantal_lines;
	private static int[][] vertical_lines;
	                  
	
	public static void init(int n) {
		num = n;
		//Vertical
//		for(int i = 1; i <= n + 1; i++) {
//			for(int j = 1; j < n; j++) {
//				Line line = new Line();
//				line.x1 = i;
//				line.y1 = j;
//				line.x2 = i;
//				line.y2 = j + 1;
//				lines.add(line);
//				empty.add(line);
//			}			
//		}
		
		vertical_lines = new int[n][n+1];
		
		//Horizantal
		horizantal_lines = new int[n+1][n];
	
	} 
	
	public static void setLine(Line pos) {
		if(isVertical(pos)) {
			if(vertical_lines[pos.y1 - 1][pos.x1 - 1] == 0){
				vertical_lines[pos.y1 - 1][pos.x1 - 1] = 1;
			}					
		} else {
			if(horizantal_lines[pos.y1 - 1][pos.x1 - 1] == 0) {
				horizantal_lines[pos.y1 - 1][pos.x1 - 1] = 1;
			}
		}
	}
	
	/**
	 * ÅÐ¶ÏÊÇ·ñÊÇÊú·Å¡£
	 */
	private static boolean isVertical(Line line) {
		if(line.x1 == line.x2) {
			return true;
		}
		return false;
	}
	
	public static Line getLine() {
		List<Line> lines = new ArrayList<Line>();
		for(int i = 0; i < vertical_lines.length; i++) {
			for(int j = 0; j < vertical_lines[i].length; j++) {
				if(vertical_lines[i][j] == 0) {
					Line line = new Line(j + 1, i + 1, j + 1, i +1 + 1);
					if(canGetPoint(line)) {
						return line;
					} else {
						lines.add(line);
					}					
				}
			}
		}
		
		for(int i = 0; i < horizantal_lines.length; i++) {
			for(int j = 0; j < horizantal_lines[i].length; j++) {
				if(horizantal_lines[i][j] == 0) {
					Line line = new Line(j + 1, i + 1, j + 1 + 1, i + 1);
					if(canGetPoint(line)) {
						return line;
					} else {
						lines.add(line);
					}					
				}
			}
		}
		
		Line line = null;
		
		while(line == null || canOtherGetPoint(line)) {
			if(lines.size() == 1 && line != null) {
				break;
			}
			lines.remove(line);
			double random = Math.random();
			double r = random * 10000000;
			int index = (int)r % lines.size();
			line = lines.get(index);
		}
		
		return line;
	}
	
	private static boolean canGetPoint(Line line) {
		if(isVertical(line)) {
			//left			
			if(line.x1 - 1 > 0) {
				if(vertical_lines[line.y1 - 1][line.x1 - 1 - 1] == 1 
						&& horizantal_lines[line.y1 - 1][line.x1 - 1 - 1] == 1
						&& horizantal_lines[line.y1][line.x1 - 1 - 1] == 1) {
					return true;
				}
			}			
			
			//right
			if(line.x1 + 1 <= num + 1) {
				if(vertical_lines[line.y1 - 1][line.x1] == 1
						&& horizantal_lines[line.y1 - 1][line.x1 - 1] == 1
						&& horizantal_lines[line.y1][line.x1 - 1] == 1) {
					return true;
				}
			}
						
		} else {
			//top
			if(line.y1 - 1 > 0) {
				if(horizantal_lines[line.y1 - 1 - 1][line.x1 - 1] == 1
						&& vertical_lines[line.y1 - 1 - 1][line.x1 - 1] == 1
						&& vertical_lines[line.y1 - 1 - 1][line.x1] == 1) {
					return true;
				}
			}
			//b
			if(line.y1 + 1 <= num + 1) {
				if(horizantal_lines[line.y1][line.x1 - 1] == 1
						&& vertical_lines[line.y1 - 1][line.x1 - 1] == 1
						&& vertical_lines[line.y1 - 1][line.x1] == 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean canOtherGetPoint(Line line) {
		if(isVertical(line)) {
			//left			
			if(line.x1 - 1 > 0) {
				int empty = 0;
				if(vertical_lines[line.y1 - 1][line.x1 - 1 - 1] == 0) empty++;
				if(horizantal_lines[line.y1 - 1][line.x1 - 1 - 1] == 0) empty++;
				if(horizantal_lines[line.y1][line.x1 - 1 - 1] == 0) empty++;
				
				if(empty == 1) {
					return true;
				}
			}			
			
			//right
			if(line.x1 + 1 <= num + 1) {
				int empty = 0;
				if(vertical_lines[line.y1 - 1][line.x1] == 0) empty++;
				if(horizantal_lines[line.y1 - 1][line.x1 - 1] == 0) empty++;
				if(horizantal_lines[line.y1][line.x1 - 1] == 0) empty++;
				
				if(empty == 1) {
					return true;
				}
			}
						
		} else {
			//top
			if(line.y1 - 1 > 0) {
				int empty = 0;
				if(horizantal_lines[line.y1 - 1 - 1][line.x1 - 1] == 0) empty++;
				if(vertical_lines[line.y1 - 1 - 1][line.x1 - 1] == 0) empty++;
				if(vertical_lines[line.y1 - 1 - 1][line.x1] == 0) empty++;
				
				if(empty == 1) {
					return true;
				}
			}
			//b
			if(line.y1 + 1 <= num + 1) {
				int empty = 0;
				if(horizantal_lines[line.y1][line.x1 - 1] == 0) empty++;
				if(vertical_lines[line.y1 - 1][line.x1 - 1] == 0) empty++;
				if(vertical_lines[line.y1 - 1][line.x1] == 0) empty++;
				
				if(empty == 1) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init(2);
		for(int i = 0; i < 12; i++) {
			Line line = getLine();
			setLine(line);
			System.out.println(line.x1 + ", "+ line.y1);
			System.out.println(line.x2 + ", "+ line.y2);
			System.out.println(i+"=====================");
		}
	}

}
