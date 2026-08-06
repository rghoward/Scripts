package defpackage;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xq implements bu8 {
    public final Context a;

    public xq(Context context) {
        this.a = context;
    }

    @Override // defpackage.bu8
    public final int a(int i) {
        return this.a.getColor(i);
    }

    @Override // defpackage.bu8
    public final String b(int i, Object... objArr) {
        boolean z = objArr.length == 0;
        Context context = this.a;
        if (z) {
            String string = context.getResources().getString(i);
            string.getClass();
            return string;
        }
        String string2 = context.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
        string2.getClass();
        return string2;
    }

    @Override // defpackage.bu8
    public final String c(int i, int i2, Object... objArr) {
        boolean z = objArr.length == 0;
        Context context = this.a;
        if (z) {
            String quantityString = context.getResources().getQuantityString(i, i2);
            quantityString.getClass();
            return quantityString;
        }
        String quantityString2 = context.getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        quantityString2.getClass();
        return quantityString2;
    }

    @Override // defpackage.bu8
    public final float d(int i) {
        return this.a.getResources().getDimension(i);
    }
}
