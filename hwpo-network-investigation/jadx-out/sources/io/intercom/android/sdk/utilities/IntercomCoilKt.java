package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.aa0;
import defpackage.b85;
import defpackage.d85;
import defpackage.dv8;
import defpackage.ff3;
import defpackage.h4c;
import defpackage.k85;
import defpackage.l85;
import defpackage.oy0;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCoilKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.IntercomCoilKt$loadIntercomImageSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.utilities.IntercomCoilKt", f = "IntercomCoil.kt", l = {h4c.e}, m = "loadIntercomImageSuspend")
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
            return IntercomCoilKt.loadIntercomImageSuspend(null, null, this);
        }
    }

    public static final void loadIntercomImage(Context context, k85 k85Var) {
        context.getClass();
        k85Var.getClass();
        IntercomImageLoaderKt.getImageLoader(context).a(k85Var);
    }

    public static final Drawable loadIntercomImageBlocking(Context context, k85 k85Var) {
        context.getClass();
        k85Var.getClass();
        return ((l85) oy0.f(ff3.t, new d85(IntercomImageLoaderKt.getImageLoader(context), k85Var, null))).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadIntercomImageSuspend(Context context, k85 k85Var, r02<? super Drawable> r02Var) {
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
        Object objC = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(objC);
            b85 imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            anonymousClass1.label = 1;
            objC = imageLoader.c(k85Var, anonymousClass1);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        return ((l85) objC).a();
    }
}
