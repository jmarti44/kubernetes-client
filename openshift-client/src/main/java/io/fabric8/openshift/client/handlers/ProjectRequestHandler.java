/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.openshift.client.handlers;

import com.squareup.okhttp.OkHttpClient;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ResourceHandler;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.ProjectRequest;
import io.fabric8.openshift.client.OpenShiftConfig;
import io.fabric8.openshift.client.dsl.internal.ProjectRequestsOperationImpl;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component
@Service
public class ProjectRequestHandler implements ResourceHandler<ProjectRequest> {
  @Override
  public String getKind() {
    return Project.class.getSimpleName();
  }

  @Override
  public ProjectRequest create(OkHttpClient client, Config config, String namespace, ProjectRequest item) {
      return new ProjectRequestsOperationImpl(client, OpenShiftConfig.wrap(config), null, item).create();
  }

  @Override
  public Boolean delete(OkHttpClient client, Config config, String namespace, ProjectRequest item) {
    throw new UnsupportedOperationException();
  }
}
