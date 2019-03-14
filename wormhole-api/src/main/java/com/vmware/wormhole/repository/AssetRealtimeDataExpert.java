/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.repository;

import java.util.List;

import com.vmware.wormhole.common.model.RealTimeData;

public interface AssetRealtimeDataExpert {
   List<RealTimeData> getDataByIDAndTimeRange(String assetID, long starttime, int duration);
}
