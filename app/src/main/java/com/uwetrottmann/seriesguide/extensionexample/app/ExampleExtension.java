package com.uwetrottmann.seriesguide.extensionexample.app;

import android.app.IntentService;
import android.support.v4.app.JobIntentService;

import com.battlelancer.seriesguide.api.SeriesGuideExtension;

/**
 * Optional: Original {@link SeriesGuideExtension} subclass, now subclass of
 * {@link ExampleExtensionService} for backwards compatibility with API v1.
 * <p>
 * Technically we could re-use the existing {@link SeriesGuideExtension} subclass. But as it is now
 * a subclass of {@link JobIntentService} (previously {@link IntentService}) it requires the
 * BIND_JOB_SERVICE permission on Android O+. This would prevent SeriesGuide from starting the
 * service. So we register {@link ExampleExtensionService} separately and keep the original service
 * component for this class in the manifest.
 */
public class ExampleExtension extends ExampleExtensionService {
}
