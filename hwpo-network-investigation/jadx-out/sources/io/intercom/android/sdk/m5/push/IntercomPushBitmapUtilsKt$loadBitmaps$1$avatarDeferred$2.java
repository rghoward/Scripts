package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import io.intercom.android.sdk.identity.AppConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2", f = "IntercomPushBitmapUtils.kt", l = {}, m = "invokeSuspend")
public final class IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2 extends p6a implements ci4<t72, r02<? super Bitmap>, Object> {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ String $authorName;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2(Context context, String str, AppConfig appConfig, r02<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2> r02Var) {
        super(2, r02Var);
        this.$context = context;
        this.$authorName = str;
        this.$appConfig = appConfig;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2(this.$context, this.$authorName, this.$appConfig, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Bitmap> r02Var) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarDeferred$2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label == 0) {
            dv8.b(obj);
            return IntercomPushBitmapUtilsKt.generateInitialsAvatar(this.$context, this.$authorName, this.$appConfig);
        }
        aa0.c("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
