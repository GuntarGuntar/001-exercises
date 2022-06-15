package ex013;


/*
Create an InchWorm class that will simulate an object that exists on a number line in a one-dimensional world. An Inchworm can be moved in either a positive (+1) or negative (-1) direction one unit at a time. The class will have two instance variables: position and direction. 

Members (a.k.a fields)
	position
	direction

Constructors:
	-first constructor takes no arguments; the initial position should default to zero
	-second constructor takes the initial position as a parameter of type int
	-both constructors should default the direction to 1

Methods
	move(): moves the InchWorm one unit in the direction that it is currently facing.
	turn(): reverses the InchWorm's direction.
	accessor for position
	accessor for direction
*/

public class InchWorm {
	public int position;
	public int direction;
	
	public InchWorm() {
		position = 0;
		direction = 1;
	}

	public InchWorm(int initialPosition) {
		position = initialPosition;
		direction = 1;
	}

	public Integer getPosition() {
		return position;
	}
	public Integer getDirection() {
		return direction;
	}

	public void move() {
		position = (position + (1 * direction));
		
	}

	public void turn() {
		direction = (direction * -1);
		
	}
}

