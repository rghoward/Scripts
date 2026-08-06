package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface yza extends yz9<Object> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements yza {
        public final Object t;
        public final boolean u = true;

        public a(Typeface typeface) {
            this.t = typeface;
        }

        @Override // defpackage.yza
        public final boolean c() {
            return this.u;
        }

        @Override // defpackage.yz9
        public final Object getValue() {
            return this.t;
        }
    }

    boolean c();
}
