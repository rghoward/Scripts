package io.intercom.android.sdk.ui.component;

import defpackage.ci4;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.ox6;
import defpackage.oy8;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$IntercomTopBarKt {
    public static final ComposableSingletons$IntercomTopBarKt INSTANCE = new ComposableSingletons$IntercomTopBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f380lambda1 = new fr1(false, 1581505149, ComposableSingletons$IntercomTopBarKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f381lambda2 = new fr1(false, 697934641, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                IntercomTopBarKt.m589IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, null, jt1Var, 48, 253);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f382lambda3 = new fr1(false, 323337919, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                m65.b(is7.a(R.drawable.intercom_ic_download, jt1Var, 0), null, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var, 6).m771getOnHeader0d7_KjU(), jt1Var, 440, 0);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ei4<oy8, jt1, Integer, g2b> f383lambda4 = new fr1(false, -2021873251, ComposableSingletons$IntercomTopBarKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f384lambda5 = new fr1(false, -1858201762, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-5$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                IntercomTopBarKt.m589IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m563getLambda4$intercom_sdk_ui_release(), jt1Var, 12582960, 125);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m560getLambda1$intercom_sdk_ui_release() {
        return f380lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m561getLambda2$intercom_sdk_ui_release() {
        return f381lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m562getLambda3$intercom_sdk_ui_release() {
        return f382lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_ui_release, reason: not valid java name */
    public final ei4<oy8, jt1, Integer, g2b> m563getLambda4$intercom_sdk_ui_release() {
        return f383lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_ui_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m564getLambda5$intercom_sdk_ui_release() {
        return f384lambda5;
    }
}
