/*
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.process.fabric.commands;

import org.apache.felix.gogo.commands.Command;
import io.fabric8.process.manager.Installation;

/**
 */
@Command(name = "process-start", scope = "fabric", description = "Starts a managed process")
public class Start extends ContainerProcessControllerSupport {
    @Override
    protected void doControlCommand(Installation installation) throws Exception {
        installation.getController().start();
    }
}
