package model;

import java.awt.*;

import javafx.util.Pair;;
/**
 * this class is to create a robot
 */
public class Robot {
	
	/** robot type **/
	private enum type {
		scout, sniper, tank
	};
	
	/** robot name **/
	private String name;
	
	/** robot attack point **/
	private int attackPoint;
	
	/** robot health point **/
	private int healthPoint;
	
	/** robot movement point **/
	private int movementPoint;
	
	/** robot absolute coordinate **/
	private Coordinate coord;
	
	/** robot fire direction **/
	private int direction;
	
	/** robot has moved in a play **/
	private boolean hasMoved;
	
	/** robot has shot in a play **/
	private boolean hasShot;
	
	/**
	 * this constructor is to create a robot with paramaters
	 * @param type
	 * @param name
	 * @param attackPoint
	 * @param healthPoint
	 * @param movementPoint
	 * @param coord
	 * @param direction
	 */
	public Robot (type type, 
				String name, 
				int attackPoint,
				int healthPoint,
				int movementPoint,
				Coordinate coord,
				int direction,
				boolean hasMoved,
				boolean hasShot) {
		
		this.name = name;
		this.attackPoint = attackPoint;
		this.healthPoint = healthPoint;
		this.movementPoint = movementPoint;
		this.coord = coord;
		this.direction = direction;
		this.hasMoved = hasMoved;
		this.hasShot = hasShot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getMovementPoint() {
		return movementPoint;
	}

	public void setMovementPoint(int movementPoint) {
		this.movementPoint = movementPoint;
	}

	public Coordinate getCoord() {
		return coord;
	}

	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
	public boolean isHasMoved() {
		return hasMoved;
	}

	public void setHasMoved(boolean hasMoved) {
		this.hasMoved = hasMoved;
	}

	public boolean isHasShot() {
		return hasShot;
	}

	public void setHasShot(boolean hasShot) {
		this.hasShot = hasShot;
	}

	/**
	 * this method is to determine whether the robot is dead
	 * @return true if the robot is dead, false otherwise
	 */
	public boolean isDead() {
		return (this.healthPoint <= 0);
	}
	
	/**
	 * this method turns the direction of robot.
	 * @param direction the direction that to be turned
	 */
	public void turn(int direction) {
		if ( !this.isDead() ) {
			this.setDirection(direction);
		}
	}
	
	/**
	 * this method is to move a robot
	 * @param mapSize the size of map
	 * @throws Exception 
	 */
	public void move(int mapSize) throws Exception {
		if(this.isDead()){
			throw new Exception("Died robot cannot move.");
		} else {
			if(this.getMovementPoint() > 0){
				try{
					this.coord = this.coord.getNewCoordinate(this.direction, 1, mapSize);
				} catch (Exception e) {
					throw new Exception("The move is out of map range.");
				}
				this.movementPoint --;
			} else {
				return;
			}
		}
	}
	
	/**
	 * this method is to set the damage of the robot get fired
	 * @param attackPoint the attackPoint that the robot received
	 */
	public void damaged(int attackPoint) {
		if ( !this.isDead() ) {
			this.setHealthPoint( this.getHealthPoint() - attackPoint );
		}
	}
	
	/**
	 * this method is to shoot at a specific record
	 * @param distance the distance to shoot
	 * @param mapSize the size of map
	 * @throws Exception 
	 */
	public Pair<Coordinate, Integer> shoot(int distance, int mapSize) throws Exception {
		if(this.isDead()){
			throw new Exception("Died robot cannot shoot.");
		} else {
			if(this.hasShot){
				throw new Exception("Cannot shoot twice in one play.");
			} else {
				Pair<Coordinate, Integer> pair;
				try{
					pair = new Pair<Coordinate, Integer>(
						this.coord.getNewCoordinate(this.direction, distance, mapSize),
						this.attackPoint);
				} catch (Exception e) {
					throw new Exception("The move is out of map range.");
				}
				
				
				return pair;
			}
		}
	}
}
