package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a18 implements y08 {
    public static final a18 a = new a18();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends z08.a {
        @Override // z08.a, defpackage.x08
        public final void c(float f, long j, long j2) {
            if (!Float.isNaN(f)) {
                this.a.setZoom(f);
            }
            long j3 = 9223372034707292159L & j2;
            Magnifier magnifier = this.a;
            if (j3 != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // defpackage.y08
    public final boolean a() {
        return true;
    }

    @Override // defpackage.y08
    public final x08 b(View view, boolean z, long j, float f, float f2, boolean z2, tx2 tx2Var, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long jZ1 = tx2Var.z1(j);
        float fU0 = tx2Var.U0(f);
        float fU1 = tx2Var.U0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jZ1 != 9205357640488583168L) {
            builder.setSize(wk6.b(Float.intBitsToFloat((int) (jZ1 >> 32))), wk6.b(Float.intBitsToFloat((int) (jZ1 & 4294967295L))));
        }
        if (!Float.isNaN(fU0)) {
            builder.setCornerRadius(fU0);
        }
        if (!Float.isNaN(fU1)) {
            builder.setElevation(fU1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
