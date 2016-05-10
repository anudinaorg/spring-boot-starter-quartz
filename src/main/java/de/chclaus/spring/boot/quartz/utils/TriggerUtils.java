package de.chclaus.spring.boot.quartz.utils;

import de.chclaus.spring.boot.quartz.triggers.QuartzSimpleTrigger;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;

import java.util.Date;

/**
 * Utils class to generate some useful default triggers.
 *
 * @author Christian Claus (ch.claus@me.com)
 */
public class TriggerUtils {

  public static Trigger createSingleshotTrigger(String triggerName, long delay) {
    return QuartzSimpleTrigger.builder()
        .misfireInstruction(SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW)
        .startTime(new Date(System.currentTimeMillis() + delay))
        .repeatCount(0)
        .name(triggerName)
        .repeatCount(0)
        .build();
  }
}
