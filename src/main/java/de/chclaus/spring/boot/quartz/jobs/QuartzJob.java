package de.chclaus.spring.boot.quartz.jobs;

import org.quartz.JobDetail;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

import java.util.HashMap;
import java.util.Map;

/**
 * A builder to generate quartz jobs.
 *
 * @author Christian Claus (ch.claus@me.com)
 */
public class QuartzJob {

  public static QuartzJobBuilder builder() {
    return new QuartzJobBuilder();
  }

  public static class QuartzJobBuilder {
    private final JobDetailFactoryBean jobDetailFactoryBean;
    private Map<String, Object> jobDataMap;

    public QuartzJobBuilder() {
      jobDetailFactoryBean = new JobDetailFactoryBean();
      jobDataMap = new HashMap<>();
    }

    public QuartzJobBuilder name(String name) {
      jobDetailFactoryBean.setName(name);
      return this;
    }

    public QuartzJobBuilder group(String group) {
      jobDetailFactoryBean.setGroup(group);
      return this;
    }

    public QuartzJobBuilder description(String description) {
      jobDetailFactoryBean.setDescription(description);
      return this;
    }

    public QuartzJobBuilder jobClass(Class<?> clazz) {
      jobDetailFactoryBean.setJobClass(clazz);
      return this;
    }

    public QuartzJobBuilder durability(boolean durability) {
      jobDetailFactoryBean.setDurability(durability);
      return this;
    }

    public QuartzJobBuilder requestRecovery(boolean requestRecovery) {
      jobDetailFactoryBean.setRequestsRecovery(requestRecovery);
      return this;
    }

    public QuartzJobBuilder putJobData(String key, int value) {
      jobDataMap.put(key, Integer.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, long value) {
      jobDataMap.put(key, Long.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, float value) {
      jobDataMap.put(key, Float.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, double value) {
      jobDataMap.put(key, Double.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, boolean value) {
      jobDataMap.put(key, Boolean.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, char value) {
      jobDataMap.put(key, Character.valueOf(value));
      return this;
    }

    public QuartzJobBuilder putJobData(String key, String value) {
      jobDataMap.put(key, value);
      return this;
    }

    public QuartzJobBuilder putJobData(String key, Object value) {
      jobDataMap.put(key, value);
      return this;
    }

    public JobDetail build() {
      jobDetailFactoryBean.afterPropertiesSet();
      final JobDetail jobDetail = jobDetailFactoryBean.getObject();
      jobDetail.getJobDataMap().putAll(jobDataMap);
      return jobDetail;
    }

  }
}
