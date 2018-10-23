/**
 * "Dark Triangles" demonstrates black box testing for educational purposes.
 * Copyright (C) 2010-2013 Daniel Speicher and University of Bonn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package geometry.basic;

import static java.lang.Math.*;

public class Vector extends Pair {

	public Vector(double x, double y) {
		super(x, y);
	}

	public double length() {
		return sqrt(x * x + y * y);
	}

	public double signedAreaOfParallelogram(Vector adjacentSide) {
		return x * adjacentSide.y - y * adjacentSide.x;
	}

}
