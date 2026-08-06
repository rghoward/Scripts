package defpackage;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mk7<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public mk7(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            z90.a("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = t;
        this.b = bVar;
    }

    public static mk7 a(Object obj, String str) {
        return new mk7(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mk7) {
            return this.c.equals(((mk7) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return av.a(new StringBuilder("Option{key='"), this.c, "'}");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements b<Object> {
        @Override // mk7.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
