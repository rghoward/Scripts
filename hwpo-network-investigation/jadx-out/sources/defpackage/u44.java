package defpackage;

import android.os.Bundle;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u44 extends m77<Float> {
    @Override // defpackage.m77
    public final Float get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return AttributeType.FLOAT;
    }

    @Override // defpackage.m77
    public final Float parseValue(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Float f) {
        float fFloatValue = f.floatValue();
        bundle.getClass();
        str.getClass();
        bundle.putFloat(str, fFloatValue);
    }
}
