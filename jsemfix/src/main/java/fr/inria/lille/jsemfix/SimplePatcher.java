/*
 * Copyright (C) 2013 INRIA
 *
 * This software is governed by the CeCILL-C License under French law and
 * abiding by the rules of distribution of free software. You can use, modify
 * and/or redistribute the software under the terms of the CeCILL-C license as
 * circulated by CEA, CNRS and INRIA at http://www.cecill.info.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C license and that you accept its terms.
 */
package fr.inria.lille.jsemfix;

import static fr.inria.lille.jsemfix.Patch.NO_PATCH;

import java.util.Set;

import fr.inria.lille.jsemfix.sps.Statement;
import fr.inria.lille.jsemfix.test.Test;

/**
 * @author Favio D. DeMarco
 * 
 */
final class SimplePatcher implements Patcher {

	private final Statement rootCause;

	SimplePatcher(final Statement rc) {
		this.rootCause = rc;
	}

	/**
	 * @see fr.inria.lille.jsemfix.Patcher#createPatch(java.util.Set)
	 */
	@Override
	public Patch createPatch(final Set<Test> s) {
		RepairConstraint c = this.generateRepairConstraint(s);
		Patch newRepair;
		Level level = Level.CONSTANTS;
		do {
			newRepair = this.synthesize(c, level);
			level = level.next();
		} while (newRepair == NO_PATCH && level != Level.LOGIC_COMPARISON_ITERATION);
		return newRepair;
	}

	private Patch synthesize(final RepairConstraint c, final Level level) {
		// TODO Auto-generated method stub
		// return null;
		throw new UnsupportedOperationException("SimplePatcher.synthesize");
	}

	private RepairConstraint generateRepairConstraint(final Set<Test> s) {
		// TODO Auto-generated method stub
		// return null;
		throw new UnsupportedOperationException("SimplePatcher.generateRepairConstraint");
	}
}
