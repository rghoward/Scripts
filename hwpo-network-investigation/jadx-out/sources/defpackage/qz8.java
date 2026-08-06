package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qz8 {
    public final mf6<ko5, String> a = new mf6<>(1000);
    public final at3.c b = at3.a(10, new a());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements at3.b<b> {
        @Override // at3.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                d55.a(e);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements at3.d {
        public final MessageDigest t;
        public final p0a.a u = new p0a.a();

        public b(MessageDigest messageDigest) {
            this.t = messageDigest;
        }

        @Override // at3.d
        public final p0a.a g() {
            return this.u;
        }
    }

    public final String a(ko5 ko5Var) {
        String strA;
        synchronized (this.a) {
            strA = this.a.a(ko5Var);
        }
        if (strA == null) {
            b bVar = (b) this.b.b();
            try {
                ko5Var.b(bVar.t);
                byte[] bArrDigest = bVar.t.digest();
                char[] cArr = l6b.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b2 = bArrDigest[i];
                        int i2 = b2 & MessagePack.Code.EXT_TIMESTAMP;
                        int i3 = i * 2;
                        char[] cArr2 = l6b.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b2 & 15];
                    }
                    strA = new String(cArr);
                }
                this.b.a(bVar);
            } catch (Throwable th) {
                this.b.a(bVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.d(ko5Var, strA);
        }
        return strA;
    }
}
