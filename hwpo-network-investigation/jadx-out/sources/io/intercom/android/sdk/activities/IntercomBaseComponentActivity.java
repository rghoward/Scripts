package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.ia3;
import defpackage.uy;
import defpackage.z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomBaseComponentActivity extends uy {
    public static final int $stable = 0;

    private final Context localizedContext(Context context) {
        AppConfig appConfig = (AppConfig) z.a();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    @Override // defpackage.uy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(localizedContext(context));
    }

    @Override // androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        Injector.get().getActivityFinisher().register(this);
    }

    @Override // defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister(this);
    }
}
