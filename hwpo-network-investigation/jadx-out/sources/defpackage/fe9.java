package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe9 implements wd9<ee9> {
    public static final fe9 a = new fe9();
    public static final ee9 b = new ee9(null, null, null, null, null);

    @Override // defpackage.wd9
    public final ee9 a() {
        return b;
    }

    @Override // defpackage.wd9
    public final g2b b(Object obj, s1b s1bVar) throws IOException {
        byte[] bytes = sl5.d.c(ee9.Companion.serializer(), (ee9) obj).getBytes(ua1.b);
        bytes.getClass();
        s1bVar.t.write(bytes);
        return g2b.a;
    }

    @Override // defpackage.wd9
    public final Object c(FileInputStream fileInputStream) throws z72 {
        try {
            sl5.a aVar = sl5.d;
            String str = new String(nt.b(fileInputStream), ua1.b);
            aVar.getClass();
            return (ee9) aVar.b(ee9.Companion.serializer(), str);
        } catch (Exception e) {
            throw new z72("Cannot parse session configs", e);
        }
    }
}
