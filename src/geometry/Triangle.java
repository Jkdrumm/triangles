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
package geometry;

import geometry.basic.Point;

public abstract class Triangle {

	protected Point a, b, c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public abstract boolean contains(Triangle other);

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Triangle))
			return false;
		Triangle o = (Triangle) other;
		return equalRolled(o.a, o.b, o.c) || equalRolled(o.b, o.a, o.c);
	}

	@Override
	public int hashCode() {
		return a.hashCode() ^ b.hashCode() ^ c.hashCode();
	}

	private boolean equalRolled(Point oa, Point ob, Point oc) {
		return equalCorners(oa, ob, oc) || equalCorners(ob, oc, oa)
				|| equalCorners(oc, oa, ob);
	}

	private boolean equalCorners(Point oa, Point ob, Point oc) {
		return a.equals(oa) && b.equals(ob) && c.equals(oc);
	}

}
