package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import defpackage.br9;
import defpackage.cy8;
import defpackage.eva;
import defpackage.r02;
import defpackage.xx2;
import defpackage.yx2;
import defpackage.zx8;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarShapeTransformation implements eva {
    public static final int $stable = 0;
    private final AvatarShape avatarShape;

    public AvatarShapeTransformation(AvatarShape avatarShape) {
        avatarShape.getClass();
        this.avatarShape = avatarShape;
    }

    @Override // defpackage.eva
    public String getCacheKey() {
        return this.avatarShape.name() + AvatarShapeTransformation.class.getName();
    }

    @Override // defpackage.eva
    public Object transform(Bitmap bitmap, br9 br9Var, r02<? super Bitmap> r02Var) {
        zx8 composeShape = AvatarIconKt.getComposeShape(this.avatarShape);
        float width = bitmap.getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        xx2 xx2VarA = yx2.a();
        return new cy8(composeShape.a.a(jFloatToRawIntBits, xx2VarA), composeShape.b.a(jFloatToRawIntBits, xx2VarA), composeShape.d.a(jFloatToRawIntBits, xx2VarA), composeShape.c.a(jFloatToRawIntBits, xx2VarA)).transform(bitmap, br9Var, r02Var);
    }
}
