package io.intercom.android.sdk.m5.bubble;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.jt1;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBubbleActivity extends dq1 {
    public static final int $stable = 0;

    @Override // defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        iq1.a(this, new fr1(true, 947575690, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                } else {
                    final IntercomBubbleActivity intercomBubbleActivity = IntercomBubbleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-397450188, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity.onCreate.1.1
                        public final void invoke(jt1 jt1Var2, int i2) {
                            if ((i2 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Intent intent = intercomBubbleActivity.getIntent();
                            intent.getClass();
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomBubbleActivity, jt1Var2, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var), jt1Var, 3072, 7);
                }
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }
}
