package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z08 implements y08 {
    public static final z08 a = new z08();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements x08 {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // defpackage.x08
        public final long a() {
            return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
        }

        @Override // defpackage.x08
        public final void b() {
            this.a.update();
        }

        @Override // defpackage.x08
        public void c(float f, long j, long j2) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // defpackage.x08
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // defpackage.y08
    public final boolean a() {
        return false;
    }

    @Override // defpackage.y08
    public final x08 b(View view, boolean z, long j, float f, float f2, boolean z2, tx2 tx2Var, float f3) {
        return new a(new Magnifier(view));
    }
}
