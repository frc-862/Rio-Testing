// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public class LEDsConstants {
        public static final int LED_PWM_PORT = 0;
        public static final int LED_LENGTH = 12;
        public static final int LED_BUFFER_TIME = 60;

        public static final int SWRIL_SEGMENT_SIZE = 5;
        
        public static final int RED_HUE = 0;
        public static final int ORANGE_HUE = 5;
        public static final int YELLOW_HUE = 15;
        public static final int GREEN_HUE = 240;
        public static final int BLUE_HUE = 120;
        public static final int PURPLE_HUE = 315;
        public static final int PINK_HUE = 355;

        public enum LED_STATES{
            DISABLED(0),
            MIXER(1),
            COLLECTED(2), 
            SHOT(3), 
            FINISHED_CLIMB(4), 
            SHOOTING(5), 
            CHASING(6), 
            CLIMBING(7),
            HAS_PIECE(8), 
            HAS_VISION(9),
            OFF(10);

            private final int priority;
            LED_STATES(int priority) {
                this.priority = priority;
            }

            public int getPriority() {
                return priority;
            }
        }
    }
}
