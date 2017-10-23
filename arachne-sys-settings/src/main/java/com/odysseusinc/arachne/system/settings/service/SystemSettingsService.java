/*
 *
 * Copyright 2017 Observational Health Data Sciences and Informatics
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Company: Odysseus Data Services, Inc.
 * Product Owner/Architecture: Gregory Klebanov
 * Authors: Pavel Grafkin, Alexandr Ryabokon
 * Created: April 19, 2017
 *
 */

package com.odysseusinc.arachne.system.settings.service;

import com.odysseusinc.arachne.system.settings.exception.NoSuchSystemSettingException;
import com.odysseusinc.arachne.system.settings.model.SystemSettingsGroup;
import java.util.Map;

public interface SystemSettingsService {

    Iterable<SystemSettingsGroup> getAll();

    String getDecryptedValue(String value);

    String getEncryptedValue(String value);

    void saveSystemSetting(Map<Long, String> values) throws NoSuchSystemSettingException;

    boolean isConfigChanged();
}
