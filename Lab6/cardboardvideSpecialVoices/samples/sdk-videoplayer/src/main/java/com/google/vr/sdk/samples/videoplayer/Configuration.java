/*
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.vr.sdk.samples.videoplayer;

/**
 * Use the below flags to test different use cases.
 * With both flags set to false, the movie should play on any device.
 * With both flags set to true, the movie will play only on phones that support
 * EGL_EXT_protected_content.
 */
public class Configuration {
  // Use video sample that requires secure playback.
  public static final boolean USE_DRM_VIDEO_SAMPLE = true;

  // Create a protected asynchronous reprojection pipeline. This is required if a DRM video sample
  // is played.
  public static final boolean USE_PROTECTED_PIPELINE = USE_DRM_VIDEO_SAMPLE || true;
}
