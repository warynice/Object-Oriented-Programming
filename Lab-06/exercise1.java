import java.util.*;
interface Movable {
	void moveup();
	void movedown();
	void moveleft();
	void moveright();
}
class MovablePoint implements Movable,Comparable {
	int x,y;
	int xspeed,yspeed;
	public MovablePoint(int x, int y, int xspeed, int yspeed) {
		this.x = x;
		this.y = y;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	public void moveup() {
		this.y -= this.yspeed;
	}
	public void movedown() {
		this.y += this.yspeed;
	}
	public void moveleft() {
		this.x -= this.xspeed;
	}
	public void moveright() {
		this.x += this.xspeed;
	}
	public String toString() {
		return "x: " + this.x + " y: " + this.y;
	}
	public int compareTo(Object obj) {
		MovablePoint pt2 = (MovablePoint)obj;
		return this.x - pt2.x;
	}
}
class MovableCircle implements Movable {
	MovablePoint center;
	int radius;
	MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
		super();
		this.center = new MovablePoint(x, y, xspeed, yspeed);
		this.radius = radius;
	}
	public void moveup() {
		this.center.y -= this.center.yspeed;
	}
	public void movedown() {
		this.center.y += this.center.yspeed;
	}
	public void moveleft() {
		this.center.x -= this.center.xspeed;
	}
	public void moveright() {
		this.center.x += this.center.xspeed;
	}
	public String toString() {
		return "center: " + this.center + " radius: " + this.radius;
	}
}
class compareByx implements Comparator<MovablePoint> {
	public int compare(MovablePoint pt1, MovablePoint pt2) {
		return pt1.x - pt2.x;
	}
}
class compareByy implements Comparator<MovablePoint> {
	public int compare(MovablePoint pt1, MovablePoint pt2) {
		return pt1.y - pt2.y;
	}
}
class compareByradius implements Comparator<MovableCircle> {
	public int compare(MovableCircle pt1, MovableCircle pt2) {
		return pt1.radius - pt2.radius;
	}
}
class compareBycenter implements Comparator<MovableCircle> {
	public int compare(MovableCircle pt1, MovableCircle pt2) {
		return pt1.center.x - pt2.center.x;
	}
}
class comparebycenterRadius implements Comparator<MovableCircle> {
	public int compare(MovableCircle pt1, MovableCircle pt2) {
		if(pt1.center.x == pt2.center.x)
			return pt1.radius - pt2.radius;
		else {
			return pt1.center.x - pt2.center.x;
		}
	}
}
public class exercise1 {
	public static void main(String[] args) {
		Movable pt = new MovablePoint(2, 3, 2, 4);
		System.out.println(pt);
		pt.movedown();
		pt.moveleft();
		System.out.println(pt);
		pt = new MovableCircle(1, 4, 3, 2, 5);
		System.out.println(pt);
		pt.moveup();
		pt.moveright();
		System.out.println(pt);
	}
}