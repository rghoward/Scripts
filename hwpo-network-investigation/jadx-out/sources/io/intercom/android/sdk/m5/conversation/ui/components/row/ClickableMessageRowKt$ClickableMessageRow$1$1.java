package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.g2b;
import defpackage.i58;
import defpackage.mh4;
import defpackage.o8a;
import defpackage.oh4;
import defpackage.r02;
import defpackage.v72;
import defpackage.vf7;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClickableMessageRowKt$ClickableMessageRow$1$1 implements PointerInputEventHandler {
    final /* synthetic */ mh4<g2b> $onClick;
    final /* synthetic */ mh4<g2b> $onLongClick;

    public ClickableMessageRowKt$ClickableMessageRow$1$1(mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
        this.$onLongClick = mh4Var;
        this.$onClick = mh4Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$0(mh4 mh4Var, vf7 vf7Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1(mh4 mh4Var, vf7 vf7Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.intercom.android.sdk.m5.conversation.ui.components.row.e] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        final mh4<g2b> mh4Var = this.$onLongClick;
        ?? r2 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.e
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$0(mh4Var, (vf7) obj);
            }
        };
        final mh4<g2b> mh4Var2 = this.$onClick;
        Object objD = o8a.d(i58Var, r2, null, new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$1(mh4Var2, (vf7) obj);
            }
        }, r02Var, 5);
        return objD == v72.t ? objD : g2b.a;
    }
}
