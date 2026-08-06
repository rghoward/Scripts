package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ym6 {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ym6 {
        @Override // defpackage.ym6
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.ym6
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.ym6
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
