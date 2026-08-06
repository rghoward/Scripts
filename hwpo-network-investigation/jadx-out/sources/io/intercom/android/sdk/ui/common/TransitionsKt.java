package io.intercom.android.sdk.ui.common;

import defpackage.oh4;
import defpackage.th3;
import defpackage.xv;
import defpackage.zg3;
import io.intercom.android.sdk.ui.common.TransitionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TransitionsKt {
    public static final th3 floatingButtonEnterTransition(final int i) {
        return zg3.e(null, 0.8f, 5).b(zg3.i(xv.b(0.75f, 500.0f, null, 4), new oh4() { // from class: ywa
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return Integer.valueOf(TransitionsKt.floatingButtonEnterTransition$lambda$0(i, ((Integer) obj).intValue()));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int floatingButtonEnterTransition$lambda$0(int i, int i2) {
        return i2 + i;
    }
}
