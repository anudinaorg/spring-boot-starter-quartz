package de.chclaus.spring.boot.quartz.triggers;

import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;

/**
 * A builder to generate simple triggers on a easy way.
 *
 * @author Christian Claus (ch.claus@me.com)
 */
public class QuartzSimpleTrigger {

  public static SimpleTriggerBuilder builder() {
    return new SimpleTriggerBuilder();
  }

  public static class SimpleTriggerBuilder {
    private SimpleTriggerImpl instance;

    public SimpleTriggerBuilder() {
      instance = new SimpleTriggerImpl();
    }

    public SimpleTriggerBuilder misfireInstruction(int misfireInstruction) {
      instance.setMisfireInstruction(misfireInstruction);
      return this;
    }

    public SimpleTriggerBuilder startTime(Date startTime) {
      instance.setStartTime(startTime);
      return this;
    }

    public SimpleTriggerBuilder endTime(Date endTime) {
      instance.setEndTime(endTime);
      return this;
    }

    public SimpleTriggerBuilder nextFireTime(Date nextFireTime) {
      instance.setNextFireTime(nextFireTime);
      return this;
    }

    public SimpleTriggerBuilder previousFireTime(Date previousFireTime) {
      instance.setPreviousFireTime(previousFireTime);
      return this;
    }

    public SimpleTriggerBuilder repeatInterval(long repeatInterval) {
      instance.setRepeatInterval(repeatInterval);;
      return this;
    }

    public SimpleTriggerBuilder timesTriggered(int timesTriggered) {
      instance.setTimesTriggered(timesTriggered);
      return this;
    }

    public SimpleTriggerBuilder repeatCount(int repeatCount) {
      instance.setRepeatCount(repeatCount);
      return this;
    }

    public SimpleTriggerBuilder name(String name) {
      instance.setName(name);
      return this;
    }

    public SimpleTriggerImpl build() {
      return instance;
    }
  }
}
