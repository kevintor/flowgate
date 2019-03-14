/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.common.model;

import java.util.List;

public class PrivilegeResourceMapping {

   private String id;
   private String privilegeName;
   private List<WormholeResources> resource;
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPrivilegeName() {
      return privilegeName;
   }
   public void setPrivilegeName(String privilegeName) {
      this.privilegeName = privilegeName;
   }
   public List<WormholeResources> getResource() {
      return resource;
   }
   public void setResource(List<WormholeResources> resource) {
      this.resource = resource;
   }
   
   
}
