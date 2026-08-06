package io.intercom.android.sdk.m5;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ci4;
import defpackage.fr1;
import defpackage.ft6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gt6;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.jt1;
import defpackage.u;
import defpackage.w7a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        w7a w7aVar;
        super.onCreate(bundle);
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i == 1) {
            w7aVar = new w7a(0, 0, 2, new gt6(2));
        } else {
            if (i != 2) {
                if (i != 3) {
                    u.b();
                    return;
                } else if ((getResources().getConfiguration().uiMode & 48) == 32) {
                    w7aVar = new w7a(0, 0, 2, new gt6(2));
                }
            }
            w7aVar = new w7a(0, 0, 1, new ft6(1));
        }
        ia3.a(this, w7aVar, w7aVar);
        iq1.a(this, new fr1(true, 1535831366, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1
            public final void invoke(jt1 jt1Var, int i2) {
                if ((i2 & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                appConfig.getClass();
                final IntercomRootActivity intercomRootActivity = IntercomRootActivity.this;
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, gr1.b(-1535408283, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity.onCreate.1.1
                    public final void invoke(jt1 jt1Var2, int i3) {
                        if ((i3 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Intent intent = intercomRootActivity.getIntent();
                        intent.getClass();
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomRootActivity, jt1Var2, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 48);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InMemoryWebViewCacheKt.clearWebViewCache();
        if (isFinishing()) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
    }
}
