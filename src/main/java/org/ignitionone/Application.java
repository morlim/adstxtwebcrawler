/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * @author Shridhar Manvi <Shridhar.Manvi AT ignitionone DOT com>
 * @author Roderick Rodriguez <Roderick.Rodriguez AT ignitionone DOT com>
 */
package org.ignitionone;

import org.ignitionone.configuration.ConfigBuilder;
import org.ignitionone.service.AdsTxtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("Starting...");
        AdsTxtService adsTxtService = new AdsTxtService(ConfigBuilder.getConfig());
        adsTxtService.executionDirector();
        LOG.info("Completed");
    }
}
