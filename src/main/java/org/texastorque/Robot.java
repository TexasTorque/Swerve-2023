/**
 * Copyright 2023 Texas Torque.
 * 
 * This file is part of Swerve-2023, which is not licensed for distribution.
 * For more details, see ./license.txt or write <jus@justusl.com>.
 */
package org.texastorque;

import org.texastorque.auto.AutoManager;
import org.texastorque.torquelib.auto.TorqueAutoManager.TorqueBlankAutoManager;
import org.texastorque.torquelib.base.*;

public final class Robot extends TorqueRobotBase implements Subsystems {
    public Robot() {
        super(Input.getInstance(), AutoManager.getInstance());

        addSubsystem(drivebase);
    }
}
