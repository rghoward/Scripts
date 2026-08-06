package io.intercom.android.sdk.utilities;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.r02;
import defpackage.s54;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z97;
import defpackage.zl9;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyClientUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.AblyClientUtilsKt$handleAblyLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.utilities.AblyClientUtilsKt", f = "AblyClientUtils.kt", l = {z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER}, m = "handleAblyLifecycle")
    public static final class AnonymousClass1 extends u02 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AblyClientUtilsKt.handleAblyLifecycle(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object handleAblyLifecycle(IntercomDataLayer intercomDataLayer, final AblyManager ablyManager, r02<? super g2b> r02Var) {
        AnonymousClass1 anonymousClass1;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(obj);
            zl9<IntercomEvent> event = intercomDataLayer.getEvent();
            s54<? super IntercomEvent> s54Var = new s54() { // from class: io.intercom.android.sdk.utilities.AblyClientUtilsKt.handleAblyLifecycle.2
                public final Object emit(IntercomEvent intercomEvent, r02<? super g2b> r02Var2) {
                    if (xj5.a(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
                        ablyManager.disconnect();
                    }
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var2) {
                    return emit((IntercomEvent) obj2, (r02<? super g2b>) r02Var2);
                }
            };
            anonymousClass1.label = 1;
            Object objCollect = event.collect(s54Var, anonymousClass1);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
