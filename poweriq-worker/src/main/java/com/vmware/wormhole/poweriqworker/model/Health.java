/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.poweriqworker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Health {

   private String overall;
   private String connectivity;
   @JsonProperty(value = "connectivity_explanation")
   private String connectivityExplanation;
   private String events;
   @JsonProperty(value = "active_events_count")
   private int activeEventsCount;

   public void setOverall(String overall) {
      this.overall = overall;
   }

   public String getOverall() {
      return overall;
   }

   public void setConnectivity(String connectivity) {
      this.connectivity = connectivity;
   }

   public String getConnectivity() {
      return connectivity;
   }

   public String getConnectivityExplanation() {
      return connectivityExplanation;
   }

   public void setConnectivityExplanation(String connectivityExplanation) {
      this.connectivityExplanation = connectivityExplanation;
   }

   public String getEvents() {
      return events;
   }

   public void setEvents(String events) {
      this.events = events;
   }

   public int getActiveEventsCount() {
      return activeEventsCount;
   }

   public void setActiveEventsCount(int activeEventsCount) {
      this.activeEventsCount = activeEventsCount;
   }

}
