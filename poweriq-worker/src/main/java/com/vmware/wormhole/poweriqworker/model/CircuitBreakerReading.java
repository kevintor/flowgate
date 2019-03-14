/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.poweriqworker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CircuitBreakerReading {

   private int id;
   @JsonProperty(value = "reading_time")
   private String readingTime;
   private Double current;
   @JsonProperty(value = "unutilized_capacity")
   private Double unutilizedCapacity;
   @JsonProperty(value = "pdu_id")
   private Integer pduId;
   @JsonProperty(value = "max_current")
   private String maxCurrent;
   @JsonProperty(value = "min_current")
   private String minCurrent;
   @JsonProperty(value = "circuit_breaker_id")
   private int circuitBreakerId;
   @JsonProperty(value = "min_unutilized_capacity")
   private String minUnutilizedCapacity;
   @JsonProperty(value = "max_unutilized_capacity")
   private String maxUnutilizedCapacity;
   @JsonProperty(value = "current_amps")
   private Double currentAmps;
   @JsonProperty(value = "max_current_amps")
   private String maxCurrentAmps;
   @JsonProperty(value = "min_current_amps")
   private String minCurrentAmps;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getReadingTime() {
      return readingTime;
   }

   public void setReadingTime(String readingTime) {
      this.readingTime = readingTime;
   }

   public Double getCurrent() {
      return current;
   }

   public void setCurrent(Double current) {
      this.current = current;
   }

   public Double getUnutilizedCapacity() {
      return unutilizedCapacity;
   }

   public void setUnutilizedCapacity(Double unutilizedCapacity) {
      this.unutilizedCapacity = unutilizedCapacity;
   }

   public Integer getPduId() {
      return pduId;
   }

   public void setPduId(Integer pduId) {
      this.pduId = pduId;
   }

   public String getMaxCurrent() {
      return maxCurrent;
   }

   public void setMaxCurrent(String maxCurrent) {
      this.maxCurrent = maxCurrent;
   }

   public String getMinCurrent() {
      return minCurrent;
   }

   public void setMinCurrent(String minCurrent) {
      this.minCurrent = minCurrent;
   }

   public int getCircuitBreakerId() {
      return circuitBreakerId;
   }

   public void setCircuitBreakerId(int circuitBreakerId) {
      this.circuitBreakerId = circuitBreakerId;
   }

   public String getMinUnutilizedCapacity() {
      return minUnutilizedCapacity;
   }

   public void setMinUnutilizedCapacity(String minUnutilizedCapacity) {
      this.minUnutilizedCapacity = minUnutilizedCapacity;
   }

   public String getMaxUnutilizedCapacity() {
      return maxUnutilizedCapacity;
   }

   public void setMaxUnutilizedCapacity(String maxUnutilizedCapacity) {
      this.maxUnutilizedCapacity = maxUnutilizedCapacity;
   }

   public Double getCurrentAmps() {
      return currentAmps;
   }

   public void setCurrentAmps(Double currentAmps) {
      this.currentAmps = currentAmps;
   }

   public String getMaxCurrentAmps() {
      return maxCurrentAmps;
   }

   public void setMaxCurrentAmps(String maxCurrentAmps) {
      this.maxCurrentAmps = maxCurrentAmps;
   }

   public String getMinCurrentAmps() {
      return minCurrentAmps;
   }

   public void setMinCurrentAmps(String minCurrentAmps) {
      this.minCurrentAmps = minCurrentAmps;
   }

}
