//This is the compareTo method that could be used to compare values in the map

	 public int compareTo(AresPoint p2) {
		 if (this.x < p2.x) 
		 return -1;
		 else if (this.x == p2.x) { //if x coordinates are the same, compare y coord
			 if (this.y < p2.y)
				 return -1;
			 else if (this.y == p2.y) 
				 return 0;
			 else
				 return 1;
		 }
		 else
			 return 1;
	}
