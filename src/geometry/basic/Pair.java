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

public class Pair {

	public final double x;
	public final double y;
	
	public Pair(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Point))
			return false;
		Point o = (Point) other;
		return (Double.compare(x, o.x) == 0) && (Double.compare(y, o.y) == 0);
	}

	@Override
	public int hashCode() {
		long x64 = Double.doubleToLongBits(x);
		long y64 = Double.doubleToLongBits(y);
		return (int) (x64 ^ (x64 >>> 32) ^ y64 ^ (y64 >>> 32));
	}

}
