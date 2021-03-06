// Copyright (C) GridGain Systems Licensed under GPLv3, http://www.gnu.org/licenses/gpl.html

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.editions;

import org.gridgain.grid.*;

/**
 * This exception is thrown whenever enterprise feature is being used
 * in community edition.
 *
 * @author 2012 Copyright (C) GridGain Systems
 * @version 3.6.0c.13012012
 */
public class GridEnterpriseFeatureException extends GridRuntimeException {
    /**
     * Constructs enterprise-only grid exception with default message.
     */
    public GridEnterpriseFeatureException() {
        super("This feature is supported in Enterprise Edition only.");
    }

    /**
     * Constructs enterprise-only grid exception with default message.
     *
     * @param feature Feature that is not supported in community edition.
     */
    public GridEnterpriseFeatureException(String feature) {
        super("Feature '" + feature + "' is supported in Enterprise Edition only.");
    }
}
