package io.intercom.android.sdk.ui.common;

import defpackage.c30;
import defpackage.e44;
import defpackage.tx2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArrangement {
    public static final int $stable = 0;
    public static final IntercomArrangement INSTANCE = new IntercomArrangement();

    private IntercomArrangement() {
    }

    public final c30.l itemAtBottom(final int i) {
        return new c30.l() { // from class: io.intercom.android.sdk.ui.common.IntercomArrangement.itemAtBottom.1
            @Override // c30.l
            public void arrange(tx2 tx2Var, int i2, int[] iArr, int[] iArr2) {
                tx2Var.getClass();
                iArr.getClass();
                iArr2.getClass();
                int i3 = i;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < length) {
                    int i7 = iArr[i4];
                    int i8 = i5 + 1;
                    if (i5 == i3) {
                        iArr2[i5] = i2 - i7;
                    } else {
                        iArr2[i5] = i6;
                        i6 += i7;
                    }
                    i4++;
                    i5 = i8;
                }
            }

            @Override // c30.l
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public /* bridge */ /* synthetic */ float mo1getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return e44.a(new StringBuilder("Arrangement#itemAtBottom("), i, ')');
            }
        };
    }
}
