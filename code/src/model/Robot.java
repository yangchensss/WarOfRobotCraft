package model;

import java.util.LinkedList;

import javafx.util.Pair;

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
	
	/** robot view range */
	private LinkedList<Coordinate> viewRangeList;
	
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
				boolean hasShot,
				LinkedList<Coordinate> viewRangeList) {
		
		this.name = name;
		this.attackPoint = attackPoint;
		this.healthPoint = healthPoint;
		this.movementPoint = movementPoint;
		this.coord = coord;
		this.direction = direction;
		this.hasMoved = hasMoved;
		this.hasShot = hasShot;
		this.viewRangeList = viewRangeList;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the attackPoint
	 */
	public int getAttackPoint() {
		return attackPoint;
	}


	/**
	 * @param attackPoint the attackPoint to set
	 */
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}


	/**
	 * @return the healthPoint
	 */
	public int getHealthPoint() {
		return healthPoint;
	}


	/**
	 * @param healthPoint the healthPoint to set
	 */
	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}


	/**
	 * @return the movementPoint
	 */
	public int getMovementPoint() {
		return movementPoint;
	}


	/**
	 * @param movementPoint the movementPoint to set
	 */
	public void setMovementPoint(int movementPoint) {
		this.movementPoint = movementPoint;
	}


	/**
	 * @return the coord
	 */
	public Coordinate getCoord() {
		return coord;
	}


	/**
	 * @param coord the coord to set
	 */
	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}


	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}


	/**
	 * @param direction the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}


	/**
	 * @return the hasMoved
	 */
	public boolean isHasMoved() {
		return hasMoved;
	}


	/**
	 * @param hasMoved the hasMoved to set
	 */
	public void setHasMoved(boolean hasMoved) {
		this.hasMoved = hasMoved;
	}


	/**
	 * @return the hasShot
	 */
	public boolean isHasShot() {
		return hasShot;
	}


	/**
	 * @param hasShot the hasShot to set
	 */
	public void setHasShot(boolean hasShot) {
		this.hasShot = hasShot;
	}


	/**
	 * @return the viewRangeList
	 */
	public LinkedList<Coordinate> getViewRangeList() {
		return viewRangeList;
	}


	/**
	 * @param viewRangeList the viewRangeList to set
	 */
	public void setViewRangeList(LinkedList<Coordinate> viewRangeList) {
		this.viewRangeList = viewRangeList;
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
