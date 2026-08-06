package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iv2 extends nab {
    public DecimalFormat a;

    public iv2(int i) {
        b(i);
    }

    @Override // defpackage.nab
    public final String a(float f) {
        return this.a.format(f);
    }

    public final void b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
