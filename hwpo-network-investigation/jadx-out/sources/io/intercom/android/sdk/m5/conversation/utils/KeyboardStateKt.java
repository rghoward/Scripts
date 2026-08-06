package io.intercom.android.sdk.m5.conversation.utils;

import android.view.View;
import defpackage.bl7;
import defpackage.fnb;
import defpackage.h37;
import defpackage.jt1;
import defpackage.qu1;
import defpackage.tx2;
import defpackage.xj5;
import defpackage.yz9;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class KeyboardStateKt {
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public static final yz9<KeyboardState> keyboardAsState(jt1 jt1Var, int i) {
        boolean z;
        jt1Var.K(-1867236611);
        jt1Var.K(-137398301);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = bl7.i(null);
            jt1Var.C(objF);
        }
        h37 h37Var = (h37) objF;
        jt1Var.B();
        tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        WeakHashMap<View, fnb> weakHashMap = fnb.w;
        int i2 = fnb.a.c(jt1Var).c.e().d;
        int i3 = fnb.a.c(jt1Var).c.e().d - fnb.a.c(jt1Var).e.e().d;
        int i4 = i3 < 0 ? 0 : i3;
        boolean z2 = i2 > 0;
        boolean zA = xj5.a(fnb.a.c(jt1Var).s, fnb.a.c(jt1Var).r);
        boolean z3 = !zA;
        float fU0 = tx2Var.U0(2.0f);
        if (z2) {
            if (!zA) {
                KeyboardState keyboardStateKeyboardAsState$lambda$1 = keyboardAsState$lambda$1(h37Var);
                if ((keyboardStateKeyboardAsState$lambda$1 != null ? keyboardStateKeyboardAsState$lambda$1.getBottomDiff() : 0) - i2 >= fU0) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = true;
        }
        KeyboardState keyboardState = new KeyboardState(z3, i2, z2, z, i4);
        h37Var.setValue(keyboardState);
        h37 h37VarJ = bl7.j(keyboardState, jt1Var);
        jt1Var.B();
        return h37VarJ;
    }

    private static final KeyboardState keyboardAsState$lambda$1(h37<KeyboardState> h37Var) {
        return h37Var.getValue();
    }
}
